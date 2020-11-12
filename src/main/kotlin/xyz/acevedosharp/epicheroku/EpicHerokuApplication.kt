package xyz.acevedosharp.epicheroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EpicHerokuApplication

fun main(args: Array<String>) {
    runApplication<EpicHerokuApplication>(*args)
}
