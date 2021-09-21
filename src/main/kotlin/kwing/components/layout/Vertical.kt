package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import java.awt.Container
import javax.swing.BoxLayout

fun Container.Vertical(setup: ComponentSetup<Panel>): Panel {
    val panel = Vertical()
    setup(panel)
    add(panel)
    return panel
}

open class Vertical(): Panel() {
    init {
        layout = BoxLayout(this, BoxLayout.Y_AXIS)
    }
}
