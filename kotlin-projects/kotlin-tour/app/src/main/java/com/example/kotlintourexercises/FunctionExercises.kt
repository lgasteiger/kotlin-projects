package com.example.kotlintourexercises

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

fun castToImmutableList(mutableRegList: MutableList<List<String>>): List<List<String>> {
    println("*****executing castToImmutableList()*****")
    val listLocked = mutableRegList.toList()
    // val listLocked: List<List<String>> = mutableRegList
    return listLocked
} // end castToImmutableList()

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
