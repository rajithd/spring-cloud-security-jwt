package com.rd.spring.dependencies

import com.rd.spring.dependencies.Versions.springBootVersion
import com.rd.spring.dependencies.Versions.springCloudVersion
import com.rd.spring.dependencies.Versions.lombokVersion
import com.rd.spring.dependencies.Versions.jwtVersion

object Versions {
    const val springBootVersion = "3.0.5"
    const val springCloudVersion = "2022.0.1"
    const val lombokVersion = "1.18.22"
    const val jwtVersion = "0.11.1"
}

object Dependencies {
    // Spring
    const val springBootStarter = "org.springframework.boot:spring-boot-starter:$springBootVersion"
    const val springBootWeb = "org.springframework.boot:spring-boot-starter-web:$springBootVersion"

    // Spring Cloud
    const val springBootConfigServer = "org.springframework.cloud:spring-cloud-config-server:$springBootVersion"
    const val springWebflux = "org.springframework.cloud:spring-cloud-starter-gateway:$springBootVersion"
    const val eurekaClient = "org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:$springBootVersion"
    const val hystrix = "org.springframework.cloud:spring-cloud-starter-netflix-hystrix:$springBootVersion"
    const val eurekaServer = "org.springframework.cloud:spring-cloud-starter-netflix-eureka-server:$springBootVersion"

    // Other
    const val lombok = "org.projectlombok:lombok:$lombokVersion"
    const val gson = "com.google.code.gson:gson:2.8.2"
    const val jwtApi = "io.jsonwebtoken:jjwt-api:$jwtVersion"
    const val jwtImpl = "io.jsonwebtoken:jjwt-impl:$jwtVersion"
    const val jwtJackson = "io.jsonwebtoken:jjwt-jackson:$jwtVersion"
    const val javaxAnnotation = "javax.annotation:javax.annotation-api:1.3.2"
    const val javaxServlet = "javax.servlet:javax.servlet-api:3.1.0"

}
