package kwing.events

import java.awt.Component
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.awt.event.MouseAdapter

/**
 * Allows you to add an action with a lambda instead of a creating you own [KeyAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Component.onKeyPressed(crossinline onKeyPressedAction: (KeyEvent) -> Unit) {
    addKeyListener(object : KeyAdapter() {
        override fun keyPressed(e: KeyEvent) {
            onKeyPressedAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [KeyAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Component.onKeyReleased(crossinline onKeyReleasedAction: (KeyEvent) -> Unit) {
    addKeyListener(object : KeyAdapter() {
        override fun keyReleased(e: KeyEvent) {
            onKeyReleasedAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [KeyAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Component.onKeyTyped(crossinline onKeyTypedAction: (KeyEvent) -> Unit) {
    addKeyListener(object : KeyAdapter() {
        override fun keyTyped(e: KeyEvent) {
            onKeyTypedAction(e)
        }
    })
}