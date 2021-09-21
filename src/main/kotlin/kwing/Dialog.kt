package kwing

import java.awt.Component
import java.awt.Container
import javax.swing.Icon
import javax.swing.ImageIcon
import javax.swing.JOptionPane

// JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.WARNING_MESSAGE, JOptionPane.QUESTION_MESSAGE or JOptionPane.PLAIN_MESSAGE
enum class DialogMessageType {
    ERROR, INFORMATION, WARNING, QUESTION, PLAIN;
    fun toJOption(): Int = when (this) {
        ERROR       -> JOptionPane.ERROR_MESSAGE
        INFORMATION -> JOptionPane.INFORMATION_MESSAGE
        WARNING     -> JOptionPane.WARNING_MESSAGE
        QUESTION    -> JOptionPane.QUESTION_MESSAGE
        PLAIN       -> JOptionPane.PLAIN_MESSAGE
    }
}

// INTERNAL y/n
enum class DialogType {
    MESSAGE, CONFIRM
}

fun Container.dialog(title: String, dialogMessageType: DialogMessageType, type: DialogType, internal: Boolean = false, setup: ComponentSetup<Panel>? = null) {
    val panel = Panel()
    if (setup != null) setup(panel)
    when (type) {
        DialogType.MESSAGE -> {
            if (internal) {
                JOptionPane.showInternalMessageDialog(this, panel, title, dialogMessageType.toJOption())
            }
            else {
                JOptionPane.showMessageDialog(this, panel, title, dialogMessageType.toJOption())
            }
        }
        DialogType.CONFIRM -> {
            if (internal) {
                JOptionPane.showInternalConfirmDialog(this, panel, title, dialogMessageType.toJOption())
            }
            else {
                JOptionPane.showConfirmDialog(this, panel, title, dialogMessageType.toJOption())
            }
        }
    }
}