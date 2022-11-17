package com.oneplanet.client

import com.oneplanet.dto.request.ClimatiqEstimateRequest
import com.oneplanet.dto.response.ClimatiqEstimateResponse
import io.micronaut.http.HttpHeaders.AUTHORIZATION
import io.micronaut.http.HttpHeaders.USER_AGENT
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.Headers
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import org.reactivestreams.Publisher

@Client(ClimatiqApiConfiguration.API_URL)
@Headers(
    Header(name = USER_AGENT, value = "Micronaut HTTP Client"),
    Header(name = AUTHORIZATION, value = ClimatiqApiConfiguration.USER_TOKEN)

)
interface ClimatiqApiClient {

    @Post("/estimate")
    fun getClimaticEstimate(@Body climatiqEstimateRequest: ClimatiqEstimateRequest): ClimatiqEstimateResponse
}