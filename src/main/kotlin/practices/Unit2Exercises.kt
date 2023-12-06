package practices
//Exercise path : https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#1

// 2. Mobile notifications
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 99) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

// 3. Movie-ticket price
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..13 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

// 4. Temperature converter
//fun main() {
//    val celsiusToFahrenheit = { celsius: Double -> celsius * 1.8 + 32 }
//    val kelvinToCelsius = { kelvin: Double -> kelvin - 273.15 }
//    val fahrenheitToKelvin = { fahrenheit: Double -> (fahrenheit - 32) * (5.0 / 9.0) + 273.15 }
//
//    printFinalTemperature(
//        initialMeasurement = 27.0,
//        initialUnit = "Celsius",
//        finalUnit = "Fahrenheit",
//        conversionFormula = celsiusToFahrenheit
//    )
//
//    printFinalTemperature(
//        initialMeasurement = 350.0,
//        initialUnit = "Kelvin",
//        finalUnit = "Celsius",
//        conversionFormula = kelvinToCelsius
//    )
//
//    printFinalTemperature(
//        initialMeasurement = 10.0,
//        initialUnit = "Fahrenheit",
//        finalUnit = "Kelvin",
//        conversionFormula = fahrenheitToKelvin
//    )
//}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

// 5. Song catalog
class Song(val title: String, val artist: String, val publishedYear: Int, var playCount: Int) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $publishedYear.")
    }
}


// 6. Internet profile
//fun main() {
//    val amanda = Person("Amanda", 33, "play tennis", null)
//    val atiqah = Person("Atiqah", 28, "climb", amanda)
//
//    amanda.showProfile()
//    atiqah.showProfile()
//}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

//        if (hobby != null) print("Likes to $hobby.")//or
        hobby?.let { print("Likes to $hobby.") } // .let is a scope function that executes the block of code only if the object is not null.
        if (referrer == null) print(" Doesn't have a referrer.") else
            print("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")

        println("\n")
    }
}

// 7.  Foldable phones

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = false) : Phone() {
    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }
}

fun main() {
    val newFoldablePhone = FoldablePhone(isFolded = true)

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}