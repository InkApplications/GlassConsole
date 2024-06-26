import org.gradle.api.tasks.testing.logging.TestExceptionFormat

gradle.startParameter.excludedTaskNames.add("lint")

repositories {
    mavenCentral()
    google()
}

allprojects {
    repositories {
        mavenCentral()
        google()
        mavenLocal()
    }
    tasks.withType(Test::class) {
        testLogging.exceptionFormat = TestExceptionFormat.FULL
    }
}
