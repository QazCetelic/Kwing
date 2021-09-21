package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import kwing.Text
import kwing.fontSize
import java.awt.Container
import java.awt.Dimension

class HorizontalSpacer(value: Int) : Panel() {
    var spacerThickness: Int
        get() {
            return maximumSize.height
        }
        set(value) {
            maximumSize = Dimension(Int.MAX_VALUE, value)
            minimumSize = Dimension(Int.MAX_VALUE, value)
        }

    var spacerLength: Int
        get() {
            return maximumSize.width
        }
        set(value) {
            maximumSize = Dimension(value, spacerThickness)
            minimumSize = Dimension(value, spacerThickness)
        }

    init {
        spacerThickness = value
        // It won't render otherwise
        val text = Text("")
        text.apply { fontSize = 1 }
        add(text)
    }
}

fun Container.HorizontalSpacer(value: Int, setup: ComponentSetup<Panel>): HorizontalSpacer {
    val panel = HorizontalSpacer(value)
    setup(panel)
    this.add(panel)
    return panel
}