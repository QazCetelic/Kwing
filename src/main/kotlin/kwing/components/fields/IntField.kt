package kwing.components.fields

class IntField(int: Int): ValueField(int) {
    override fun verifyInput(text: String): Boolean = text.toIntOrNull() != null
    var int: Int
        get() = text.toInt()
        set(value) { text = value.toString() }
}