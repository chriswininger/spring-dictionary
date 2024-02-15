Spring Dictionary
==================

I am exploring natural language processing. I was hoping to make some kind of multi lingual smart dictionary

I wanted to start by finding the lemma of a given word to simplify lookup

This first passing is using stanford-corenlp and is being done for English. Ultimately I'm more interested in Russian.

## Here is some documentation on stanford-corenlp:

* example code: https://stanfordnlp.github.io/CoreNLP/lemma.html
* maven central page: https://central.sonatype.com/artifact/edu.stanford.nlp/stanford-corenlp
* make sure you include the models classifier or you'll get an error like
  this: https://stackoverflow.com/questions/63252143/cant-load-tagger-model-in-stanford-corenlp-java-api/78003650#78003650

## Building and Running

`./gradlew build`
`java -jar ./build/libs/spring-dictionary-0.0.1-SNAPSHOT.jar`

You can test the initial endpoint with curl by running `./test-query.sh`

## Other Notes

This is JVM only I could not get it to work using a multiplatform project where web assembly was the target
