package com.oneplanet.dto.response

import io.micronaut.core.annotation.Introspected

@Introspected
data class ClimatiqEstimateResponse(
    val co2e: Int, val co2e_unit: String, val co2e_calculation_method: String,
    val co2e_calculation_origin: String, val emission_factor: EmissionFactorResponse,
    val constituent_gases: ConstituentGasesResponse,
)