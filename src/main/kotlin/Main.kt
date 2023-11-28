fun main() {
//    whileLoop()//Arrays.kt
//    forLoopExample() //ForLoop.kt
//    whenExercise() //When.kt
//    filterSortAndUpdateUsers() //MapFilter.kt

    val users = mutableListOf<User>( // mutable list
        User("John", 20),
        User("Jane", 30),
        User("Mary", 40)
    )
//    val usersStartWithJ = filterUsers(firsLetterForSearch = 'J', users = users) //FunctionsAndArgs.kt
//    //As you can see we can change the order of the arguments
//
//    //you can use the default value too
//    //val usersStartWithM = filterUsers(users) //FunctionsAndArgs.kt
//
//    val usersUpperCase = convertUsersNameToUpperCase(usersStartWithJ) //FunctionsAndArgs.kt
//    println(usersUpperCase)
//
//    val numArray = intArrayOf(1, 2, 3, 4, 5)
//    functionWithVarArgs(22, 33, 11, 4, *numArray) //FunctionsAndArgs.kt

//    println("Is 5 even? ${5.isEven()}") //ExtensionFunctions.kt
//
////    CLASS
//    var rectangle = Rectangle(10.0, 20.0)
//    println("The area of ${rectangle.getNameAccessor()} is ${rectangle.calculateArea()}")
//    println("The perimeter of ${rectangle.getNameAccessor()} is ${rectangle.calculatePerimeter()}")
////    WE CAN'T access the NAME property because it's private
//    var myCircle = Circle(10.0)
//    println("The area of ${myCircle.getNameAccessor()} is ${myCircle.calculateArea()}")
//    println("The perimeter of ${myCircle.getNameAccessor()} is ${myCircle.calculatePerimeter()}")
//
////    Square
//    var square = Rectangle(10.0)
//    println("The area of ${square.getNameAccessor()} is ${square.calculateArea()}")
//    println("The perimeter of ${square.getNameAccessor()} is ${square.calculatePerimeter()}")
//
////    Companion object
//    var randomCircle = Circle.createRandomCircle()
//    println("The area of ${randomCircle.getNameAccessor()} is ${randomCircle.calculateArea()}")
//    println("The perimeter of ${randomCircle.getNameAccessor()} is ${randomCircle.calculatePerimeter()}")

//    TRY CATCH
    tryCatchExample() //TryCatch.kt

}

//    The same way we can override the functions
fun maxArea(shape1: Shape, shape2: Shape): Shape {
    return if (shape1.calculateArea() > shape2.calculateArea()) shape1 else shape2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Shape {
    return maxArea(maxArea(shape1, shape2), shape3)
}
//we used the same function name but with different arguments