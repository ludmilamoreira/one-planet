package com.oneplanet.dto.response

import io.micronaut.core.annotation.Introspected

@Introspected
data class ClimatiqEstimateResponse(
    val co2e: Int,
    val co2eUnit: String,
    val co2eCalculationMethod: String,
    val co2eCalculationOrigin: String,
    val emissionFactor: EmissionFactorResponse,
    val constituentGases: ConstituentGasesResponse,
)