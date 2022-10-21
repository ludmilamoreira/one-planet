package com.oneplanet.dto.request

import io.micronaut.core.annotation.Introspected

@Introspected
data class ParametersRequest(val energy: Int, val energy_unit: String)