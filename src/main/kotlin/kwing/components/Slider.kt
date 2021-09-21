package kwing.components

import java.util.*
import javax.swing.JLabel
import javax.swing.JSlider

typealias Slider = JSlider
var Slider.labels: Map<Int, String>
    get() {
        val dict = labelTable ?: return emptyMap()
        val map = mutableMapOf<Int, String>()
        for (label in dict.keys()) {
            val element = dict[label]
            if (label is Int && element is JLabel) map[label] = element.text
        }
        return map
    }
    set(value) {
        val hashtable = Hashtable<Int, JLabel>()
        for (label in value) {
            hashtable[label.key] = JLabel(label.value)
        }
        labelTable = hashtable
    }

fun Slider.label(index: Int, text: String) {
    labels = labels.toMutableMap().apply { this[index] = text }
}