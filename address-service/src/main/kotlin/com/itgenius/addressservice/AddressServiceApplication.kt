package com.itgenius.addressservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient // บอกให้ Spring Boot รู้จัก Eureka Server
@SpringBootApplication
class AddressServiceApplication

fun main(args: Array<String>) {
	runApplication<AddressServiceApplication>(*args)
}
