package com.example.kotlintourexercises

fun printMessWithPrefix(message: String, prefix: String) {
    println("*****executing printMessWithPrefix()*****")
    println("[$prefix] $message")
} // end printMessWithPrefix()

fun launchNamedArgsExer() {
    println("*****executing launchNamedArgsExer()*****")
    printMessWithPrefix(prefix = "Log", message = "Hello")
} // end launchNamedArgsExer()
