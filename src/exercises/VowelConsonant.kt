package exercises

import java.lang.StringBuilder

const val vowels = "aeiou"
const val consonants = "bcdfghjklmnpqrstvwxyz"

fun countVowels(text: String): Int {
    var counter = 0
    for(i in text) {
        if(i.toLowerCase() in vowels){
            counter += 1
        }
    }
    return counter
}

fun countConsonants(text: String): Int {
    var counter = 0
    for(i in text) {
        if(i.toLowerCase() in consonants){
            counter += 1
        }
    }
    return counter
}