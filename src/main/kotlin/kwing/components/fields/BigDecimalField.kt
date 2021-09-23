package kwing.components.fields

import java.math.BigDecimal

class BigDecimalField(bigDecimal: BigDecimal): ValueField(bigDecimal) {
    override fun verifyInput(text: String): Boolean = runCatching { BigDecimal(text) }.isSuccess
    var bigDecimal: BigDecimal
        get() = BigDecimal(text)
        set(value) { text = value.toString() }
}