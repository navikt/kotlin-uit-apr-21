import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "no.nav"

plugins {
   kotlin("jvm") version "1.4.32"
}

repositories {
   mavenCentral()
}

dependencies {
   implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
   implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

java {
   sourceCompatibility = JavaVersion.VERSION_15
   targetCompatibility = JavaVersion.VERSION_15
}

tasks.withType<KotlinCompile> {
   kotlinOptions.jvmTarget = "15"
}

tasks.withType<Wrapper> {
   gradleVersion = "6.8.3"
}

