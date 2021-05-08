import components.Window
import components.button
import components.image
import java.awt.*
import java.awt.GraphicsDevice.WindowTranslucency
import java.io.File
import javax.imageio.ImageIO
import javax.swing.JPanel
import javax.swing.SwingUtilities
import kotlin.system.exitProcess


class GradientTranslucentWindowsDemo : Window("GradientTranslucentWindow", Dimension(500, 500)) {
    var uiScale = 1.0
    var large = false

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Determine what the GraphicsDevice can support.
            val ge = GraphicsEnvironment.getLocalGraphicsEnvironment()
            val gd = ge.defaultScreenDevice
            val isPerPixelTranslucencySupported =
                gd.isWindowTranslucencySupported(WindowTranslucency.PERPIXEL_TRANSLUCENT)

            //If translucent windows aren't supported, exit.
            if (!isPerPixelTranslucencySupported) {
                println("Per-pixel translucency is not supported")
                exitProcess(0)
            }

            // Create the GUI on the event-dispatching thread
            SwingUtilities.invokeLater {
                val gtw = GradientTranslucentWindowsDemo()

                // Display the window.
                gtw.isVisible = true
            }
        }
    }

    init {
        val containerImage = ImageIO.read(File("/home/qaz/Projects/Other/Minecraft Files/container.png"))

        isUndecorated = true

        background = Color(0, 0, 0, 0)
        setLocationRelativeTo(null)
        val panel: JPanel = object : JPanel() {
            override fun paintComponent(graphics: Graphics) {
                graphics.drawImage(containerImage, 0, 0, (200 * uiScale).toInt(), (200 * uiScale).toInt(), null)
            }
        }
        contentPane = panel
        layout = GridBagLayout()

        button("I am a components.Button") {
            println(if (!large) "Large" else "Small")
            if (large) {
                size = Dimension(200, 200)
                uiScale = 1.0
                large =! large
            }
            else {
                size = Dimension(400, 400)
                uiScale = 2.0
                large =! large
            }
        }
        image(containerImage)

        isAlwaysOnTop = true
    }
}