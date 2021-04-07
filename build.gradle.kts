import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.jetbrains.kotlin.gradle.tasks.*

group = "no.nav"

val junitJupiterVersion = "5.6.0"

plugins {
   kotlin("jvm") version "1.4.10"
}

repositories {
   mavenCentral()
}

dependencies {
   implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
   implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

   testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
   testImplementation("org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion")
   testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")

}

java {
   sourceCompatibility = JavaVersion.VERSION_14
   targetCompatibility = JavaVersion.VERSION_14
}

tasks.withType<KotlinCompile> {
   kotlinOptions.jvmTarget = "14"
}

tasks.withType<Test> {
   useJUnitPlatform()
   testLogging {
      events("passed", "skipped", "failed")
      exceptionFormat = FULL
   }
}

tasks.withType<Wrapper> {
   gradleVersion = "6.7"
}

