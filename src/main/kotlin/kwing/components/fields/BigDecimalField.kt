package kwing.components.fields

import java.math.BigDecimal

open class BigDecimalField(bigDecimal: BigDecimal): ValueField<BigDecimal>(bigDecimal) {
    override val emptyFieldFallback: BigDecimal = BigDecimal.valueOf(0)
    override fun verifyInput(text: String): Boolean = runCatching { BigDecimal(text) }.isSuccess
    var bigDecimal: BigDecimal
        get() = BigDecimal(text)
        set(value) { text = value.toString() }
}