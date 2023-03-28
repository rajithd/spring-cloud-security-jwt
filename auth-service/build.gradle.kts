import com.rd.spring.dependencies.Dependencies.gson
import com.rd.spring.dependencies.Dependencies.javaxAnnotation
import com.rd.spring.dependencies.Dependencies.jwtApi
import com.rd.spring.dependencies.Dependencies.jwtImpl
import com.rd.spring.dependencies.Dependencies.jwtJackson
import com.rd.spring.dependencies.Dependencies.lombok

plugins {
    java
    id("org.springframework.boot") version "3.0.5"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "com.rd.spring"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "2022.0.1"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")

    implementation(javaxAnnotation)

    compileOnly(lombok)
    annotationProcessor(lombok)

    implementation(gson)
    implementation(jwtApi)
    implementation(jwtImpl)
    implementation(jwtJackson)
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}
