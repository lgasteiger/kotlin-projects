package com.example.kotlintourexercises

/**
 * prints list exercises to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printListExercises() {
    println("**********print list exercises**********")
    println("+++++inferred immutable list exercise+++++")
    val readOnlyShapes = listOf("triangle", "square", "circle")
    readOnlyShapes.forEachIndexed { index, shape ->
        println("${index + 1}. $shape")
    } // end forEachIndexed

    println("+++++declared mutable list exercise+++++")
    val mutableStreamingShows: MutableList<String> = mutableListOf("castlevania noctural",
        "creature commandos", "friendly neighborhood spider-man")
    mutableStreamingShows.forEachIndexed { index, show ->
        println("${index + 1}. $show")
    } // end forEachIndexed
} // end printListExercises()

/**
 * prints casting exercises to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printCastingExercise() {
    println("**********print casting exercises**********")
    val myToolBox: MutableList<String> = mutableListOf("hammer", "electric wire", "gloves")
    val toolBoxLocked: List<String> = myToolBox
    println("the second tool in the toolbox is '${toolBoxLocked[1]}'")
} // end printCastingExercise()

/**
 * prints edge (first and last) elements to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printEdgeElements() {
    println("**********print edge (first and last) elements exercise**********")
    val readOnlyLanguages = listOf("tagalog", "deutch", "norwegian", "english")
    println("the first language is '${readOnlyLanguages.first()}'")
    println("the last language is '${readOnlyLanguages.last()}'")
} // end printEdgeElements()

/**
 * prints list size to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printListSize() {
    println("**********print list size exercise**********")
    val readOnlyProgLang = listOf("kotlin", "javascript", "rust", "python")
    println("the size of the list is ${readOnlyProgLang.count()}")
} // end printListSize()
