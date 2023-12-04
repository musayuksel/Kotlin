fun whenExercise() {
    print("Enter your age: ")
    val userAge: Int = readln()?.toIntOrNull() ?: -1

    when (userAge) {
        in 0..17 -> println("You are not allowed to vote")
        18 -> println("You just turned 18")
        in 19..120 -> {
            println("You are allowed to vote")
            println("this is how you use a block in a when statement")
        }

        else -> println("Invalid age")
    }
}

fun whenExercise2() {
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")// we can use multiple values in one case
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}