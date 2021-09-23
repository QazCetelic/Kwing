package kwing.components.fields

class LongField(long: Long): ValueField(long) {
    override fun verifyInput(text: String): Boolean = text.toLongOrNull() != null
    var long: Long
        get() = text.toLong()
        set(value) { text = value.toString() }
}