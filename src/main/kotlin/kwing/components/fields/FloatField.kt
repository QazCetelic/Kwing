package kwing.components.fields

open class FloatField(float: Float): ValueField<Float>(float) {
    override fun verifyInput(text: String): Boolean = text.toFloatOrNull() != null
    var float: Float
        get() = text.toFloat()
        set(value) { text = value.toString() }
}