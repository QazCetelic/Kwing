package kwing.components.fields

open class ByteField(byte: Byte, columns: Int = 20): ValueField<Byte>(byte, columns) {
    override val emptyFieldFallback: Byte = 0
    override fun verifyInput(text: String): Boolean = text.toByteOrNull() != null
    var byte: Byte
        get() = text.toByte()
        set(value) { text = value.toString() }
}