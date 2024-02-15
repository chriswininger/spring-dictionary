package com.chriswininger.springdictionary.api.lemma

import edu.stanford.nlp.pipeline.StanfordCoreNLP
import java.util.Properties

fun lemmatizeWord(word: String): String {
  val props = Properties()
  props.setProperty("annotators", "tokenize,pos,lemma")

  val pipeline = StanfordCoreNLP(props)

  val document = pipeline.processToCoreDocument(word)

  return document.tokens().first().lemma()
}
