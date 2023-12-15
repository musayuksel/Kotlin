package higher_order_functions

import User

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

//if want to create a custom filter function
fun List<User>.customFilter(filterFunction: (User) -> Boolean): List<User> {
    val resultList = mutableListOf<User>()
    for (user in this) {
        if (filterFunction(user)) {
            resultList.add(user)
        }
    }
    return resultList
}
// in the code above we created a custom filter function that takes a function as an argument
// this function takes a user and returns a boolean
// we can use this function like this
