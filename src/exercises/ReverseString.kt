package exercises

import java.lang.StringBuilder

fun reverseUsingSB(str: String): String
{
    /**
    var sb: StringBuilder = StringBuilder(str)
    var textReversed = sb.reverse()
    return "$textReversed"
    */
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var textLength: Int = str.length
    var result = ""
    for(i in textLength-1 downTo 0) {
        result += str.get(i)
    }
    return result
}