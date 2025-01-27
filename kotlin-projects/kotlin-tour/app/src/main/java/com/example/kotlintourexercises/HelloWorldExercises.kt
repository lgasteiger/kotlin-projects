package com.example.kotlintourexercises

/**
 * prints "Hello World" to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printHelloWorld() {
    println("**********print hello world exercise**********")
    println("hello world!")
} // end printHelloWord()

/**
 * prints variables to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printVariables() {
    println("**********print variables exercise**********")
    val popcorn = 5
    val hotdog = 7
    val customers = 10
    val updatedCustomers  = customers - 2

    println(updatedCustomers)
} // end printVariables()

/**
 * prints string templates to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printStringTemp() {
    println("**********print string templates exercise**********")
    val customers = 10
    println("there are $customers customers")
    println("there are ${customers + 1} customers")
} // end printStringTemp()

/**
 * prints hello world exercise to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printHelloWorldExercise() {
    println("**********print hello world exercise**********")
    val saviorMom = "mary"
    val saviorMomAge = 48

    println("'$saviorMom' is $saviorMomAge years old")
} // end printHelloWorldExercise()
