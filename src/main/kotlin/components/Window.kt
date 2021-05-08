package components

import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.WindowConstants

fun Window(
    title: String? = null,
    dimension: Dimension = Dimension(200, 200),
    closeOperation: CloseOperation = CloseOperation.EXIT,
    setupLambda: JFrame.() -> Unit = {},
): JFrame {
    val window = JFrame()
    if (title != null) window.title = title
    window.size = dimension
    window.apply(setupLambda)
    return window
}

/**
 * Uses these instead of int's like [WindowConstants]
 */
enum class CloseOperation(val number: Int) {
    EXIT(WindowConstants.EXIT_ON_CLOSE),
    HIDE(WindowConstants.HIDE_ON_CLOSE),
    DISPOSE(WindowConstants.DISPOSE_ON_CLOSE),
    NOTHING(WindowConstants.DO_NOTHING_ON_CLOSE)
}