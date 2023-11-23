fun main(args: Array<String>) {
    var myFirstVariable: String = "Hello World"//camelCase is the standard for naming variables
    //var is a mutable variable. If you want to make it immutable, use val
    val myFirstVariable2: String = "Hello World"
    //myFirstVariable2 = "Hello World 2" //This will throw an error because myFirstVariable2 is immutable
    println("myFirstVariable is $myFirstVariable") // $ is called string interpolation
}