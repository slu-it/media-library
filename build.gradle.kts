import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.2" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE"

    kotlin("jvm") version "1.5.20" apply false
    kotlin("plugin.spring") version "1.5.20" apply false
}

allprojects {

    repositories {
        mavenCentral()
    }

    apply {
        plugin("io.spring.dependency-management")
    }

    dependencyManagement {
        imports {
            mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
        }
        dependencies {
            dependency("com.tngtech.archunit:archunit:0.20.1")
            dependency("io.arrow-kt:arrow-core:0.13.2")
            dependency("io.github.microutils:kotlin-logging:2.0.10")
            dependency("io.mockk:mockk:1.12.0")
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

}
