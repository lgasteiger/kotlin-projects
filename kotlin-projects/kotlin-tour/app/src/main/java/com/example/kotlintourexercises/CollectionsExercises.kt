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
    println("the 'tesla 3-series' exists is $isExistsElectric")

    val isExistsPetrol = if ("ford mustang v8" in readOnlyElecVehicles) true else false
    println("the 'ford mustang v8' exists is $isExistsPetrol")
} // end isVehicleExists()

/**
 * adds farm crops and prints the updated list to the standard output
 */
fun addFarmCrops() {
    println("**********add farm crops exercise**********")
    val farmCrops: MutableList<String> = mutableListOf("corn", "peas", "beans",)
    farmCrops.add("carrots")

    //println(farmCrops)
    farmCrops.forEachIndexed { index, crop ->
        println("${index + 1}. $crop")
    } // end forEachIndexed
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

    farmEquipment.forEachIndexed { index, equip ->
        println("${index + 1}. $equip")
    } // end forEachIndexed
} // end delFarmEquip()

/**
 * prints read only unique agencies to the standard output
 *
 * @param none
 * @return none
 * @throws none
 * @see none
 */
fun printSetExercises() {
    println("**********read only unique agencies exercise**********")
    val readOnlyGovAgencies = setOf("cbp", "cia", "nsa", "fbi", "cbp", "fbi")
    readOnlyGovAgencies.forEachIndexed { index, agency ->
        println("${index + 1}. $agency")
    } // end forEachIndexed

    val superheroes: MutableSet<String> = mutableSetOf("superman", "batman", "wonder woman",
        "flash", "batman", "robin", "robin")
    superheroes.forEachIndexed { index, hero ->
        println("${index + 1}. $hero")
    } // end forEachIndexed
} // end printSetExercises()
