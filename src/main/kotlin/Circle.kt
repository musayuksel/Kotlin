import kotlin.math.pow
import kotlin.random.Random

class Circle(val radius: Double) : Shape("Circle") {
    override fun calculateArea(): Double = MySingletonObject.PI * radius.pow(2.0)
//    MySingletonObject is the name of the singleton object
//    similarly we can add companion object to the class
//    which means we can access the companion object from anywhere in the code
    companion object {
        fun createRandomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    override fun calculatePerimeter(): Number {
        return 2 * MySingletonObject.PI * radius
    }

    fun getNameAccessor(): String {
        return name
    }

}
