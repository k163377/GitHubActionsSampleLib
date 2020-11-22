plugins {
    kotlin("jvm") version "1.4.10"
}

group = "org.wrongwrong"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter
    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter", version = "5.7.0") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }
    test {
        useJUnitPlatform()
    }
}
