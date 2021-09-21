package kwing.components.layout

import kwing.ComponentSetup
import kwing.Panel
import java.awt.Container
import javax.swing.BoxLayout

fun Container.Horizontal(setup: ComponentSetup<Panel>): Panel {
    val panel = Horizontal()
    setup(panel)
    add(panel)
    return panel
}

open class Horizontal(): Panel() {
    init {
        layout = BoxLayout(this, BoxLayout.X_AXIS)
    }
}
