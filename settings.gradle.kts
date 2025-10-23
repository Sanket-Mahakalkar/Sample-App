import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.mavenCentral
import org.gradle.kotlin.dsl.repositories

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            // adjust this path to point to where the AAR was published
            url = uri("/Users/sanket.mahakalkar/Kredivo/kredivo_android/submodules/kmp/build/build/repo") // e.g. "/home/me/projects/timo/timo-sdk/build/repo"
        }
        maven { url = uri("https://jitpack.io") }
    }
}


rootProject.name = "Study Composable"
include(":app")
 