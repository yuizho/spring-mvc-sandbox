package com.github.yuizho.springmvcsandbox.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/hello")
class HelloController {
    @GetMapping
    fun get(): String {
        return "hello"
    }
}