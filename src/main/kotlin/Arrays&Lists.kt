fun whileLoop() {
    print("Enter a number: ")
    var userInput = readln();

    if (userInput.toIntOrNull() == null) {
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


fun main() {
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    // println(newSolarSystem[9])// Index 9 out of bounds for length 9

//LIST vs MUTABLE_LIST
//    List is an interface that defines properties and methods related to a read-only ordered collection of items.
//    MutableList extends the List interface by defining methods to modify a list, such as adding and removing elements.


//    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//
//    solarSystem.add("Pluto")//err

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    solarSystem.add("Pluto")//Add the end of the list
    solarSystem.add(1, "Pluto")//Add the index of 1

    solarSystem.removeAt(9)//remove index 9
    solarSystem.remove("Pluto")//remove first one if there is

    println(solarSystem.size)
//    println(solarSystem.get(2)) //or
    println(solarSystem[2])

    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("XXX"))//-1

    println("Future Moon" in solarSystem)//false

    for (planet in solarSystem) {
        println(planet)
    }

}
