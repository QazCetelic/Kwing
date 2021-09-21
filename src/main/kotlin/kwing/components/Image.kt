package kwing.components

import kwing.x
import java.awt.image.BufferedImage
import java.awt.image.ImageObserver
import java.io.File
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JLabel
import javax.swing.JPanel

class Image : JPanel {
    val image: BufferedImage
    private val icon: ImageIcon
    constructor(image: BufferedImage, description: String? = null, imageObserver: ImageObserver? = null) : super() {
        this.image = image
        icon = ImageIcon(this.image)
        if (description != null) icon.description = description
        if (imageObserver != null) icon.imageObserver = imageObserver
        val label = JLabel()
        label.icon = icon
        label.minimumSize = this.image.width x this.image.height
        add(label)
    }
    constructor(image: File, description: String? = null, imageObserver: ImageObserver? = null) : super() {
        this.image = ImageIO.read(image)
        icon = ImageIcon(this.image)
        if (description != null) icon.description = description
        if (imageObserver != null) icon.imageObserver = imageObserver
        val label = JLabel()
        label.icon = icon
        label.minimumSize = this.image.width x this.image.height
        add(label)
    }
}

fun BufferedImage(file: File): BufferedImage {
    return ImageIO.read(file)
}