package kwing.components.fields

open class DoubleField(double: Double): ValueField<Double>(double) {
    override val emptyFieldFallback: Double = 0.0
    override fun verifyInput(text: String): Boolean = text.toDoubleOrNull() != null
    var double: Double
        get() = text.toDouble()
        set(value) { text = value.toString() }
}