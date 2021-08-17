package com.example.jokeapp.services
import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl(val chuckNorrisQuotes: ChuckNorrisQuotes = ChuckNorrisQuotes()) : JokeService {
    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}