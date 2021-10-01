package kwing.components.fields

import java.math.BigInteger

open class BigIntegerField(bigInteger: BigInteger, columns: Int = 20): ValueField<BigInteger>(bigInteger, columns) {
    override val emptyFieldFallback: BigInteger = BigInteger.valueOf(0)
    override fun verifyInput(text: String): Boolean = runCatching { BigInteger(text) }.isSuccess
    var bigInteger: BigInteger
        get() = BigInteger(text)
        set(value) { text = value.toString() }
}