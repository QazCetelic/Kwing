package components

import CheckBox
import java.awt.Container

fun CheckBox(setupLambda: CheckBox.() -> Unit = {}) {
    return CheckBox(setupLambda)
}

fun Container.checkBox(setupLambda: CheckBox.() -> Unit = {}): CheckBox {
    val checkBox = CheckBox()
    this.add(checkBox)
    return checkBox
}