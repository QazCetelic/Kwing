package kwing.components.fields

open class LongField(long: Long): ValueField<Long>(long) {
    override val emptyFieldFallback: Long = 0L
    override fun verifyInput(text: String): Boolean = text.toLongOrNull() != null
    var long: Long
        get() = text.toLong()
        set(value) { text = value.toString() }
}