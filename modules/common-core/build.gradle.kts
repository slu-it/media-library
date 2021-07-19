plugins {
    kotlin("jvm")
}

dependencies {
    api("org.jetbrains.kotlin:kotlin-reflect")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    api("io.arrow-kt:arrow-core")
    api("io.github.microutils:kotlin-logging")

    implementation("com.fasterxml.jackson.core:jackson-annotations")
    implementation("org.springframework:spring-context")
    implementation("org.springframework:spring-web")

    testImplementation(project(":modules:testing-core"))
}
