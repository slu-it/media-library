plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    api(project(":modules:common-core"))
    api("org.springframework.boot:spring-boot-starter")
    api("org.springframework.boot:spring-boot-starter-hateoas")
    api("org.springframework.boot:spring-boot-starter-web")

    api("com.fasterxml.jackson.module:jackson-module-kotlin")

    api("org.jetbrains.kotlin:kotlin-reflect")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation(project(":modules:common-core-test"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
