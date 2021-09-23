package kwing.components.fields

class DoubleField(double: Double): ValueField(double) {
    override fun verifyInput(text: String): Boolean = text.toDoubleOrNull() != null
    var double: Double
        get() = text.toDouble()
        set(value) { text = value.toString() }
}