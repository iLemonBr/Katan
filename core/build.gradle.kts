val exposedVersion = "0.27.1"
val dockerJavaVersion = "3.2.5"

dependencies {
    api(project(":common"))
    implementation(project(":docker-compose"))
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-java-time:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    implementation("com.auth0:java-jwt:3.10.3")
    implementation("org.jetbrains.kotlinx:atomicfu:0.14.4")
    implementation("org.testcontainers:cassandra:1.15.0-rc1")
    implementation("com.github.docker-java:docker-java-core:$dockerJavaVersion")
    implementation("com.github.docker-java:docker-java-transport-okhttp:$dockerJavaVersion")
    implementation("com.h2database:h2:1.4.200")
    implementation("mysql:mysql-connector-java:8.0.21")
    implementation("com.palominolabs.http:url-builder:1.1.2")
    implementation("redis.clients:jedis:2.9.0")
}