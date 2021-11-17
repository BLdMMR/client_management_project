package pt.clientmanagment.climan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClientManagementAppApplication

fun main(args: Array<String>) {
	runApplication<ClientManagementAppApplication>(*args)
}
