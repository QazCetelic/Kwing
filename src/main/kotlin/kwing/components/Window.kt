package kwing.components

import kwing.adjustLookAndFeel
import kwing.ComponentSetup
import kwing.Window
import java.awt.Container
import java.awt.Dimension
import java.awt.Frame
import javax.swing.JFrame
import javax.swing.WindowConstants

fun Window(
    title: String? = null,
    dimension: Dimension = Dimension(200, 200),
    closeOperation: CloseOperation = CloseOperation.EXIT,
    adjustLookAndFeel: Boolean = true,
    setup: ComponentSetup<Window> = {},
): kwing.Window {
    if (adjustLookAndFeel) adjustLookAndFeel()
    val window = JFrame()
    if (title != null) window.title = title
    window.size = dimension
    setup(window)
    return window
}

/**
 * Uses these instead of int's like [WindowConstants]
 */
enum class CloseOperation(val number: Int) {
    EXIT(WindowConstants.EXIT_ON_CLOSE),
    HIDE(WindowConstants.HIDE_ON_CLOSE),
    DISPOSE(WindowConstants.DISPOSE_ON_CLOSE),
    NOTHING(WindowConstants.DO_NOTHING_ON_CLOSE);

    fun JFrame.onClose(closeOperation: CloseOperation) {
        this.defaultCloseOperation = closeOperation.number
    }
}