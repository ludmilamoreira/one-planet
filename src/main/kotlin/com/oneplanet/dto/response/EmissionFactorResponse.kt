package com.oneplanet.dto.response

import io.micronaut.core.annotation.Introspected

@Introspected
data class EmissionFactorResponse(
    val activity_id: String, val uuid: String, val id: String,
    val access_type: String, val source: String, val year: String,
    val region: String, val category: String, val lca_activity: String,
    val data_quality_flags: List<String>
)