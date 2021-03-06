package kwing.components.fields

open class IntField(int: Int, columns: Int = 20): ValueField<Int>(int, columns) {
    override val emptyFieldFallback: Int = 0
    override fun verifyInput(text: String): Boolean = text.toIntOrNull() != null
    var int: Int
        get() = text.toInt()
        set(value) { text = value.toString() }
}