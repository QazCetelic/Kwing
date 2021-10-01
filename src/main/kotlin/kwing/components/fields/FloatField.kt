package kwing.components.fields

open class FloatField(float: Float, columns: Int = 20): ValueField<Float>(float, columns) {
    override fun verifyInput(text: String): Boolean = text.toFloatOrNull() != null
    var float: Float
        get() = text.toFloat()
        set(value) { text = value.toString() }
}