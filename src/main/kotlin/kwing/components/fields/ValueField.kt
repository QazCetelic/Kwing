package kwing.components.fields

import kwing.events.onKeyReleased
import javax.swing.JTextField

abstract class ValueField(value: Any): JTextField(value.toString()) {
    private var previousText: String

    /**
     * This function is called as condition for veto-ing the new value for the field.
     */
    abstract fun verifyInput(text: String): Boolean

    init {
        previousText = text
        onKeyReleased { inputCheck() }
    }

    // This checks if the input is valid
    private fun inputCheck() {
        if (verifyInput(text))
            previousText = text
        else
            text = previousText
    }

    override fun setText(t: String) {
        super.setText(t)
        inputCheck()
    }
}