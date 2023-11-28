abstract class Shape(protected val name: String) { //open means this class can be inheritedΩ
    // protected means this property can be accessed by the parent class and the child class
    init {
        printName()
    }

    private fun printName() {
        //private means this function can only be accessed by this class
        println("The new shape is $name")
    }

    open fun calculateArea(): Number { //open means this function can be overridden
        return 0
    }

    abstract fun calculatePerimeter(): Number //abstract means this function must be overridden
}