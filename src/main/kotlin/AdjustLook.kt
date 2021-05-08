import javax.swing.UIManager

fun adjustLook() {
    val looks = UIManager.getInstalledLookAndFeels().map { it.className }
    when (System.getProperty("os.name")) {
        "Linux" -> {
            val gtk = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel"
            if (gtk in looks) UIManager.setLookAndFeel(gtk)
        }
        // Add other os's
    }
}