package com.github.yuizho.springmvcsandbox.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/error-test")
class ErrorController {
    @GetMapping
    fun get(): String {
        if (true)
            throw ApplicationException("エラーが発生しました！")
        return "hello.html"
    }
}