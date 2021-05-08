package components

import java.awt.Container
import java.awt.event.ActionEvent
import javax.swing.*

class Button(text: String, defaultClickEvent: (ActionEvent) -> Unit = {}): JButton() {
    init {
        this.text = text
        if (defaultClickEvent != {}) addActionListener(defaultClickEvent)
    }
}

fun Container.button(text: String, defaultClickEvent: (ActionEvent) -> Unit = {}): Button {
    val button = Button(text, defaultClickEvent)
    this.add(button)
    return button
}