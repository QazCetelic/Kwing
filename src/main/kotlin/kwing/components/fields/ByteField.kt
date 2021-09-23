package kwing.components.fields

class ByteField(byte: Byte): ValueField(byte) {
    override fun verifyInput(text: String): Boolean = text.toByteOrNull() != null
    var byte: Byte
        get() = text.toByte()
        set(value) { text = value.toString() }
}