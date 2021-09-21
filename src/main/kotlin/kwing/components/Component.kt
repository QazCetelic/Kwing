package kwing.components

import java.awt.Component
import java.awt.Dimension

var Component.minimumHeight: Int
    get() {
        return minimumSize.height
    }
    set(value) {
        val width = minimumSize.width
        minimumSize = Dimension(width, value)
    }

var Component.minimumWidth: Int
    get() {
        return minimumSize.width
    }
    set(value) {
        val height = minimumSize.height
        minimumSize = Dimension(value, height)
    }

var Component.maximumHeight: Int
    get() {
        return maximumSize.height
    }
    set(value) {
        val width = maximumSize.width
        maximumSize = Dimension(width, value)
    }

var Component.maximumWidth: Int
    get() {
        return maximumSize.width
    }
    set(value) {
        val height = maximumSize.height
        maximumSize = Dimension(value, height)
    }