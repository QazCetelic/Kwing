package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import java.awt.Container
import java.awt.FlowLayout

fun Container.Fitted(setup: ComponentSetup<Panel>): Panel {
    val panel = Panel()
    panel.layout = FlowLayout().apply {
        hgap = 0
        vgap = 0
    }
    setup(panel)
    this.add(panel)
    return panel
}

fun Fitted(): Panel {
    val panel = Panel()
    panel.layout = FlowLayout().apply {
        hgap = 0
        vgap = 0
    }
    return panel
}