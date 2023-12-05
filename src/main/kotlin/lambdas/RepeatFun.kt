package lambdas

fun main() {
    repeat(10) {
        println("This is round $it!")
    }
}
// the repeat function is a higher order function. It takes a function as a parameter
// the implementation of the repeat function is like this

//fun repeat(times: Int, action: (Int) -> Unit) {
//    for (i in 0 until times) {
//        action(i)
//    }
//}