// Extension Functions
// we can add new functions to existing classes without having to inherit from them
//for example, we can add a method to check if the number is even or not
fun Int.isEven(): Boolean = this % 2 == 0 // this refers to the object that we are calling the function on
// look at the main function to see how to use this function

// we can also add extension functions to nullable types
fun Int?.isEvenOrNull(): Boolean = this?.isEven() ?: false // ?: is the elvis operator (if the left side is null then return the right side)