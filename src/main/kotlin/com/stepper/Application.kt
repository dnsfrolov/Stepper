package com.stepper

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.stepper.plugins.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.*
import io.ktor.server.application.*
import kotlinx.serialization.json.Json

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
        configureRouting()
    }.start(wait = true)
}
