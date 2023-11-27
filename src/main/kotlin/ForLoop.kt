data class User(val name: String, val age: Int)

//val users = listOf(// immutable list
val users = mutableListOf<User>( // mutable list
    User("John", 20),
    User("Jane", 30),
    User("Mary", 40)
)

fun forLoopExample() {
    users.add(User("Mark", 50))
    for (user in users) {
        println(user.name)
    }
}

fun whiteAlphabet() {
    for (letter in 'a'..'z') { // this called range
        println(letter)
    }
}