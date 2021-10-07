package kwing.events

import java.awt.Component
import java.awt.event.FocusAdapter
import java.awt.event.FocusEvent
import java.awt.event.KeyAdapter

/**
 * Allows you to add an action with a lambda instead of a creating you own [FocusAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Component.onFocusGained(crossinline onFocusGainedAction: (FocusEvent) -> Unit) {
    addFocusListener(object : FocusAdapter() {
        override fun focusGained(e: FocusEvent) {
            onFocusGainedAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [FocusAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Component.onFocusLost(crossinline onFocusLostAction: (FocusEvent) -> Unit) {
    addFocusListener(object : FocusAdapter() {
        override fun focusLost(e: FocusEvent) {
            onFocusLostAction(e)
        }
    })
}