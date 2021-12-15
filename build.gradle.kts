plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("io.grpc:grpc-protobuf:1.42.1")
    implementation("org.apache.tomcat:tomcat-annotations-api:10.0.14")
}