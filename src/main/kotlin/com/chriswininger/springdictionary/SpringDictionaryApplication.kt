package com.chriswininger.springdictionary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDictionaryApplication

fun main(args: Array<String>) {
  runApplication<SpringDictionaryApplication>(*args)
}
