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
fun main() {
    val celsiusToFahrenheit = { celsius: Double -> celsius * 1.8 + 32 }
    val kelvinToCelsius = { kelvin: Double -> kelvin - 273.15 }
    val fahrenheitToKelvin = { fahrenheit: Double -> (fahrenheit - 32) * (5.0 / 9.0) + 273.15 }

    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = celsiusToFahrenheit
    )

    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = kelvinToCelsius
    )

    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = fahrenheitToKelvin
    )
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}