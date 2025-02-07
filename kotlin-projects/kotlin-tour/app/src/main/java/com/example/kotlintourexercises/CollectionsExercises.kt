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
fun castImmutableCollection(collection: Collection<*>): Collection<*> {
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
} // end castImmutableCollection()

/**
 * prints edge (first and last) collection elements to the standard output
 *
 * @param collection the collection of elements to print
 * @return none
 * @throws none
 * @see none
 */
fun printCollEdgeElements(collection: Collection<*>) {
    println("**********prints edge (first and last) collection elements**********")
    println("the first collection element is: '${collection.first()}'")
    println("the last collection element is: '${collection.last()}'")
} // end printCollEdgeElements()

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
 * adds an element to the set collection
 *
 * @param set the set of elements
 * @return none
 * @throws none
 * @see none
 */
fun <T> addToSet(set: MutableSet<T>, element: T) {
    set.add(element)
} // end addToSet()

/**
 * adds a new language to the list collection
 *
 * @param myLanguages the list of languages
 * @return none
 * @throws none
 * @see addToList()
 */
fun addNewLanguage(myLanguages: MutableList<String>) {
    println("**********add new element to collection**********")
    println("please enter a new spoken language:")
    val inputLang = readlnOrNull()
    if (!inputLang.isNullOrEmpty()) {
        addToList(myLanguages, inputLang)
    } // end if
} // end addNewLanguage()

/**
 * adds a new agency to the set collection
 *
 * @param myAgencies the list of agencies
 * @return none
 * @throws none
 * @see addToSet()
 */
fun addNewAgency(myAgencies: MutableSet<String>) {
    println("**********add new government agency to set collection**********")
    println("please enter a new government agency:")
    val inputAgency = readlnOrNull()
    if (!inputAgency.isNullOrEmpty()) {
        addToSet(myAgencies, inputAgency)
    } // end if
} // end addNewAgency()

/**
 * deletes an element from the list or set collection
 *
 * @param collection the list or set of elements
 * @return
 * @throws none
 * @see none
 */
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
 * @see delListSetElem()
 */
fun delLanguage(collection: MutableCollection<String>) {
    println("**********delete existing language element**********")
    println("please enter the language to delete:")
    val inputLang = readlnOrNull()
    if (inputLang != null) {
        when (collection) {
            is List<*> -> {
                val uniqueElements = collection.distinct() as MutableList<String>
                delListSetElem(uniqueElements, inputLang)
                printListsSetsElem(uniqueElements)
                printCollectionSize(uniqueElements)
            }
            is Set<*> -> {
                delListSetElem(collection, inputLang)
            }
            else -> {
                println("unsupported collection type: $collection::class.simpleName")
            }
        } // end when (collection)
    } // end if
} // end delLanguage()

/**
 * deletes specified agency from the set collection
 *
 * @param collection the set of agencies
 * @return none
 * @throws none
 * @see delListSetElem()
 */
fun delAgency(collection: MutableCollection<String>) {
    println("**********delete existing government agency**********")
    println("please enter the government agency to delete:")
    val inputAgency = readlnOrNull()
    if (inputAgency != null) {
        when (collection) {
            is List<*> -> {
                val uniqueElements = collection.distinct() as MutableList<String>
                delListSetElem(uniqueElements, inputAgency)
                printListsSetsElem(uniqueElements)
                printCollectionSize(uniqueElements)
            }

            is Set<*> -> {
                delListSetElem(collection, inputAgency)
            }

            else -> {
                println("unsupported collection type: $collection::class.simpleName")
            }
        } // end when (collection)
    } // end if
} // end delAgency()

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
    val readOnlyLanguages = listOf("tagalog", "deutsch", "norwegian", "english", "english")
    printListsSetsElem(readOnlyLanguages)
    printCollectionSize(readOnlyLanguages)

    val mutableLanguages: MutableList<String> = readOnlyLanguages.toMutableList()
    addNewLanguage(mutableLanguages)
    printListsSetsElem(mutableLanguages)
    printCollectionSize(mutableLanguages)

    val languagesLocked = castImmutableCollection(mutableLanguages)
    // addNewLanguage(languagesLocked) // test for immutable list
    printListsSetsElem(languagesLocked)
    printCollectionSize(languagesLocked)

    printCollEdgeElements(languagesLocked)

    val isElementExists = isCollectionElemExists(languagesLocked, "english")
    println("is 'english' in the list? $isElementExists")
    val isHindiExists = isCollectionElemExists(languagesLocked, "hindi")
    println("is 'hindi' in the list? $isHindiExists")

    delLanguage(mutableLanguages)

    // set collection exercises
    println("**********set collection exercises**********")
    val readOnlyGovAgencies = setOf("cbp", "cia", "nsa", "fbi", "cbp", "fbi")
    printListsSetsElem(readOnlyGovAgencies)
    printCollectionSize(readOnlyGovAgencies)

    val mutableGovAgencies: MutableSet<String> = readOnlyGovAgencies.toMutableSet()
    addNewAgency(mutableGovAgencies)
    printListsSetsElem(mutableGovAgencies)
    printCollectionSize(mutableGovAgencies)

    val agenciesLocked = castImmutableCollection(mutableGovAgencies)
    printListsSetsElem(agenciesLocked)
    printCollectionSize(agenciesLocked)

    printCollEdgeElements(agenciesLocked)

    val isAgencyExists = isCollectionElemExists(agenciesLocked, "cia")
    println("is 'cia' in the set? $isAgencyExists")
    val isAgencyExists2 = isCollectionElemExists(agenciesLocked, "ciaa")
    println("is 'ciaa' in the set? $isAgencyExists2")

    delAgency(mutableGovAgencies)
    printListsSetsElem(mutableGovAgencies)
    printCollectionSize(mutableGovAgencies)

    // TODO: map collection exercises

} // end processCollectionExercises()
