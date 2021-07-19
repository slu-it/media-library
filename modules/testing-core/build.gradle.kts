plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    api("org.jetbrains.kotlin:kotlin-reflect")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    api("com.tngtech.archunit:archunit")
    api("org.assertj:assertj-core")
    api("org.junit.jupiter:junit-jupiter")
    api("io.mockk:mockk")

    implementation("org.springframework.boot:spring-boot-starter-test")
}
