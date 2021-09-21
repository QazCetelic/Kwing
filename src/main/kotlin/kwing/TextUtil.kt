package kwing

import java.awt.Point
import java.util.concurrent.TimeUnit
import javax.swing.event.CaretEvent
import javax.swing.event.CaretListener
import javax.swing.text.JTextComponent
import kotlin.concurrent.thread

fun JTextComponent.onCaretAction(lambda: (CaretEvent) -> Unit) {
    thread {
        TimeUnit.MILLISECONDS.sleep(50)
        this.addCaretListener(lambda)
    }
}

var JTextComponent.lines: List<String>
    get() {
        return text.split("\n")
    }
    set(value) {
        text = value.joinToString(prefix = "", postfix = "", separator = "\n")
    }

fun JTextComponent.caretLocation(dot: Int): Point {
    if ((dot > text.length) || (dot < 0)) throw Exception("Invalid dot")
    var lines = 0
    var chars = 0
    for (char in text.substring(0 until dot)) {
        chars += 1
        // if char == \n
        if (char.toInt() == 10) {
            lines += 1
            chars = 0
        }
    }
    return Point(chars, lines + 1)
}