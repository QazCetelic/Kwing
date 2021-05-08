import components.*
import java.awt.Font
import javax.swing.BoxLayout

fun main() {
    adjustLook()

    Window {
        panel {
            val checkbox = checkBox {
                background = null
            }
            checkbox.onClick {
                println(checkbox.isSelected)
            }

            layout = BoxLayout(this, BoxLayout.PAGE_AXIS)

            val button = button("Hello World") {
                println("Hello World")
            }
            button.font = Font(Font.SANS_SERIF, Font.BOLD, 15)

            text("0987654321")
            text("0987654321")
            text("0987654321")
            button("1234567")
            button("qwertyu")
        }
        isUndecorated = false
        background = null

        isVisible = true
    }

    Window("Hello World") {
        button("-0-") {
            println("Done")
        }

        isVisible = true
    }
}