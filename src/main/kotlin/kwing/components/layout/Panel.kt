package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import java.awt.Container
import java.awt.LayoutManager

fun Container.Panel(layout: LayoutManager? = null, setup: ComponentSetup<Panel>): Panel {
    val panel = kwing.Panel()
    if (layout != null) panel.layout = layout
    setup(panel)

    this.add(panel)
    return panel
}