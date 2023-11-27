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

//    CLASS
    var rectangle = Rectangle(10, 20)
    println("The area of ${rectangle.name} is ${rectangle.calculateArea()}")
    println("The perimeter of ${rectangle.name} is ${rectangle.calculatePerimeter()}")

    var myCircle = Circle(10.0)
    println("The area of ${myCircle.name} is ${myCircle.calculateArea()}")
    println("The perimeter of ${myCircle.name} is ${myCircle.calculatePerimeter()}")
}