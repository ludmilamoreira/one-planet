package com.oneplanet.dto.request

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.context.annotation.Property
import io.micronaut.core.annotation.Introspected

@Introspected
data class EmissionFactorRequest(
    @JsonProperty("activity_id")
    val activityId: String,
    val region: String
    )