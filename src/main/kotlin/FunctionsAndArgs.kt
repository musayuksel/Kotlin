fun functionWithoutReturn() {
    println("This function doesn't return anything, the return type is -> UNIT")
}

fun functionWithParamsAndReturn(param1: Int, param2: Int): Int = param1 + param2

fun filterUsers(users: List<User>, firsLetterForSearch: Char = 'M'): List<User> {
    return users.filter { it.name.startsWith(firsLetterForSearch) }
}

// .map { it.copy(name = it.name.uppercase()) }
fun convertUsersNameToUpperCase(users: List<User>): List<User> = users.map { it.copy(name = it.name.uppercase()) }

fun functionWithVarArgs(vararg numbers: Int) {
    println(numbers.contentToString())
}


fun alternatingSum(vararg numbers: Int) {
    var total = 0;
//    numbers.forEachIndexed({
//            index,num ->if(index % 2 == 0 ) total+=num else total -= num
//    })

    // OR

    fun myCallback(num: Int, index: Int) = if (index % 2 == 0) total += num else total -= num

    numbers.forEachIndexed(::myCallback)//:: is used to pass a function as a parameter

    println("The alternating total is : $total")
}