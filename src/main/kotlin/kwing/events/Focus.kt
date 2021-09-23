package kwing.events

import java.awt.Component
import java.awt.event.FocusAdapter
import java.awt.event.FocusEvent

fun Component.onFocusGained(onFocusGainedAction: (FocusEvent) -> Unit) {
    addFocusListener(object : FocusAdapter() {
        override fun focusGained(e: FocusEvent) {
            onFocusGainedAction(e)
        }
    })
}

fun Component.onFocusLost(onFocusLostAction: (FocusEvent) -> Unit) {
    addFocusListener(object : FocusAdapter() {
        override fun focusLost(e: FocusEvent) {
            onFocusLostAction(e)
        }
    })
}