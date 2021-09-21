package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import kwing.Text
import kwing.fontSize
import java.awt.Container
import java.awt.Dimension

class VerticalSpacer(value: Int) : Panel() {
    var spacerThickness: Int
        get() {
            return maximumSize.width
        }
        set(value) {
            maximumSize = Dimension(value, Int.MAX_VALUE)
            minimumSize = Dimension(value, Int.MAX_VALUE)
        }

    var spacerLength: Int
        get() {
            return maximumSize.height
        }
        set(value) {
            maximumSize = Dimension(spacerThickness, value)
            minimumSize = Dimension(spacerThickness, value)
        }

    init {
        spacerThickness = value
        // It won't render otherwise
        val text = Text("")
        text.apply { fontSize = 1 }
        add(text)
    }
}

fun Container.VerticalSpacer(value: Int, setup: ComponentSetup<Panel>): VerticalSpacer {
    val panel = VerticalSpacer(value)
    setup(panel)
    this.add(panel)
    return panel
}