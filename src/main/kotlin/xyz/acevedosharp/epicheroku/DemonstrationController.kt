package xyz.acevedosharp.epicheroku

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class DemonstrationController {
    private val messages = arrayListOf<String>()

    @GetMapping("/messages")
    @ResponseBody
    fun allMessages() = messages

    @GetMapping("/messages/new")
    @ResponseBody
    fun newMessage(@RequestParam("content") content: String): String {
        messages.add(content)
        return "Successfully added $content"
    }
}