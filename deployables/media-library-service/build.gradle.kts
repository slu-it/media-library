plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")

    kotlin("jvm")
    kotlin("plugin.spring")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":domains:books"))
    implementation(project(":domains:games"))
    implementation(project(":domains:movies"))

    implementation("org.springframework.boot:spring-boot-starter-security")

    testImplementation(project(":modules:testing-core"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
}
