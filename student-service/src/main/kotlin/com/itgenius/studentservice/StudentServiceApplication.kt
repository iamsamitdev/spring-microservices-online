package com.itgenius.studentservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient // บอกให้ Spring Boot รู้จัก Eureka Server
@SpringBootApplication
class StudentServiceApplication

fun main(args: Array<String>) {
	runApplication<StudentServiceApplication>(*args)
}
