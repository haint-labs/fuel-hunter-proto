plugins {
    java
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

dependencies {
    implementation("com.google.api.grpc:proto-google-common-protos:1.16.0")
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