package kwing.events.components

import java.awt.event.FocusAdapter
import javax.swing.JList
import javax.swing.event.ListSelectionEvent

fun <T> JList<T>.onListSelect(onListSelectAction: (ListSelectionEvent) -> Unit) {
    this.addListSelectionListener(onListSelectAction)
}