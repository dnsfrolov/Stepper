package com.stepper.plugins

import com.stepper.model.Tag
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/data") {
            call.respond(Tag(1L, "dd"))
        }
    }
    routing {
    }
}
