package kwing.events

import java.awt.Container
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseWheelEvent

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 * 
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMouseClick(crossinline mouseClickedAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            mouseClickedAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMouseDrag(crossinline mouseDraggedAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseDragged(e: MouseEvent) {
            mouseDraggedAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMouseMove(crossinline mouseMoveAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseMoved(e: MouseEvent) {
            mouseMoveAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMouseWheelMove(crossinline mouseWheelMoveAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseWheelMoved(e: MouseWheelEvent) {
            mouseWheelMoveAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMouseEnter(crossinline mouseEnterAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseEntered(e: MouseEvent) {
            mouseEnterAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMouseExit(crossinline mouseMouseExitAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseExited(e: MouseEvent) {
            mouseMouseExitAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMousePressed(crossinline mousePressedAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mousePressed(e: MouseEvent) {
            mousePressedAction(e)
        }
    })
}

/**
 * Allows you to add an action with a lambda instead of a creating you own [MouseAdapter] class,
 * overriding the inline function you want to trigger something on and adding your code there.
 *
 * This is done by doing the latter, but here instead of in your code using an inline function, to prevent overhead.
 */
inline fun Container.onMouseReleased(crossinline mouseReleasedAction: (MouseEvent) -> Unit) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseReleased(e: MouseEvent) {
            mouseReleasedAction(e)
        }
    })
}