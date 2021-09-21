package kwing

import java.awt.Container

typealias UIConstruction = Container.() -> Unit
fun UIConstruction(uiConstruction: UIConstruction) = uiConstruction

fun Container.add(uiConstruction: Container.() -> Unit) {
    uiConstruction(this)
}