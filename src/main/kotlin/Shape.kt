abstract class Shape (val name: String) { //open means this class can be inheritedΩ
    init {
        printName()
    }
    fun printName() {
        println("The new shape is $name")
    }
    open fun calculateArea(): Number { //open means this function can be overridden
        return 0
    }

    abstract fun calculatePerimeter(): Number //abstract means this function must be overridden
}