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
//fun printCollectionSize(collection: Any) {
//    println("**********print collection list, set, or map size exercise**********")
//    when (collection) {
//        is List<*> -> {
//            println("the size of the list is ${collection.count()}")
//        }
//        is Set<*> -> {
//            println("the size of the set is ${collection.count()}")
//        }
//        is Map<*, *> -> {
//            println("the size of the map is ${collection.count()}")
//        }
//        else -> {
//            println("unsupported collection type: $collection::class.simpleName")
//        }
//    } // end when (collection)
// } // end printListSize()

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
    println("**********is collection element exists exercise**********")
    val isExistsCollElem = if (element in collection) true else false
    return isExistsCollElem
} // end isCollectionElemExists()

/**
 * adds farm crops and prints the updated list to the standard output
 */
fun addNewLanguage(myLanguages: MutableList<String>) {
    println("**********add new spoken language**********")
    println("please enter a new spoken language:")
    val inputLang = readlnOrNull()
    if (!inputLang.isNullOrEmpty()) {
        myLanguages.add(inputLang.toString())
    } // end if
} // end addFarmCrops()

/**
 * deletes farm equipment and prints the updated list to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun delFarmEquip() {
    println("**********delete farm equipment exercise**********")
    val farmEquipment: MutableList<String> = mutableListOf("shovel", "hoe", "water filter",
        "tractor",)
    println("-----the farm equipment list before deletion-----")
    // printCollectionElem(farmEquipment)
    farmEquipment.remove("shovel")
    println("-----the farm equipment list after deletion of 'shovel' element-----")
    // printCollectionElem(farmEquipment)
} // end delFarmEquip()

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
 * is the driver for processing all the collection exercises
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

    val mutableLanguages: MutableList<String> = readOnlyLanguages.toMutableList()
    addNewLanguage(mutableLanguages)
    printListsSetsElem(mutableLanguages)

    val languagesLocked = castImmutableListsSetsColl(mutableLanguages)
    // addNewLanguage(languagesLocked) // test for immutable list
    printListsSetsElem(languagesLocked)

    printListEdgeElements(languagesLocked)

    val isElementExists = isCollectionElemExists(languagesLocked, "bali")
    println("is 'english' in the list? $isElementExists")
    
    // delFarmEquip()

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
