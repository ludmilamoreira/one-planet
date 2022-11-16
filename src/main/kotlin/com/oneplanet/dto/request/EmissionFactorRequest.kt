package com.oneplanet.dto.request

import io.micronaut.core.annotation.Introspected

@Introspected
data class EmissionFactorRequest(
    val activityId: String
    )