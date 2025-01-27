package com.example.kotlintourexercises

/**
 * prints inferred types to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printInferredTypes() {
    println("**********print inferred types exercise**********")
    val myCustomers = 8
    println("there are currently $myCustomers customers")

    var updatedCustomers = myCustomers + 3
    println("there are currently $updatedCustomers customers")

    updatedCustomers += 7
    println("there are currently $updatedCustomers customers")

    updatedCustomers -= 3
    println("there are currently $updatedCustomers customers")

    updatedCustomers *= 2
    println("there are currently $updatedCustomers customers")

    updatedCustomers /= 3
    println("there are currently $updatedCustomers customers")
} // end printInferredTypes()

/**
 * prints declared types to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printDeclaredTypes() {
    println("**********print declared types exercise**********")
    val myDelta: Int
    myDelta = 3
    println("my delta value is $myDelta")

    val myEcho: String = "hello"
    println("my echo value is '$myEcho'")
} // end printDeclaredTypes()

/**
 * prints the basic types to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun displayBasicTypesExercise() {
    println("**********display basic types exercise**********")
    val myAlpha: Int = 1000
    val myBeta: String = "log message"
    val myCharlie: Float = 3.14f
    val myDelta: Long = 100_000_000_000_000
    val myEcho: Boolean = false
    val myFoxtrot: Char = '\n'

    println("my alpha value is $myAlpha")
    println("my beta value is '$myBeta'")
    println("my charlie value is $myCharlie")
    println("my delta value is ${String.format("%,d", myDelta)}")
    println("my echo value is $myEcho")
    println("my foxtrot value is $myFoxtrot")
} // end displayBasicTypesExercise()
