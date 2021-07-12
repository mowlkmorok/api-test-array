package com.api_collections

import java.math.BigDecimal

// To plus all values
fun Array<BigDecimal>.toAllPLUS() = this.reduce(){
    acc, value -> acc + value
}

// To Calculate a average
fun Array<BigDecimal>.toAverage1(): BigDecimal =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.toAllPLUS() / this.size.toBigDecimal()