import java.awt.event.ActionListener
import javax.swing.AbstractButton

/**
 * Shortcut for [AbstractButton.addActionListener]
 */
fun AbstractButton.onClick(listener: ActionListener) = this.addActionListener(listener)