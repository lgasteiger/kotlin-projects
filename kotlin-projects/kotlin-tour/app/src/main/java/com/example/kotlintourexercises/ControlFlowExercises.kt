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

/**
 * this function return true if value1 == value2. otherwise, return false
 *
 * @param value1 the first value
 * @param value2 the second value
 * @return true if value1 == value2. otherwise, return false
 * @throws none
 * @see none
 */
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

/**
 * this function represents the first exercise of the conditional expressions practice.
 * it prints to the console the result of rolling two dice
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
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

/**
 * this function runs the conditional expressions practice exercises 1 and 2
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun runCondExprPrac() {
    println("*****executing runCondExprPrac()*****")
    runExercise1()
    runExercise2()
} // end runCondExprPrac()

/**
 * this function creates a range of values from start to end inclusive
 *
 * @param start the start value
 * @param end the end value
 * @return a range of values from start to end inclusive
 * @throws IllegalArgumentException
 * @see none

fun <T> createRange(start: T, end: T, stepVal: Int = 1, inclusive: Boolean = true,
                    reverse: Boolean = false): ClosedRange<T> where T : Comparable<T> {
    println("*****executing createRange(start: T, end: T)*****")
    if (start > end) {
        throw IllegalArgumentException("start value must be less than or equal to end value")
    } // end if (start > end)

    if (stepVal <= 0) {
        throw IllegalArgumentException("step value must be greater than 0")
    } // end if (step <= 0)

    if (stepVal > 1) {
        return start..end
    } // end if (step > 1)

    return start..end
} // end createRange(start: T, end: T): ClosedRange<T> where T : Comparable<T>
*/

/**
 * this function tests the range use cases
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun testRangeForLoops() {
    println("*****executing testRangeForLoops()*****")
    println("-----print ascending numbers inclusive-----")
    for (number in 1..5) {
        println("number = $number")
    } // end for

    println("-----print ascending numbers non-inclusive-----")
    for (number in 1..5) {
        println("number = $number")
    } // end for

    println("-----print descending numbers inclusive-----")
    for (number in 5 downTo 1) {
        println("number = $number")
    } // end for

    println("-----print ascending number non-inclusive with step 2-----")
    for (number in 1..<5 step 2) {
        println("number = $number")
    } // end for

    println("-----print ascending chars inclusive-----")
    for (character in 'a'..'g') {
        println("character = $character")
    } // end for

    println("-----print descending chars inclusive with step 2")
    for (character in 'g' downTo 'a' step 2) {
        println("character = $character")
    } // end for
} // end testRangeForLoops()

/**
 * this function prints the status of the cake that were recently created
 *
 * @param cakesEaten the number of cakes eaten
 * @param cakesBaked the number of cakes baked
 * @param cakesMax the maximum number of cakes
 * @return none
 * @throws none
 * @see none
 */
fun printCakeStatus(cakesEaten: Int, cakesBaked: Int, cakesMax: Int) {
    println("*****executing cakeStatus()*****")
    var cakesEatenInc = cakesEaten
    var cakesBakedInc = cakesBaked

    while (cakesEatenInc < cakesMax) {
        println("please eat a cake")
        cakesEatenInc++
    } // end while
    do {
        println("please bake a cake")
        cakesBakedInc++
    } while (cakesBakedInc < cakesEatenInc)
} // end printCakeStatus()

fun whilePizzaSlicesImpl(maxPizzaSlices: Int) {
    println("-----whilePizzaSlicesImpl()-----")
    var pizzaSlices = 0
    while (pizzaSlices < maxPizzaSlices) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza:")
    } // end while

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
} // end whilePizzaSlicesImpl()

fun doWhilePizzaSlicesImpl(maxPizzaSlices: Int) {
    println("-----doWhilePizzaSlicesImpl()-----")
    var pizzaSlices = 0
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza:")
    } while (pizzaSlices < maxPizzaSlices) // end do...while

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
} // end doWhilePizzaSlicesImpl()

/**
 * this function is the first loop exercise from the brilliant kotlin documentation.
 * it will print out the pizza slices until the maximum number of slices is reached. it will
 * implement the "while" and "do...while" loops
 *
 * @param maxPizzaSlices the maximum number of pizza slices
 * @return none
 * @throws none
 * @see none
 */
fun loopExercise1(maxPizzaSlices: Int) {
    println("*****executing countPizzaSlices()*****")
    whilePizzaSlicesImpl(maxPizzaSlices)
    doWhilePizzaSlicesImpl(maxPizzaSlices)
} // end loopExercise1()

/**
 * this function is the second loop exercise from the brilliant kotlin documentation. it will
 * implement the "Fizzbuzz" game
 *
 * @param loopStart the start value for the loop
 * @param loopEnd the end value for the loop
 * @return none
 * @throws none
 * @see none
 */
fun loopExercise2(loopStart: Int, loopEnd: Int ) {
    println("*****executing loopExercise2()*****")
    for (num in loopStart..loopEnd) {
        if (num % 3 == 0 && num % 5 == 0) {
            println("fizzbuzz")
        } else if (num % 3 == 0) {
            println("fizz")
        } else if (num % 5 == 0) {
            println("buzz")
        } else {
            println(num)
        } // end if
    } // end for
} // end loopExercise2()

/**
 * this function is the third loop exercise from the brilliant kotlin documentation. it will
 * print out the words that start with the letter 'l' only
 *
 * @param wordsList the list of words
 * @return none
 * @throws none
 * @see none
 */
fun loopExercise3(wordsList: List<String>) {
    println("*****executing loopExercise3()*****")

    var numCount = 1
    for (word in wordsList) {
        val firstLetter = word.firstOrNull() ?: '\u0000'
        if (firstLetter == 'l' || firstLetter == 'L') {
            println("$numCount. '$word' starts with the letter 'l'")
            numCount++
        } // end if
    } // end for
} // end loopExercise3()

/**
 * this function is the driver for the loops exercises from the brilliant kotlin documentation
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun loopsExercises() {
    println("*****executing loopsExercises()*****")
    val totPizzaSlices = 8
    loopExercise1(totPizzaSlices)

    val myStart = 1
    val myEnd = 100
    loopExercise2(myStart, myEnd)

    val myWords = listOf("dinosaur", "limousine", "magazine", "Language")
    loopExercise3(myWords)
} // end loopsExercises()

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
/*
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

    testRangeForLoops()
    printCakeStatus(0, 0, 3)
*/
    loopsExercises()
} // end processControlFlowExercises()
