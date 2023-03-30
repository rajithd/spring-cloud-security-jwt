import com.github.gradle.node.npm.task.NpxTask

plugins {
    id("com.github.node-gradle.node") version "3.1.1"
}

group = "com.rd.spring"
version = "1.0-SNAPSHOT"

node {
    version.set("16.17.0")
    npmVersion.set("8.15.0")
    download.set(true)
    npmInstallCommand.set("ci")
}

task<NpxTask>("build") {
    dependsOn("npmInstall")
    description = "Build CDK"
    command.set("npm")
    args.set(listOf("run", "build"))
}

task<NpxTask>("deployEcr") {
    dependsOn("npmInstall")
    description = "Deploy ECR Repositories"
    command.set("npm")
    args.set(listOf("run", "cdk", "--", "--app", "npx ts-node --prefer-ts-exts bin/ecr-cdk.ts", "deploy", "ecr-stack"))
}

task<NpxTask>("destroyEcr") {
    dependsOn("npmInstall")
    description = "Destroy ECR Repositories"
    command.set("npm")
    args.set(listOf("run", "cdk", "--", "--app", "npx ts-node --prefer-ts-exts bin/ecr-cdk.ts", "destroy", "ecr-stack"))
}
