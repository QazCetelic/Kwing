package kwing.components.fields

import java.math.BigInteger

class BigIntegerField(bigInteger: BigInteger): ValueField(bigInteger) {
    override fun verifyInput(text: String): Boolean = runCatching { BigInteger(text) }.isSuccess
    var bigInteger: BigInteger
        get() = BigInteger(text)
        set(value) { text = value.toString() }
}