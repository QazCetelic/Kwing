package kwing.events.components

import java.awt.event.ActionEvent
import javax.swing.AbstractButton

fun AbstractButton.onPress(onButtonPressAction: (ActionEvent) -> Unit) {
    this.addActionListener(onButtonPressAction)
}