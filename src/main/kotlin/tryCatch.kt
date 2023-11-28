fun tryCatchExample() {
    print("Enter a number: ")
    var userInput: Int = 0 // Declare and initialize the variable outside the try block

    try {
        userInput = readLine()?.toInt() ?: 0
        // ?: is the elvis operator which means if the left side is null then return the right side
        println("The userInput is $userInput")
    } catch (e: Exception) {
        println("There is an exception: ${e.message}")
        userInput = 0
    } finally {
        println("This is the finally block")
    }

    println("My own exception >>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println(">>>>>>>>>>> lets try to divide 10 by 0 >>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    try {
        println(divide(10, 0))
    } catch (e: DivideByZeroException) {
        println("There is an exception: ${e.message}")
    }
}


//My Own exception
class DivideByZeroException : Exception("You cannot divide by zero")

fun divide(num1: Int, num2: Int): Int {
    if (num2 == 0) {
        throw DivideByZeroException()
    }
    return num1 / num2
}