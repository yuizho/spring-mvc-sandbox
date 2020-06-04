package com.github.yuizho.springmvcsandbox.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ModelAttribute
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ModelAttributeControllerAdvice {
    @ModelAttribute
    fun setAttributes(model: Model, servletRequest: HttpServletRequest) {
        val context = "this is context set by controller advice"
        model.addAttribute("context", context)
        servletRequest.setAttribute("context", context)
        println(System.identityHashCode(servletRequest))
    }
}