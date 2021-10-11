package kwing.components

import neatlin.collections.string.get
import java.awt.Point
import java.util.concurrent.TimeUnit
import javax.swing.event.CaretEvent
import javax.swing.text.JTextComponent
import kotlin.concurrent.thread

fun JTextComponent.onCaretMove(lambda: (CaretEvent) -> Unit) {
    // TODO fix this monstrosity
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

// There really should be a better way to do this, but there isn't…
fun JTextComponent.caretLocation(): Point {
    var rows = 0
    var columns = 0
    for (char in text[0 until caret.dot]) {
        columns += 1
        if (char == '\n') {
            rows += 1
            columns = 0
        }
    }
    return Point(columns, rows + 1)
}