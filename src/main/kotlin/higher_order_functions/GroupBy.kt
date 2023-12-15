package higher_order_functions

//The groupBy() function can be used to turn a list into a map, based on a function
//Each unique return value of the function becomes a key in the resulting map.
// The values for each key are all the items in the collection that produced that unique return value.
//
fun main() {
    val groupedMenu = cookies.groupBy { it.softBaked }
    //this will create true = [list of soft bakery]
    //this will create false = [list of non soft bakery]

    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    softBakedMenu.forEach { println("Soft item name: ${it.name}") }
    crunchyMenu.forEach { println("crunchyMenu item name: ${it.name}") }
}