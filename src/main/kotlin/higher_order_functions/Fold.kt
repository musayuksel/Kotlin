package higher_order_functions

//same with  reduce in JS
fun main() {
    val totalPrice = cookies.fold(0.0) { acc, cookie ->
        acc + cookie.price
    }

    println("Total price of the menus is $totalPrice")
}
//Note that Kotlin also has its own function called reduce(),