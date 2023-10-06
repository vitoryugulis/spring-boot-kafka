package br.com.studies.producerandconsumerstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerAndConsumerStudyApplication

fun main(args: Array<String>) {
	runApplication<ProducerAndConsumerStudyApplication>(*args)
}
