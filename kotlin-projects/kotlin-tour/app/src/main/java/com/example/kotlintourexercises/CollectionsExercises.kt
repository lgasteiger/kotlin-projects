package com.example.kotlintourexercises

/**
 * prints collection, (e.g. lists, sets, maps, etc.) elements to standard output
 *
 * @param items the collection of elements to print
 * @return none
 * @throws none
 * @see none
 */
fun printElements(items: Collection<String>) {
    println("+++++prints elements in the collection exercise+++++")
    items.forEachIndexed { index, item ->
        println("${index + 1}. $item")
    } // end forEachIndexed
}// end printElements(item: Collection<T>)

/**
 * prints inferred immutable list exercise to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printInferredImmutableList() {
    println("**********inferred immutable list exercise**********")
    val readOnlyShapes = listOf("triangle", "square", "circle")
    printElements(readOnlyShapes)
} // end printInferredImmutableList()

/**
 * prints declared mutable list exercise to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printDeclaredMutableList() {
    println("**********declared mutable list exercise**********")
    val mutableStreamingShows: MutableList<String> = mutableListOf("castlevania noctural",
        "creature commandos", "friendly neighborhood spider-man")
    printElements(mutableStreamingShows)
} // end printDeclaredMutableList()

/**
 * prints casting exercises to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printListCastingExercise() {
    println("**********print list casting exercises**********")
    val myToolBox: MutableList<String> = mutableListOf("hammer", "electric wire", "gloves")
    val toolBoxLocked: List<String> = myToolBox
    println("the second tool in the toolbox is '${toolBoxLocked[1]}'")
} // end printListCastingExercise()

/**
 * prints edge (first and last) elements to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printListEdgeElements() {
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

/**
 * prints true to standard output if a vehicle exists in the list. otherwise, prints
 * false
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun isVehicleExists() {
    println("**********is vehicle exists exercise**********")
    val readOnlyElecVehicles = listOf("tesla 3-series", "hyundai ioniq", "ford mach-e",
        "bmw i30")
    val isExistsElectric = if ("tesla 3-series" in readOnlyElecVehicles) true else false
    println("the 'tesla 3-series' exists is '$isExistsElectric'")

    val isExistsPetrol = if ("ford mustang v8" in readOnlyElecVehicles) true else false
    println("the 'ford mustang v8' exists is '$isExistsPetrol'")
} // end isVehicleExists()

/**
 * adds farm crops and prints the updated list to the standard output
 */
fun addFarmCrops() {
    println("**********add farm crops exercise**********")
    val farmCrops: MutableList<String> = mutableListOf("corn", "peas", "beans",)
    farmCrops.add("carrots")
    printElements(farmCrops)
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
    farmEquipment.remove("shovel")
    printElements(farmEquipment)
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
    printElements(readOnlyGovAgencies)
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
    printElements(superheroes)
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
        printElements(navalShipTypes)
    } // end if
} // end addNewShipType(newShipName: String, navalShipTypes: MutableList<String>)

fun delShipType(existingShipType: String, navalShipTypes: MutableList<String>) {
    println("**********delete naval ship type exercise**********")
    if (existingShipType in navalShipTypes) {
        navalShipTypes.remove(existingShipType)
        printElements(navalShipTypes)
    } // end if
} // end delShipType(existingShipType: String)

/**
 * is the driver for processing all the collection exercises
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun processCollectionExercises() {
    // list collection exercises
    printInferredImmutableList()
    printDeclaredMutableList()
    printListCastingExercise()
    printListEdgeElements()
    printListSize()
    isVehicleExists()
    addFarmCrops()
    delFarmEquip()

    // set collection exercises
    printImmutableSetExercise()
    printMutableSetExercise()
    getAircraftCount()

    val navalShipTypes: MutableList<String> = mutableListOf("supply ship", "aircraft carrier",
        "battleship", "cutter",)
    addNewShipType("reconnaissance", navalShipTypes)
    delShipType("aircraft carrier", navalShipTypes)

    // map collection exercises
    
} // end processCollectionExercises()
