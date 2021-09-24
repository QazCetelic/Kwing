package kwing.components.fields

open class ShortField(short: Short): ValueField<Short>(short) {
    override val emptyFieldFallback: Short = 0
    override fun verifyInput(text: String): Boolean = text.toShortOrNull() != null
    var short: Short
        get() = text.toShort()
        set(value) { text = value.toString() }
}