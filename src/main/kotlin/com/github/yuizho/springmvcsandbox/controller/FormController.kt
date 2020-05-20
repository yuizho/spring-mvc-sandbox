package com.github.yuizho.springmvcsandbox.controller


import org.springframework.format.annotation.DateTimeFormat
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import java.io.Serializable
import java.time.LocalDate
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Controller
@RequestMapping("/form")
class FormController {
    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("accountForm", AccountForm())
        return "form/index"
    }

    /**
     * This handler method receives form object and redirect to complete page.
     */
    @PostMapping("/post")
    fun post(model: Model, accountForm: AccountForm, redirectAttributes: RedirectAttributes): String {
        // this object will be stored HttpSession temporary
        // when the recirect is completed, the session will be discarded.
        redirectAttributes.addFlashAttribute(accountForm)
        println(accountForm)
        return "redirect:complete"
    }

    @GetMapping("/complete")
    fun complete(model: Model, accountForm: AccountForm): String {
        model.addAttribute("account", accountForm)
        return "form/complete"
    }
}

data class AccountForm(
        @field:NotNull
        @field:Size(min = 1, max = 20)
        val name: String = "",
        @field:DateTimeFormat(pattern = "yyyy-MM-dd")
        val dateOfBirth: LocalDate? = null,
        @field:Size(min = 9, max = 50)
        val email: String? = null
) : Serializable