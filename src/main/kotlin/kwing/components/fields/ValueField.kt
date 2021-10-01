package kwing.components.fields

import kwing.events.onFocusLost
import kwing.events.onKeyReleased
import javax.swing.JTextField

abstract class ValueField<T>(value: T, columns: Int): JTextField(value.toString(), columns) {
    private var previousText: String

    /**
     * This function is called as condition for veto-ing the new value for the field.
     */
    abstract fun verifyInput(text: String): Boolean

    /**
     * This value can be overridden when the class should use this value as fallback when the [ValueField] is empty,
     * otherwise an empty field is seen as invalid if not explicitly allowed in [verifyInput].
     */
    open val emptyFieldFallback: T? = null

    init {
        previousText = text
        onKeyReleased { inputCheck() }
        onFocusLost {
            if (super.getText().isBlank()) text = emptyFieldFallback.toString()
        }
    }

    // This checks if the input is valid
    private fun inputCheck() {
        if (emptyFieldFallback != null && text.isBlank() || verifyInput(text))
            previousText = text
        else
            text = previousText
    }

    override fun setText(t: String) {
        super.setText(t)
        inputCheck()
    }

    override fun getText(): String {
        val text = super.getText()
        return if (emptyFieldFallback != null && text.isBlank())
            emptyFieldFallback.toString()
        else
            text
    }
}