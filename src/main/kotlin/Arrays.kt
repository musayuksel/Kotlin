fun whileLoop() {
    print("Enter a number: ")
    var userInput = readln();

    if(userInput.toIntOrNull() == null) {
        println("You didn't enter a number")
        return
    }

    var userInputAsInt = userInput.toInt();
    println("Let's count to $userInputAsInt")
    var i = 0
    while (i < userInputAsInt) {
        println(i)
        i++
    }
}