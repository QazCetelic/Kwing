package kwing.events

import javax.swing.JList
import javax.swing.event.ListSelectionEvent
import javax.swing.event.ListSelectionListener
import javax.swing.plaf.basic.BasicListUI

fun <T> JList<T>.onListSelect(onListSelectAction: (ListSelectionEvent) -> Unit) {
    this.addListSelectionListener {
        onListSelectAction(it)
    }
}