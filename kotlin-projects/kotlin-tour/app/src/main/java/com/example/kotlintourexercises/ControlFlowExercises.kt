package com.example.kotlintourexercises

import kotlin.random.Random

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

/**
 * checks if a string is a real number on the number line
 *
 * @param input the string to check
 * @return true if the string is a real number, otherwise false
 * @throws none
 * @see none
 */
fun isRealNumber(input: String): Boolean {
    println("*****executing isRealNumber()*****")

    return try {
        input.toDouble()
        true
    } catch (e: NumberFormatException) {
        false
    } // end try...catch
} // end isRealNumber(input: String)

/**
 * processes a greeting
 *
 * @param strArg the string to process
 * @return the processed string greeting
 * @throws none
 * @see none
 */
fun processGreeting(strArg: String): String {
    println("*****executing processGreeting()*****")

    val lowerCaseFormat = strArg.lowercase()
    var strReturn: String = ""

    if (isRealNumber(lowerCaseFormat)) {
        when (strArg) {
            "1" -> strReturn = "one"
            "2" -> strReturn =  "two"
            "3" -> strReturn = "three"
            "4" -> strReturn = "four"
            "5" -> strReturn = "five"
            "6" -> strReturn = "six"
            "7" -> strReturn = "seven"
            "8" -> strReturn = "eight"
            "9" -> strReturn = "nine"
        } // end when (strArg)
    } else if (lowerCaseFormat == "hello") {
        strReturn = "greeting"
    } else {
        strReturn = "unknown"
    } // end if...else

    return strReturn
} // end processGreeting()

/**
 * prints the traffic light status
 *
 * @param color the color of the traffic light
 * @return none
 * @throws none
 * @see none
 */
fun printTrafficLightStatus(color: String) {
    println("*****executing printTrafficLightStatus()*****")

    val colorLowercase = color.lowercase()
    val trafficAction = when (colorLowercase) {
        "green" -> "Go"
        "yellow" -> "Get ready"
        "red" -> "Stop"
        else -> "malfunction"
    } // end when (color)

    val colorLowercaseCapitalized = colorLowercase.replaceFirstChar { it.uppercase() }
    println("the traffic light is '$colorLowercaseCapitalized' and the action is '$trafficAction'")
} // end printTrafficLightStatus(color: String)

fun compareNumVals(value1: Number, value2: Number): Boolean {
    println("*****executing compareNumVals()*****")

    return value1.toDouble() == value2.toDouble()
} // end compareNumVals(value1: Number, value2: Number)

/**
 * this function represents the first exercise of the conditional expressions practice
 * moreover, two dice are rolled and a winner is determined
 *
 * @param dice1 the first dice
 * @param dice2 the second dice
 * @returns the result of the roll
 * @throws none
 * @see none
 */
fun <T> rollDice(dice1: T, dice2: T): String {
    println("*****executing rollDice()*****")

    /* TODO: need to implement data type checking prior to equivalence comparison */

    try {
        if (dice1 === dice2) {
            return "You win :)"
        } else {
            return "You lose :("
        } // end if...else
    } catch (e: ClassCastException) {
        return "You must roll dice of the same type: ${e.message}"
    } catch (e: Exception) {
        return "comparison error: ${e.message}"
    } // end try...catch
} // end rollDice(dice1: Number, dice2: T)

/**
 * this function returns the action for a given button
 *
 * @param strButton the button to check
 * @return the action for the button
 * @throws none
 * @see none
 */
fun getButtonAction(strButton: String): String {
    println("*****executing getButtonAction()*****")
    val strAction = when (strButton) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    } // end when (strButton)

    return strAction
} // end getButtonAction(strButton: String): String

/**
 * this function prompts the user to continue or not
 *
 * @param none
 * @return true if the user wants to continue, false otherwise
 * @throws none
 * @see none
 */
fun isContinue(): Boolean {
    println("*****executing isContinue()*****")
    println("do you want to continue? (y/n)")
    val strContinue = readln().trim().lowercase()
    if (strContinue == "n" || strContinue == "N") {
        return false
    } // end if (strContinue != "y")
    return strContinue.lowercase() == "y"
} // end isContinue(strContinue: String): Boolean

fun runExercise1() {
    println("-----conditional expression practice, exercise 1-----")
    var continueExecution = true
    while (continueExecution) {
        val dice1 = Random.nextInt(6)
        val dice2 = Random.nextInt(6)
        val result = rollDice(dice1, dice2)
        println("dice1: $dice1, dice2: $dice2")
        println(result)
        continueExecution = isContinue()
    } // end while (continueExecution)
} // end runExercise1()

/**
 * this function represents the second exercise of the conditional expressions practice.
 * it prompts the user to enter a button and returns the action for that button
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun runExercise2() {
    println("-----conditional expression practice, exercise 2-----")
    var continueExecution = true
    while (continueExecution) {
        println("please enter a button:")
        val strButton = readln().trim().uppercase()
        val strAction = getButtonAction(strButton)
        println("the action for button '$strButton' is '$strAction'")
        continueExecution = isContinue()
    } // end while (continueExecution)
} // end runExercise2()

fun runCondExprPrac() {
    println("*****executing runCondExprPrac()*****")
    runExercise1()
    runExercise2()
} // end runCondExprPrac()

/**
 * this is the driver for the control flow exercises from the brilliant kotlin documentation
 * "kotlin tour" tutorial
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
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

    val c = 5.2
    val d = 2.5
    val maxVal2 = compareGreaterNum(c, d)
    println("the greater number is: $maxVal2")

    val obj = "Hello"
    val strResult = processGreeting(obj)
    val strCapitalized = strResult.replaceFirstChar { it.uppercase() }
    println("the string result is: $strCapitalized")

    val obj2 = 5
    val strResult2 = processGreeting(obj2.toString())
    val strCapitalized2 = strResult2.replaceFirstChar { it.uppercase() }
    println("the string result is: $strCapitalized2")

    val trafficLightColor = "YELLOW"
    printTrafficLightStatus(trafficLightColor)

    val trafficLightColor2 = "Red"
    printTrafficLightStatus(trafficLightColor2)

    runCondExprPrac()
} // end processControlFlowExercises()
