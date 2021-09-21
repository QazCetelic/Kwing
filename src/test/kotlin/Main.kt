import kwing.*
import kwing.components.*
import kwing.components.layout.*
import java.io.File
import javax.imageio.ImageIO
import javax.swing.Icon
import javax.swing.ImageIcon
import javax.swing.JList
import javax.swing.JOptionPane
import javax.swing.text.html.ImageView

fun main() {
    Window ("Kwing") {
        Panel {
            val bufferedImage = ImageIO.read(File("/home/qaz/Pictures/Screenshot from 2021-08-24 18-12-38.png"))
            val image = Image(bufferedImage) within this
            image.maximumSize = 200 x 150

            val array = arrayOf(1, 2, 3, 4, 5)
            val list = JList(array) within this
            list.layoutOrientation = JList.HORIZONTAL_WRAP
            list.visibleRowCount = 5
            list.onSelect {
                println(list.selectedValuesList)
            }

            Vertical {
                repeat(10) {
                    this += Text("Hello World")
                }
            }
        }

        isVisible = true
    }
}