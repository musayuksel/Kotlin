data class User(val name: String, val age: Int)

val users = listOf(
    User("John", 20),
    User("Jane", 30),
    User("Mary", 40)
)

fun forLoopExample() {
    for (user in users) {
        println(user.name)
    }
}