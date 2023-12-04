fun main() {
    var myFavoriteNumber: Int? = 5 // ? means that this variable can be null
    myFavoriteNumber = null

    println(myFavoriteNumber)

    var favoriteActor: String? = null

//    println(favoriteActor.length)    // This will throw an error because favoriteActor can be null
    println(favoriteActor?.length)    // This will work because we are using the safe-call operator.
    //If favoriteActor is null, then it will return null, so it will print null

//    Not-null assertion operator (!!)
//    The not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.
    //  println(favoriteActor!!.length) // This will throw an exception because favoriteActor is null


// sometimes if/expression is more convenient than if/else
    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

//    Elvis operator (?:) returns the left side if it's not null, otherwise it returns the right side
    val lengthOfName2 = favoriteActor?.length ?: 0

    println(lengthOfName)
    println(lengthOfName2)
}

