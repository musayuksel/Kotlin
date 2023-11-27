fun filterSortAndUpdateUsers() {
    val users = listOf(
        User("John", 25),
        User("Jane", 30),
        User("Mary", 28),
        User("Alice", 35)
    )

    users
        .filter { it.name.startsWith("J") }
        .sortedByDescending { it.age } // if you want ascending order use -> sortedBy
        .map { it.copy(name = it.name.uppercase()) }
        .forEach { println("user name is ${it.name} and age is ${it.age}") }
}