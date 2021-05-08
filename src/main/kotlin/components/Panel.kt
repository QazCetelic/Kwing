package components

import java.awt.Component
import java.awt.Container
import java.awt.LayoutManager2
import javax.swing.JComponent
import javax.swing.JPanel

class Panel(layout: LayoutManager2? = null, setupLambda: Panel.() -> Unit = {}) : JPanel() {
    init {
        this.layout = layout
        this.apply(setupLambda)
    }
}

fun Container.panel(layout: LayoutManager2? = null, setupLambda: Panel.() -> Unit = {}): Panel {
    val panel = Panel()
    if (layout != null) panel.layout = layout
    panel.apply(setupLambda)
    this.add(panel)
    return panel
}