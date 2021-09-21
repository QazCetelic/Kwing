package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import kwing.x
import java.awt.Container
import java.awt.Dimension
import java.awt.GridLayout

fun Container.Grid(dimension: Dimension = 3 x 3, setup: ComponentSetup<Panel> = {}): Panel {
    val panel = Panel()
    panel.layout = GridLayout(dimension.height, dimension.width).apply {
        hgap = 0
        vgap = 0
    }
    panel.apply(setup)
    this.add(panel)
    return panel
}

fun Grid(dimension: Dimension = 3 x 3): Panel {
    val panel = Panel()
    panel.layout = GridLayout(dimension.height, dimension.width).apply {
        hgap = 0
        vgap = 0
    }
    return panel
}