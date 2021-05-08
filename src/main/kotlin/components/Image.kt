package components

import java.awt.Container
import java.awt.image.BufferedImage
import java.awt.image.ImageObserver
import java.io.File
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JComponent
import javax.swing.JLabel

class Image : JLabel {
    constructor(image: File, description: String? = null, imageObserver: ImageObserver? = null) : super() {
        val icon = ImageIcon(ImageIO.read(image))
        if (description != null) icon.description = description
        if (imageObserver != null) icon.imageObserver = imageObserver
        this.icon = icon
    }
    constructor(image: BufferedImage, description: String? = null, imageObserver: ImageObserver? = null) : super() {
        val icon = ImageIcon(image)
        if (description != null) icon.description = description
        if (imageObserver != null) icon.imageObserver = imageObserver
        this.icon = icon
    }
}

fun Container.image(image: BufferedImage, description: String? = null, imageObserver: ImageObserver? = null): Image {
    val imageComponent = Image(image, description, imageObserver)
    this.add(imageComponent)
    return imageComponent
}