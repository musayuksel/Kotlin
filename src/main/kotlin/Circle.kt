import kotlin.math.pow

class Circle(val radius: Double) : Shape("Circle") {
    override fun calculateArea(): Double = Math.PI * radius.pow(2.0)
    override fun calculatePerimeter(): Number {
        return 2 * Math.PI * radius
    }

     fun getNameAccessor(): String {
        return name
    }

}
