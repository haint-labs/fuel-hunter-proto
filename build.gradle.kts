plugins {
    java
    id("maven-publish")
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
            version = "0.0.1-SNAPSHOT"

            from(components["java"])
        }
    }
}