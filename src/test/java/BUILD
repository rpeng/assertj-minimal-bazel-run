load("@rules_java//java:defs.bzl", "java_binary")

java_library(
    name = "tests",
    srcs = ["com/example/rpeng/MainTest.java"],
    deps = [
        "@maven//:junit_junit",
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_opentest4j_opentest4j",
    ],
)

java_test(
    name = "com.example.rpeng.MainTest",
    size = "small",
    runtime_deps = [
        ":tests",
    ]
)