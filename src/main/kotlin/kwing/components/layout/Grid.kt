package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import kwing.x
import java.awt.Container
import java.awt.Dimension
import java.awt.GridLayout

fun Container.Grid(dimension: Dimension = 3 x 3, setup: ComponentSetup<Panel> = {}): Panel {
    val grid = kwing.components.layout.Grid(dimension)
    setup(grid)
    add(grid)
    return grid
}

open class Grid(dimension: Dimension = 3 x 3): Panel() {
    init {
        layout = GridLayout(dimension.height, dimension.width).apply {
            hgap = 0
            vgap = 0
        }
    }
}