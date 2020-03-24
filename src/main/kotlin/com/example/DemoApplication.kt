package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.bind.DefaultValue
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(DemoProperties::class)
class DemoKotlinDefaultValuesApplication

@ConstructorBinding
@ConfigurationProperties("demo")
class DemoProperties(
		//@DefaultValue("foo")
		val title: String = "foo"
)

fun main(args: Array<String>) {
	runApplication<DemoKotlinDefaultValuesApplication>(*args)
}
