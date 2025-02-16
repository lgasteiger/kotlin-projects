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
    var count = 0
    collection.forEach { (key, value) ->
        println("${++count}. key: $key, value: $value")
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
fun <T> castImmutableListSet(collection: Collection<T>): Collection<T> {
    println("**********return immutable collection version**********")
    when (collection) {
        is List<*> -> {
            val listLocked: Collection<T> = collection
            return listLocked
        }
        is Set<*> -> {
            val setLocked: Collection<T> = collection
            return setLocked
        }
        else -> {
            println("unsupported collection type: $collection::class.simpleName")
            return collection
        } // end is...else
    } // end when (collection)
} // end castImmutableListSet()

fun <T> castImmutableMap(collection: Map<T, T>): Map<T, T> {
    println("**********cast to immutable map collection**********")
    val mapLocked: Map<T, T> = collection
    return mapLocked
} // end castImmutableMap()

/**
 * prints edge (first and last) collection elements to the standard output
 *
 * @param collection the collection of elements to print
 * @return none
 * @throws none
 * @see none
 */
fun printListSetEdgeElem(collection: Collection<*>) {
    println("**********prints edge (first and last) collection elements**********")
    println("the first collection element is: '${collection.first()}'")
    println("the last collection element is: '${collection.last()}'")
} // end printListSetEdgeElements()

/**
 * prints list size to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printListSetSize(collection: Collection<*>) {
    println("**********prints collection list, set, or map size**********")
    return println("the size of the collection is ${collection.count()}")
} // end printCollectionSize()

fun printMapSize(collection: Map<*, *>) {
    println("**********prints map size**********")
    return println("the size of the map is ${collection.count()}")
} // end printMapSize()

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
fun isListSetElemExists(collection: Collection<*>, element: Any): Boolean {
    println("**********is collection element exists test**********")
    val isExistsCollElem = if (element in collection) true else false
    return isExistsCollElem
} // end isListSetElemExists()

/**
 * adds a new element to the list or set collection
 *
 * @param newListSetElem the list of languages
 * @return none
 * @throws none
 * @see addToList()
 */
fun <T> addListSetElem(newListSetElem: Collection<T>): Collection<T> {
    println("**********add new element to collection**********")

    val mutableLanguages: MutableList<T> = newListSetElem.toMutableList()
    println("please enter a new element:")
    val inputLang = readlnOrNull()
    if (!inputLang.isNullOrEmpty()) {
        mutableLanguages.add(inputLang as T)
    } else {
        println("nothing to add")
    } // end if

    return castImmutableListSet(mutableLanguages)
} // end addListSetElem()

/**
 * adds a new element to the map collection
 *
 * @param readOnlyMapColl the map of key/value pairs
 * @return none
 * @throws none
 * @see addToMap()
 */
fun <T> addMapKeyValPair(readOnlyMapColl: Map<T, T>): Map<T, T> {
    println("**********add new key/value pair to map collection**********")

    val mutableMap = readOnlyMapColl.toMutableMap()
    println("please enter a new map key element:")
    val inputKey = readlnOrNull()
    if (!inputKey.isNullOrEmpty()) {
        println("please enter new map value element:")
        val inputValue = readlnOrNull()
        if (!inputValue.isNullOrEmpty()) {
            if (!mutableMap.containsKey(inputKey as T)) {
                mutableMap[inputKey] = inputValue as T
            } else {
                println("!!!!!sorry, the key already exists in map, please enter a unique key!!!!!")
            } // end if
        } else {
            println("nothing to add")
        } // end if
    } else {
        println("nothing to add")
    } // end if

    return castImmutableMap(mutableMap)
} // end addMapKeyValPair()

/**
 * deletes specified element from the list or set collection
 *
 * @param collection the list of languages
 * @return none
 * @throws none
 * @see none
 */
fun <T> delListSetElem(collection: Collection<T>): Collection<T> {
    println("**********delete existing language element**********")

    println("please enter the element to delete:")
    val inputLang = readlnOrNull()
    if (!inputLang.isNullOrEmpty()) {
        when (collection) {
            is List<T> -> {
                val uniqueElements = collection.toMutableList().distinct() as MutableList<T>
                uniqueElements.remove(inputLang as T)
                return castImmutableListSet(uniqueElements)
            }
            is Set<T> -> {
                val mutableSet = collection.toMutableSet()
                mutableSet.remove(inputLang as T)
                return castImmutableListSet(mutableSet)
            }
            else -> {
                println("unsupported collection type: $collection::class.simpleName")
            }
        } // end when (collection)
    } else {
        println("nothing to delete")
    } // end if

    return collection
} // end delListSetElem()

/**
 * is the driver for processing all the collection function exercises
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun processCollectionExercises() {
    /*****************************
     * list collection exercises *
     *****************************/
    /*
    println("**********list collection exercises**********")
    val readOnlyLanguages = listOf("tagalog", "deutsch", "norwegian", "english", "english")
    printListsSetsElem(readOnlyLanguages)
    printListSetSize(readOnlyLanguages)

    val languagesLocked = addListSetElem(readOnlyLanguages)
    printListsSetsElem(languagesLocked)
    printListSetSize(languagesLocked)
    printListSetEdgeElem(languagesLocked)

    val isElementExists = isListSetElemExists(languagesLocked, "english")
    println("is 'english' in the list? $isElementExists")
    val isHindiExists = isListSetElemExists(languagesLocked, "hindi")
    println("is 'hindi' in the list? $isHindiExists")

    val languagesLocked2 = delListSetElem(languagesLocked)
    printListsSetsElem(languagesLocked2)
    printListSetSize(languagesLocked2)
    printListSetEdgeElem(languagesLocked2)

    /****************************
     * set collection exercises *
     ****************************/
    println("**********set collection exercises**********")
    val readOnlyGovAgencies = setOf("cbp", "cia", "nsa", "fbi", "cbp", "fbi")
    printListsSetsElem(readOnlyGovAgencies)
    printListSetSize(readOnlyGovAgencies)

    val govAgenciesLocked = addListSetElem(readOnlyGovAgencies)
    printListsSetsElem(govAgenciesLocked)
    printListSetSize(govAgenciesLocked)
    printListSetEdgeElem(govAgenciesLocked)

    val isAgencyExists = isListSetElemExists(govAgenciesLocked, "cia")
    println("is 'cia' in the set? $isAgencyExists")
    val isAgencyExists2 = isListSetElemExists(govAgenciesLocked, "ciaa")
    println("is 'ciaa' in the set? $isAgencyExists2")

    val govAgenciesLocked2 = delListSetElem(govAgenciesLocked)
    printListsSetsElem(govAgenciesLocked2)
    printListSetSize(govAgenciesLocked2)
    */

    /****************************
     * map collection exercises *
     ****************************/
    println("**********map collection exercises**********")
    val readOnlyProjectLangs = mapOf("auto db mobile" to "kotlin android",
        "auto db web" to "django typescript", "llm agent test data" to "python",
        "llm agent rag reporting" to "python",)
    //val currGovAgencyStatus = mutableMapOf("cbp" to "downsize", "cia" to "downsize",
    //    "fbi" to "downsize", "nsa" to "downsize", "nasa" to "increase", "gsa" to "downsize",
    //    "fema" to "downsize", "tsa" to "increase", "doe" to "increase",)

    printMapElements(readOnlyProjectLangs)
    val projectsLocked = addMapKeyValPair(readOnlyProjectLangs)
    printMapElements(projectsLocked)
    printMapSize(projectsLocked)

    // printMapElements(currGovAgencyStatus)
    // TODO: remove agency if agency exists in map. otherwise, print message to standard output.
    // prints agency's map key/value pairs count to standard output
} // end processCollectionExercises()
