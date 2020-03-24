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

// Does not work out-of-the-box with constructor based properties and require @DefaultValue
@ConstructorBinding
@ConfigurationProperties("demo")
class DemoProperties(val title: String = "foo")

// Works with
// @ConfigurationProperties("demo")
// class DemoProperties {
//	 var title: String = "foo"
// }

fun main(args: Array<String>) {
	runApplication<DemoKotlinDefaultValuesApplication>(*args)
}
