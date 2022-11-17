package com.oneplanet.dto.request

import io.micronaut.core.annotation.Introspected

@Introspected
data class ClimatiqEstimateRequest(
    val emission_factor : EmissionFactorRequest,
    val parameters: ParametersRequest
    )