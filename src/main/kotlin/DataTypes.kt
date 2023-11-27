fun dataTypes() {
    var myFirstVariable: String = "Hello World"//camelCase is the standard for naming variables
//var is a mutable variable. If you want to make it immutable, use val
    val myFirstVariable2: String = "Hello World"
//myFirstVariable2 = "Hello World 2" //This will throw an error because myFirstVariable2 is immutable
    println("myFirstVariable is $myFirstVariable") // $ is called string interpolation
//OTHER DATA TYPES
    val myInt: Int = 1
    val myDouble: Double = 1.0
    val myFloat: Float = 1.0f
    val myBoolean: Boolean = true
    val myChar: Char = 'a'
    val myString: String = "Hello World"
//ARRAYS
    val myArray: Array<Any> = arrayOf(myInt, myDouble, myFloat, myBoolean, myChar, myString)
    println("myArray[0] is ${myArray[0]}")
}