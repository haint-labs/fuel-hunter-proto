plugins {
    id("java-library")
    id("maven-publish")
}

repositories {
    mavenCentral()
    jcenter()
}

sourceSets {
    main {
        resources {
            srcDir("${rootDir}/proto")
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("github") {
            group = "fuel.hunter"
            artifactId = "proto"
            version = "0.0.3-SNAPSHOT"

            from(components["java"])
        }
    }
}