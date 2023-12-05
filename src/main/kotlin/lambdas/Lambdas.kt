package lambdas

//In Kotlin, functions are considered first-class constructs. This means that functions can be treated as a data type. You can store functions in variables, pass them to other functions as arguments, and return them from other functions.
fun myFunction() {
    print("Hello World")
}

//OR
val myFunction2 =
    { print("Hello World") } //  lambda expression. The type of this variable is val myFunction2: () -> Unit

//Returning a function from another function
fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) trick else treat // we are returning a function. The type of this function is () -> Unit
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}

fun trickOrTreat2(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    //we are passing a function with a Int parameter and String return type
    return if (isTrick) {
        trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        treat
    }
}

fun main() {
//    val myAnotherFunction = ::myFunction // :: means we are passing the function as a parameter
//    val myAnotherFunction2 = myFunction2
    trickOrTreat(true)() // we are calling the function that is returned from the trickOrTreat function

    val coins: (Int) -> String = { numberOfCoins ->
        "You have $numberOfCoins coins."
    }
    //if there is only one parameter, we can use it as "it"
    val coins2: (Int) -> String = {
        "You have $it coins."
    }

    trickOrTreat2(false, coins)()
//    OR MORE MORE advance
    trickOrTreat2(false) { "You have $it coins." }()// if the last parameter is a function, we can pass it outside the parenthesis
}

