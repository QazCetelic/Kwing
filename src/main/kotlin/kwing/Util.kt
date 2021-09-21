package kwing

import java.awt.Component
import java.awt.Container
import java.awt.Dimension

infix fun <T: Component> T.within(container: Container): T {
    container.add(this)
    return this
}
operator fun <T: Component> Container.plusAssign(component: T) {
    this.add(component)
}

infix fun Int.x(int: Int): Dimension = Dimension(this, int)