package pt.clientmanagment.climan.controllers

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {

    val log = LoggerFactory.getLogger(this::class.java.name)

    @GetMapping
    fun getHello(): String {
        log.info("Hello from the controller")
        return "Hey there!"
    }
}