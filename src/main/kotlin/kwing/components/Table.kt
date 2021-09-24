package kwing.components

import java.awt.Dimension
import javax.swing.JTable

typealias Table = JTable

fun Table(dimension: Dimension): Table {
    val table = Table(dimension.width, dimension.height)
    return table
}

operator fun Table.get(row: Int, column: Int): String {
    return getValueAt(row, column).toString()
}
operator fun Table.set(row: Int, column: Int, value: String) {
    setValueAt(value, row, column)
}