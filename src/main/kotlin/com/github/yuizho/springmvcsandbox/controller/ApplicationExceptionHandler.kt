package com.github.yuizho.springmvcsandbox.controller

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.ModelAndView

@ControllerAdvice
class ApplicationExceptionHandler {
    @ExceptionHandler
    fun handleException(ex: ApplicationException): ModelAndView {
        return ModelAndView("error/500.html", mapOf("message" to ex.message))
    }

}

class ApplicationException(message: String) : RuntimeException(message)