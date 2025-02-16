package com.example.kotlintourexercises

/**
 * this is the first collection assignment, which prints the total number of integers to
 * standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun collectionsAssign1() {
    println("*****this is the first collection assignment*****")

    val greenNumbers = listOf(1, 4, 13)
    val redNumbers = listOf(17, 2)
    val totalNumbers = greenNumbers.count() + redNumbers.count()
    println("the total # of integers is: $totalNumbers")
} // end collectionAssign1()

/**
 * this is the second collection assignment, which prints to standard output whether or not
 * the requested protocol is supported
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun collectionsAssign2() {
    println("*****this is the second collection assignment*****")

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    // val isSupported = if (requested.uppercase() in SUPPORTED) true else false
    println("Support for '$requested': $isSupported")
} // end collectionAssign2()

fun collectionsAssign3() {
    println("*****this is the third collection assignment*****")

    val number2Word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2Word[n]}'")
} // end collectionAssign3()
