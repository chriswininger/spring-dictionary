package com.chriswininger.springdictionary.api

import com.chriswininger.springdictionary.api.lemma.lemmatizeWord
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/api/v1/lemma")
class LemmaController {
  @PostMapping()
  fun getLemmonization(
    @RequestBody lemmonizeWordRequest: LemmonizeWordRequest
  ): LemmonizationResult {
    val lemma = lemmatizeWord(lemmonizeWordRequest.word)
    return LemmonizationResult(lemma)
  }
}

data class LemmonizeWordRequest(val word: String)
data class LemmonizationResult(val word: String)
