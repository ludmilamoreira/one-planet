package com.oneplanet.dto.request

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

@Introspected
data class ParametersRequest(
    val money: Int,

    @JsonProperty("money_unit")
    val moneyUnit: String
    )