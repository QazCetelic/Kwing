package kwing.components.fields

class ShortField(short: Short): ValueField(short) {
    override fun verifyInput(text: String): Boolean = text.toShortOrNull() != null
    var short: Short
        get() = text.toShort()
        set(value) { text = value.toString() }
}