package com.itgenius.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer // ประกาศให้เป็น Eureka Server
@SpringBootApplication
class DiscoveryApplication

fun main(args: Array<String>) {
	runApplication<DiscoveryApplication>(*args)
}
