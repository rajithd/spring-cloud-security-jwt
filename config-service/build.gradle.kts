import com.rd.spring.dependencies.Dependencies.eurekaClient
import com.rd.spring.dependencies.Dependencies.gson
import com.rd.spring.dependencies.Dependencies.springBootConfigServer

plugins {
    java
    id("org.springframework.boot") version "3.0.5"
}

group = "com.rd.spring"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation(springBootConfigServer)
    implementation(eurekaClient)

    implementation(gson)
}
