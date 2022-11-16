package com.oneplanet.dto.request

import io.micronaut.core.annotation.Introspected

@Introspected
data class ClimatiqEstimateRequest(
    val emissionFactor : EmissionFactorRequest,
    val parameters: ParametersRequest
    )