package com.stepper

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.stepper.plugins.*
import io.ktor.server.application.CallFailed.install

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        //install(ContentNegotiation)
        configureRouting()
    }.start(wait = true)
}
