package components

import java.awt.Container
import java.awt.Dimension
import javax.swing.JComponent
import javax.swing.JLabel

class Text(text: String, size: Dimension? = null) : JLabel(text) {
    init {
        if (size != null) this.size = size
    }
}

fun Container.text(text: String, size: Dimension? = null): JLabel {
    val textComponent = Text(text, size)
    this.add(textComponent)
    return textComponent
}