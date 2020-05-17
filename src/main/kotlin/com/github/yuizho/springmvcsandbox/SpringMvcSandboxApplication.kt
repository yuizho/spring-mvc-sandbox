package com.github.yuizho.springmvcsandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringMvcSandboxApplication

fun main(args: Array<String>) {
    runApplication<SpringMvcSandboxApplication>(*args)
}
