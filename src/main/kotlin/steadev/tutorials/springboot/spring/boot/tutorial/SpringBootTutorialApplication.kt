package steadev.tutorials.springboot.spring.boot.tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootTutorialApplication

fun main(args: Array<String>) {
	runApplication<SpringBootTutorialApplication>(*args)
}