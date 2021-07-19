plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    api("org.springframework.boot:spring-boot-starter")
    api("org.springframework.boot:spring-boot-starter-hateoas")
    api("org.springframework.boot:spring-boot-starter-web")

    api("com.fasterxml.jackson.module:jackson-module-kotlin")

    api("org.jetbrains.kotlin:kotlin-reflect")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation(project(":modules:testing-core"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
