package kwing.events

import java.awt.Component
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent

fun Component.onKeyPressed(onKeyPressedAction: (KeyEvent) -> Unit) {
    addKeyListener(object : KeyAdapter() {
        override fun keyPressed(e: KeyEvent) {
            onKeyPressedAction(e)
        }
    })
}

fun Component.onKeyReleased(onKeyReleasedAction: (KeyEvent) -> Unit) {
    addKeyListener(object : KeyAdapter() {
        override fun keyReleased(e: KeyEvent) {
            onKeyReleasedAction(e)
        }
    })
}

fun Component.onKeyTyped(onKeyTypedAction: (KeyEvent) -> Unit) {
    addKeyListener(object : KeyAdapter() {
        override fun keyTyped(e: KeyEvent) {
            onKeyTypedAction(e)
        }
    })
}