// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.6.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
buildscript {
    repositories {
        google()   // ✅ make sure this is present
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0")  // your AGP version
        classpath ("com.google.gms:google-services:4.4.2") // ✅ add this
    }
}
