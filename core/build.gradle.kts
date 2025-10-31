/*
 * SPDX-FileCopyrightText: 2025 Budapest University of Technology and Economics
 * SPDX-License-Identifier: Apache-2.0
 */

plugins {
    `java-library`
}

repositories {
    // adds the "https://mvnrepository.com/repos/central" maven repository as dependency source
    mavenCentral()
}

java {
    toolchain {
        // Sets the used JDK version to 21
        languageVersion = JavaLanguageVersion.of(21)
    }
}


dependencies {
    testImplementation(libs.junit.jupiter.core)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}
