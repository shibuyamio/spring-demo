package com.example.jokeapp.controllers

import com.example.jokeapp.services.JokeService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class JokeController(val jokeService: JokeService) {
    @GetMapping("/")
    fun showJoke(model: Model): String {
        model.addAttribute("joke", jokeService.getJoke())
        return "index"
    }
}