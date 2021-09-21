package kwing

import java.awt.Font
import javax.swing.JComponent

var JComponent.fontSize: Int
    get() {
        return font.size
    }
    set(value) {
        val family  = font.family
        val style   = font.style
        font = Font(family, style, value)
    }

var JComponent.fontType: FontType
    get() = when {
        font.isBold     -> FontType.BOLD
        font.isItalic   -> FontType.ITALIC
        else            -> FontType.PLAIN
    }
    set(value) {
        val family  = font.family
        val size    = font.size
        font = Font(family, value.num, size)
    }

enum class FontType(internal val num: Int) {
    BOLD(Font.BOLD),
    PLAIN(Font.PLAIN),
    ITALIC(Font.ITALIC),
}

var JComponent.fontFamily: FontFamily
    get() = when (font.family) {
        Font.SANS_SERIF     -> FontFamily.SANS_SERIF
        Font.DIALOG         -> FontFamily.DIALOG
        Font.DIALOG_INPUT   -> FontFamily.DIALOG_INPUT
        Font.MONOSPACED     -> FontFamily.MONOSPACE
        else                -> FontFamily.SERIF
    }
    set(value) {
        val style  = font.style
        val size    = font.size
        font = Font(value.string, style, size)
    }

enum class FontFamily(internal val string: String) {
    SERIF(Font.SERIF),
    SANS_SERIF(Font.SANS_SERIF),
    DIALOG(Font.DIALOG),
    DIALOG_INPUT(Font.DIALOG_INPUT),
    MONOSPACE(Font.MONOSPACED),
}