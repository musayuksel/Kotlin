fun main() {
    var myFirstVariable: String = "Hello World"//camelCase is the standard for naming variables
    //var is a mutable variable. If you want to make it immutable, use val
    val myFirstVariable2: String = "Hello World"
    //myFirstVariable2 = "Hello World 2" //This will throw an error because myFirstVariable2 is immutable
    println("myFirstVariable is $myFirstVariable") // $ is called string interpolation
    //OTHER DATA TYPES
    val myInt: Int = 1
    val myDouble: Double = 1.0
    val myFloat: Float = 1.0f
    val myBoolean: Boolean = true
    val myChar: Char = 'a'
    val myString: String = "Hello World"
    //ARRAYS
    val myArray: Array<Any> = arrayOf(myInt, myDouble, myFloat, myBoolean, myChar, myString)
    println("myArray[0] is ${myArray[0]}")
}

// Exercises : https://developer.android.com/codelabs/basic-android-kotlin-compose-intro-kotlin-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-intro-kotlin-practice-problems#1
//2. Print messages
fun printMessageWithSeparatedLines() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

//3. String templates
fun printMessageWithTemplate() {
    var discountPercentage: Int = 0
    var offer: String = ""
    var item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

//4. String concatenation
fun printMessageWithConcatenation() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

//5. Message formatting
fun printMessageWithFormatting() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"//This will print 5000 + 1000
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

//6. Basic math operations
fun step1() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
}

fun step2WithAddFunction() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val difference = subtract(firstNumber, secondNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

//7. Default parameters
fun displayMessage() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))

}

fun displayMessageStep2() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}