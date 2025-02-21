package com.example.kotlintourexercises

/**
 * returns 1 if boolVal is true, otherwise returns 2
 *
 * @param boolVal the boolean value to check
 * @return 1 if boolVal is true, otherwise 2
 * @throws none
 * @see none
 */
fun checkStatus(boolVal: Boolean): Int {
    println("*****running checkStatus(boolVal: Boolean)*****")
    val d: Int = if (boolVal) {
        1
    } else {
        2
    } // end if

    return d
} // end checkStatus(boolVal: Boolean)

/**
 * returns the greater of two numbers
 *
 * @param num1 the first number
 * @param num2 the second number
 * @return the greater number
 * @throws none
 * @see none
 */
fun <T : Comparable<T>>compareGreaterNum(num1: T, num2: T): T {
    println("*****running compareGreaterNum(num1: T,num2: T)*****")

    return maxOf(num1, num2)
} // end checkGreaterNum(min: T, max: T)

// fun processGreeting() {
// }

fun processControlFlowExercises() {
    println("*****executing processControlFlowExercises()*****")

    val bVal = true
    val resultVal = checkStatus(bVal)
    println("the first return value result is: $resultVal")

    val bVal2 = false
    val resultVal2 = checkStatus(bVal2)
    println("the second return value result is: $resultVal2")

    val a = 5
    val b = 2
    val maxVal = compareGreaterNum(a, b)
    println("the greater number is: $maxVal")
} // end processControlFlowExercises()
