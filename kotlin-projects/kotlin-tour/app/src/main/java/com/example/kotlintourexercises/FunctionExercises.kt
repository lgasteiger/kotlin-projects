package com.example.kotlintourexercises

import java.text.DecimalFormat

/**
 * prints prefix and message info to the console using named arguments
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("*****executing printMessWithPrefix()*****")
    println("[$prefix] $message")
} // end printMessageWithPrefix()

/**
 * this function prints to the console diff parameter value variations.
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printDefaultParamValsPrac() {
    println("*****executing printDefaultParamValsPrac()*****")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
} // end printDefaultParamValsPrac()

/**
 * this function launches the named arguments exercise
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printNamedArgsPrac() {
    println("*****executing launchNamedArgsExer()*****")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
} // end launchNamedArgsPrac()

/**
 * this function calculates the registration id for a new user
 *
 * @param existingRegistrations the existing registrations
 * @return the new registration id
 * @throws none
 * @see none
 */
fun calcRegId(existingRegistrations: List<List<String>>): String {
    println("*****executing calcRegId()*****")
    var maxId = 0
    existingRegistrations.forEach { user ->
        try {
            val regId = user.first().toInt()
            if (regId > maxId) {
                maxId = regId
            } // end if
        } catch (e: NumberFormatException) {
            println("!!!!!Invalid number format: ${user.first()}, ${e.message}!!!!!")
        } // end try...catch
    } // end forEach

    return (maxId + 1).toString()
} // end calcRegId()

/**
 * this function casts a mutable list to an immutable list
 *
 * @param mutableRegList the mutable list
 * @return the immutable list
 * @throws none
 * @see none
 */
fun castToImmutableList(mutableRegList: MutableList<List<String>>): List<List<String>> {
    println("*****executing castToImmutableList()*****")
    val listLocked = mutableRegList.toList()
    // val listLocked: List<List<String>> = mutableRegList
    return listLocked
} // end castToImmutableList()

/**
 * this function registers a new user. if the username or email address already exists, an error
 * message is returned
 *
 * @param currRegistrationsUnlocked the current registrations
 * @param lname the last name
 * @param fname the first name
 * @param username the username
 * @param emailAddr the email address
 * @return the error message if the username or email address already exists, otherwise the success
 *         message
 * @throws none
 * @see none
 */
fun registerUser(currRegistrationsUnlocked: MutableList<List<String>>, lname: String, fname: String,
                 username: String, emailAddr: String): String {
    println("*****executing registerUser()*****")
    currRegistrationsUnlocked.forEach { user ->
        if (username in user) {
            return "!!!!!username already taken. please choose different username!!!!!"
        } // end if

        if (emailAddr in user) {
            return "!!!!!email already registered. please choose different email!!!!!"
        } // end if
    } // end forEach

    val newRegId = calcRegId(currRegistrationsUnlocked)
    val newUser = listOf(newRegId, lname, fname, username, emailAddr)
    currRegistrationsUnlocked.add(newUser)
    return "user registered successfully: $emailAddr"
} // end registerUser()

/**
 * this function processes registration information
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun processRegInfo() {
    println("*****executing processRegInfo()*****")
    val userAltmanSam = listOf("1", "altman", "sam", "saltman", "altman.sam@openai.ai")
    val userMuskElon = listOf("250", "musk", "elon", "emusk", "elon.musk@spacex.xi")
    val userFridmanLex = listOf("55", "fridman", "lex", "lfridman", "lex.fridman@mit.edu")
    val registeredUsers = listOf(userAltmanSam, userMuskElon, userFridmanLex)

    // TODO: prompt for new user, username, email
    // TODO: converted new user, username, email to lowercase
    val registeredUsersUpdatable = registeredUsers.toMutableList()
    println(registerUser(registeredUsersUpdatable, "gasteiger", "lg", "lggasteiger",
        "gasteiger.lg@state.gov"))
    val registeredUsersLocked = castToImmutableList(registeredUsersUpdatable)
    registeredUsersLocked.forEach { user ->
        println(user)
    } // end forEach
} // end processRegInfo()

/**
 * this function calculates the area of a circle
 *
 * @param radius the radius of the circle
 * @return the area of the circle
 * @throws none
 * @see none
 */
fun circleArea(radius: Double): Double {
    println("*****executing circleArea()*****")
    return Math.PI * radius * radius
} // end circleArea()

/**
 * this function calculates the area of a circle using a simple expression
 *
 * @param radius the radius of the circle
 * @return the area of the circle
 * @throws none
 * @see none
 */
fun circleAreaV2(radius: Double): Double = Math.PI * radius * radius

/**
 * this function runs exercise 1 for the "functions" practice exercises
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun functionsExercise1() {
    println("*****executing functionsExercise1()*****")
    // println("please enter the radius of the circle:")
    // val radius = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val circleRadius = 2.0
    println("the area of the circle is: ${circleArea(circleRadius)}")
} // end functionsExercise1()

/**
 * this function runs exercise 2 for the "functions" practice exercises
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun functionsExercise2() {
    println("*****executing functionsExercise2()*****")
    val circleArea = 5.0
    println("the area of the circle with a simple expression f(x) is: ${circleAreaV2(circleArea)}")
} // end functionsExercise2()

fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int): Int {
    println("*****executing intervalInSeconds()*****")
    return ((hours * 60) + minutes) * 60 + seconds
    // val hoursInMinutes = hours * 60
    // val totalMinutes = hoursInMinutes + minutes
    // val minutesInSeconds = totalMinutes * 60
    // val totalSeconds = minutesInSeconds + seconds
    // return totalSeconds
} // end intervalInSeconds()

fun functionsExercise3() {
    println("*****executing functionsExercise3()*****")
    val test1 = intervalInSeconds(1, 20, 15)
    val formatter = DecimalFormat("#,###")
    println("the interval in seconds for 1 hour, 20 minutes, and 15 seconds is: " +
            "${formatter.format(test1)} seconds")

    val test2 = intervalInSeconds(0, 1, 25)
    println("the interval in seconds for 1 minute and 25 seconds is: ${formatter.format(test2)} " +
            "seconds")

    val test3 = intervalInSeconds(2, 0, 0)
    println("the interval in seconds for 2 hours is: ${formatter.format(test3)} seconds")

    val test4 = intervalInSeconds(0, 10, 0)
    println("the interval in seconds for 10 minutes is: ${formatter.format(test4)} seconds")

    val test5 = intervalInSeconds(24, 0, 0)
    println("the interval in seconds for 24 hours is: ${formatter.format(test5)} seconds")
} // end functionsExercise3()

fun upperCaseString(str: String): String {
    println("*****executing upperCaseString()*****")
    return str.uppercase()
} // end upperCaseString()

fun passToAnotherFunc(myOriginalList: List<Int>) {
    println("*****executing passToAnotherFunc() lambda expression example*****")
    val positives = myOriginalList.filter ({ x -> x > 0 })
    val isNegative = { x: Int -> x < 0 }
    val negatives = myOriginalList.filter(isNegative)

    println("positives: $positives")
    println("negatives: $negatives")
} // end passToAnotherFunc()

fun transformItems(myOriginalList: List<Int>) {
     println("*****executing transformItems()*****")
     val doubledNums = myOriginalList.map { x -> x * 2 }
     val tripledNums = myOriginalList.map { x -> x * 3 }
     println("doubled numbers: $doubledNums")
     println("tripled numbers: $tripledNums")
} // end transformItems()

fun strFuncTypeExercise(myStr: String) {
    println("*****executing strFuncTypeExercise()*****")
    val upperCaseString: (String) -> String = { text -> text.uppercase() }
    println(upperCaseString(myStr))
} // end strFuncTypeExercise()

fun lambdaExprExercises() {
    println("*****executing lambdaExprExercises()*****")
    println(upperCaseString("hello world! using normal function syntax"))

    val allLowercaseString = { text: String -> text.lowercase() }
    println(allLowercaseString("HeLLO wORLD! using lambda expression syntax"))

    val myNumsList = listOf(1, -2, 3, -4, 5, -6)
    passToAnotherFunc(myNumsList)
    transformItems(myNumsList)

    val myTestStr = "this is going TO bE a GREAT Competition"
    strFuncTypeExercise(myTestStr)
} // end lambdaExprExercises()
