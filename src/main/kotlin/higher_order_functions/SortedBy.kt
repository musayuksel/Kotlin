package higher_order_functions

fun main() {
//    For classes, Kotlin collections provide a sortedBy() function.
//    sortedBy() lets you specify a lambda that returns the property you'd like to sort by.
//    —strings are sorted alphabetically, numeric values are sorted in ascending order

    val priceOrder = cookies.sortedByDescending { it.price }
    priceOrder.forEach { println("${it.name} is -> $${it.price} ") }
}