package com.example.quotes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    private final MessageRepository messageRepository;

    public ViewController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/chat")
    public String chat(Model model) {
        model.addAttribute("messages", messageRepository.findAll());
        return "redirect:/chat.html";
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", messageRepository.findAll());
        return "users";
    }
}
