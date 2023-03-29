import com.rd.spring.dependencies.Dependencies.eurekaClient
import com.rd.spring.dependencies.Dependencies.lombok

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
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:3.0.5")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-hystrix:2.2.10.RELEASE")
    implementation(eurekaClient)

    implementation("com.google.code.gson:gson:2.8.2")
    implementation("io.jsonwebtoken:jjwt-api:0.11.1")
    implementation("io.jsonwebtoken:jjwt-impl:0.11.1")
    implementation("io.jsonwebtoken:jjwt-jackson:0.11.1")

    compileOnly(lombok)
    annotationProcessor(lombok)

}
