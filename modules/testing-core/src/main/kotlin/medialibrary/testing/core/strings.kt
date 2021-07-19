package medialibrary.testing.core

val lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz".toList()
val upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toList()

private val defaultAlphabet = (lowerCaseLetters + upperCaseLetters)

fun stringOfLength(length: Int, alphabet: Collection<Char> = defaultAlphabet) = StringBuilder()
    .apply { repeat(length) { append(alphabet.random()) } }
    .toString()
