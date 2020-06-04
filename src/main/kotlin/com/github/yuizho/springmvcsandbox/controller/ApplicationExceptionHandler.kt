package com.github.yuizho.springmvcsandbox.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ApplicationExceptionHandler {
    @ExceptionHandler
    fun handleException(ex: ApplicationException, servletRequest: HttpServletRequest, model: Model): ModelAndView {
        val context = servletRequest.getAttribute("context") as String
        return ModelAndView("error/500.html", mapOf("message" to ex.message, context to context))
    }

}

class ApplicationException(message: String) : RuntimeException(message)