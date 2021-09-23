package kwing.components.fields

class FloatField(float: Float): ValueField(float) {
    override fun verifyInput(text: String): Boolean = text.toFloatOrNull() != null
    var float: Float
        get() = text.toFloat()
        set(value) { text = value.toString() }
}