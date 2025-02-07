package com.example.kotlintourexercises

/**
 * prints collection of lists, sets elements to standard output
 *
 * @param collection the collection of elements to print
 * @return none
 * @throws none
 * @see none
 */
fun printListsSetsElem(collection: Collection<*>) {
    println("+++++prints elements in any list or set collection+++++")
    when (collection) {
        is List<*> -> {
            collection.forEachIndexed { index, item ->
                println("${index + 1}. $item")
            }
        }
        is Set<*> -> {
            collection.forEachIndexed { index, item ->
                println("${index + 1}. $item")
            } // end forEachIndexed
        }
        else -> {
            println("unsupported collection type: $collection::class.simpleName")
        }
    } // end when (collection)
} // end printListsSetsElem(collection: Collection<String>)

/**
 * prints elements in any map collection
 *
 * @param collection the collection of elements to print
 * @return none
 * @throws none
 * @see none
 */
fun printMapElements(collection: Map<*, *>) {
    println("+++++prints elements in any map collection+++++")
    collection.forEach { (key, value) ->
        println("key: $key, value: $value")
    } // end forEach
} // end printMapElements(collection: Map<*, *>)

/**
 * prints casting exercises to the standard output
 *
 * @param collection the collection of elements to print
 * @return immutable list or set collection
 * @throws none
 * @see none
 */
fun castImmutableListsSetsColl(collection: Collection<*>): Collection<*> {
    println("**********return immutable collection version**********")
    when (collection) {
        is List<*> -> {
            val listLocked: List<*> = collection
            return listLocked
        }
        is Set<*> -> {
            val setLocked: Set<*> = collection
            return setLocked
        }
//        is Map<*, *> -> {
//            return collection.toMutableMap()
//        }
        else -> {
            println("unsupported collection type: $collection::class.simpleName")
            return collection
        } // end is...else
    } // end when (collection)
} // end castImmutableListsSetsColl()

/**
 * prints edge (first and last) collection elements to the standard output
 *
 * @param collection the collection of elements to print
 * @return none
 * @throws none
 * @see none
 */
fun printListEdgeElements(collection: Collection<*>) {
    println("**********prints edge (first and last) collection elements**********")
    println("the first collection element is: '${collection.first()}'")
    println("the last collection element is: '${collection.last()}'")
} // end printEdgeElements()

/**
 * prints list size to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun <T> printCollectionSize(collection: Collection<T>) {
    println("**********prints collection list, set, or map size**********")
    return println("the size of the collection is ${collection.count()}")
} // end printCollectionSize()

/**
 * returns true to standard output if an element exists in the list or set collection.
 * otherwise, return false
 *
 * @param collection the collection of elements to print
 * @param element the element to search for
 * @return true if element exists in the collection, otherwise false
 * @throws none
 * @see none
 */
fun isCollectionElemExists(collection: Collection<*>, element: String): Boolean {
    println("**********is collection element exists test**********")
    val isExistsCollElem = if (element in collection) true else false
    return isExistsCollElem
} // end isCollectionElemExists()

/**
 * adds an element to the list collection
 *
 * @param list the list of elements
 * @param element the element to add
 * @return none
 * @throws none
 */
fun <T> addToList(list: MutableList<T>, element: T) {
    list.add(element)
} // end addToList()

/**
 * adds a new language to the list collection
 *
 * @param myLanguages the list of languages
 * @return none
 * @throws none
 * @see none
 */
fun addNewLanguage(myLanguages: MutableList<String>) {
    println("**********add new element to collection**********")
    println("please enter a new spoken language:")
    val inputLang = readlnOrNull()
    if (!inputLang.isNullOrEmpty()) {
        addToList(myLanguages, inputLang)
    } // end if
} // end addNewLanguage()

fun <T> delListSetElem(collection: MutableCollection<T>, element: T) {
    println("**********delete existing list or set collection element**********")
    collection.remove(element)
} // end delListSetElem()

/**
 * deletes specified language from the list collection
 *
 * @param currLanguages the list of languages
 * @return none
 * @throws none
 * @see none
 */
fun delCurrLanguage(currLanguages: MutableList<String>) {
    println("**********delete existing language exercise**********")
    println("please enter the language to delete:")
    val inputLang = readlnOrNull()
    if (inputLang != null) {
        delListSetElem(currLanguages, inputLang)
    } // end if
} // end delCurrLanguage()

/**
 * prints read only unique set elements to standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printImmutableSetExercise() {
    println("**********print read only set exercise**********")
    val readOnlyGovAgencies = setOf("cbp", "cia", "nsa", "fbi", "cbp", "fbi")
    // printCollectionElem(readOnlyGovAgencies)
} // end printImmutableSetExercise()

/**
 * prints mutable unique set elements to standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printMutableSetExercise() {
    println("**********print mutable set exercise*******")
    val superheroes: MutableSet<String> = mutableSetOf("superman", "batman", "wonder woman",
        "flash", "batman", "robin", "robin")
    // printCollectionElem(superheroes)
} // end printSetExercises()

/**
 * prints the number of elements in the set to standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun getAircraftCount() {
    println("**********get aircraft count exercise**********")
    val readOnlyAircraft = setOf("F-18", "F-16", "F-14",)
    println("the number of aircraft is ${readOnlyAircraft.count()}")
} // end getAircraftCount()

/**
 * adds a new element to the set collection data structure
 * @param newShipName the name of the new naval ship
 * @return none
 * @throws none
 * @see none
 */
fun addNewShipType(newShipType: String, navalShipTypes: MutableList<String>) {
    println("**********add new naval ship type exercise**********")
    if (newShipType !in navalShipTypes) {
        navalShipTypes.add(newShipType)
        // printElements(navalShipTypes)
    } // end if
} // end addNewShipType(newShipName: String, navalShipTypes: MutableList<String>)

fun delShipType(existingShipType: String, navalShipTypes: MutableList<String>) {
    println("**********delete naval ship type exercise**********")
    if (existingShipType in navalShipTypes) {
        navalShipTypes.remove(existingShipType)
        // printElements(navalShipTypes)
    } // end if
} // end delShipType(existingShipType: String)

/**
 * prints an immutable map to standard output
 */
fun printImmutableMapExercise() {
    println("**********print immutable map exercise**********")
    val readOnlySpacecraft = mapOf("starship" to "musk, elon", "blue origin" to "bezos, jeff",
        "star trek" to "shatner, william")
    readOnlySpacecraft.forEach { (key, value) ->
        println("key: $key - value: $value")
    } // end forEach
} // end printImmutableMapExercise()

/**
 * is the driver for processing all the collection function exercises
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun processCollectionExercises() {
    println("**********list collection exercises**********")
    val readOnlyLanguages = listOf("tagalog", "deutsch", "norwegian", "english")
    printListsSetsElem(readOnlyLanguages)
    printCollectionSize(readOnlyLanguages)

    val mutableLanguages: MutableList<String> = readOnlyLanguages.toMutableList()
    addNewLanguage(mutableLanguages)
    printListsSetsElem(mutableLanguages)
    printCollectionSize(mutableLanguages)

    val languagesLocked = castImmutableListsSetsColl(mutableLanguages)
    // addNewLanguage(languagesLocked) // test for immutable list
    printListsSetsElem(languagesLocked)
    printCollectionSize(languagesLocked)

    printListEdgeElements(languagesLocked)

    val isElementExists = isCollectionElemExists(languagesLocked, "english")
    println("is 'english' in the list? $isElementExists")
    val isHindiExists = isCollectionElemExists(languagesLocked, "hindi")
    println("is 'hindi' in the list? $isHindiExists")

    delCurrLanguage(mutableLanguages)
    printListsSetsElem(mutableLanguages)
    printCollectionSize(mutableLanguages)

    // set collection exercises
    // printImmutableSetExercise()
    // printMutableSetExercise()
    // getAircraftCount()

    // val navalShipTypes: MutableList<String> = mutableListOf("supply ship", "aircraft carrier",
    //    "battleship", "cutter",)
    // addNewShipType("reconnaissance", navalShipTypes)
    // delShipType("aircraft carrier", navalShipTypes)

    // map collection exercises

    /**
     * TODO: add prompt to return specific element to standard output
     * println("the second tool in the toolbox is '${toolBoxLocked[1]}'")
     */
} // end processCollectionExercises()
