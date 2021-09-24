package kwing.components.fields

open class ByteField(byte: Byte): ValueField<Byte>(byte) {
    override val emptyFieldFallback: Byte = 0
    override fun verifyInput(text: String): Boolean = text.toByteOrNull() != null
    var byte: Byte
        get() = text.toByte()
        set(value) { text = value.toString() }
}