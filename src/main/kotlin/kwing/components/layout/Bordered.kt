package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import java.awt.BorderLayout
import java.awt.Container

fun Container.Bordered(setup: ComponentSetup<Panel>): Panel {
    val panel = Panel()
    panel.layout = BorderLayout().apply {
        hgap = 0
        vgap = 0
    }
    panel.apply(setup)
    this.add(panel)
    return panel
}

fun Bordered(): Panel {
    val panel = Panel()
    panel.layout = BorderLayout().apply {
        hgap = 0
        vgap = 0
    }
    return panel
}