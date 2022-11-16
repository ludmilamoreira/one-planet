package com.oneplanet.dto.response

import io.micronaut.core.annotation.Introspected
import java.math.BigDecimal

@Introspected
data class ConstituentGasesResponse(
    val co2eTotal: BigDecimal?,
    val co2eOther: BigDecimal?,
    val co2: BigDecimal,
    val ch4: BigDecimal,
    val n2o: BigDecimal
)