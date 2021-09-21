package kwing.components.layout.bordered

import kwing.Panel
import java.awt.BorderLayout
import java.awt.Container

fun Container.Top(setupLambda: Panel.() -> Unit): Panel {
    val rootPanel = Panel()
    rootPanel.layout = BorderLayout()

    val subPanel = Panel()
    subPanel.apply(setupLambda)
    rootPanel.add(subPanel, BorderLayout.PAGE_START)

    this.add(rootPanel)
    return rootPanel
}