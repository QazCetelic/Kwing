package kwing

import javax.swing.UIManager

/**
 * Changes the global style depending on what's installed
 */
fun adjustLookAndFeel() {
    System.setProperty("awt.useSystemAAFontSettings", "on")

    val looks = UIManager.getInstalledLookAndFeels().map { it.className }
    val os = System.getProperty("os.name")
    when {
        os == "Linux" -> {
            val gtk = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel"
            if (gtk in looks) UIManager.setLookAndFeel(gtk)
        }
        // TODO test this
        os.startsWith("Windows", true) -> {
            val windows = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
            if (windows in looks) UIManager.setLookAndFeel(windows)
        }
        // Add other os's
    }
}