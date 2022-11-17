package com.oneplanet.controller

import com.oneplanet.client.ClimatiqApiClient
import com.oneplanet.dto.request.ClimatiqEstimateRequest
import com.oneplanet.dto.request.EmissionFactorRequest
import com.oneplanet.dto.request.ParametersRequest
import com.oneplanet.dto.response.ClimatiqEstimateResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/climatiq")
class ClimatiqController(private val climatiqApiClient: ClimatiqApiClient) {

    @Post("/estimate")
    fun getClimatiqEstimate(@Body climatiqEstimateRequest : ClimatiqEstimateRequest): ClimatiqEstimateResponse {

        return climatiqApiClient.getClimaticEstimate(climatiqEstimateRequest)
    }
}