class Rectangle(val height: Double, val width: Double) : Shape("Rectangle") {
    init {
        // I can use the name property because it's inherited from the parent class
        println("The height of the $name is $height and the width is $width")
    }

    //    Secondary constructor
    //for example we want to create a square
    constructor(side: Double) : this(side, side) {
        println("The height of the $name is $height and the width is $width")
    }
    //we can create multiple secondary constructors, the purpose is to have multiple ways to create an object


    //    I can access the name property because it's protected and I'm in the child class
    fun getNameAccessor(): String {
        return name
    }

    override fun calculateArea(): Double {
        // override means we are overriding the parent function
        return height * width
    }

    override fun calculatePerimeter(): Double {
        // we must override this function because it's abstract in the parent class
        return 2 * (height + width)
    }
}