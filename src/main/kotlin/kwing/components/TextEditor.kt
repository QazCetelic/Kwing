package kwing.components

import kwing.Text
import kwing.TextField
import kwing.components.layout.Horizontal
import kwing.components.layout.Vertical
import kwing.onCaretAction
import java.awt.Dimension
import java.awt.Rectangle
import java.awt.event.KeyEvent
import javax.swing.border.EmptyBorder

class TextEditorLinesAccessor internal constructor()
class TextEditor() : Vertical() {
    private val lineComponents = mutableListOf<Line>()

    var currentLine = 1
    var currentChar = 1

    val lines = TextEditorLinesAccessor()
    operator fun TextEditorLinesAccessor.set(index: Int, text: String) {
        lineComponents[index].lineText.text = text
    }
    operator fun TextEditorLinesAccessor.get(index: Int): String {
        return lineComponents[index].lineText.text
    }
    fun TextEditorLinesAccessor.add(string: String) {
        lineComponents.add(Line(lineComponents.size, string).apply {
            lineText.onKeyPressed {
                typeAction(it, lineText, index)
            }
            lineText.onFocusGained {
                currentLine = index + 1
            }
            lineText.onCaretAction {
                currentChar = it.dot

                println("$currentLine:$currentChar")
            }
        })
    }
    fun TextEditorLinesAccessor.remove(index: Int) {
        lineComponents.removeAt(index)
        updateLines()
    }
    fun TextEditorLinesAccessor.getStrings(): List<String> {
        val lineList = mutableListOf<String>()
        for (lineComponent in lineComponents) {
            lineList += lineComponent.lineText.text
        }
        return lineList
    }

    init {
        add(Text("It renders right?"))
        lines.add("Hello")
        lines.add("Hello")
        lines.add("Hello")
        println(lineComponents)
        updateLines()
    }

    fun typeAction(keyEvent: KeyEvent, text: TextField, index: Int) {
        if (keyEvent.keyCode == KeyEvent.VK_BACK_SPACE) {
            println("Pressed back space")
            println(text.text)
            if (currentChar == 0) {
                println("index: $index")
                lines.remove(index)
            }
        }
    }

    fun updateLines() {
        println("update lines")
        for (line in components) remove(line)
        for (lineIndex in lineComponents.indices) {
            Horizontal {
                add(lineComponents[lineIndex].lineCount)
                add(lineComponents[lineIndex].lineText)
            }
        }
    }

    class Line(var index: Int, text: String): Horizontal() {
        val lineCount   = Text(" ${index + 1} ").apply {
            minimumSize = Dimension(60, 20)
        }
        var lineText    = kwing.TextField(text).apply {
            maximumSize = Dimension(Int.MAX_VALUE, 25)
            border      = EmptyBorder(0,0,0,0)
        }

        override fun toString() = "[index: ${lineCount.text.trim()}, text: ${lineText.text}]"
    }
}