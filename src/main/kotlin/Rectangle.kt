class Rectangle (val height: Int, val width: Int) : Shape("Rectangle")  {
    init {
        // I can use the name property because it's inherited from the parent class
        println("The height of the $name is $height and the width is $width")
    }
    override fun calculateArea(): Int {
        // override means we are overriding the parent function
        return height * width
    }

    override fun calculatePerimeter(): Int {
        // we must override this function because it's abstract in the parent class
        return 2 * (height + width)
    }
}