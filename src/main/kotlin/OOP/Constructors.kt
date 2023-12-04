package OOP

//There are two main types of constructors in Kotlin:

//Primary constructor. A class can have only one primary constructor, which is defined as part of the class header. A primary constructor can be a default or parameterized constructor. The primary constructor doesn't have a body. That means that it can't contain any code.
//Secondary constructor. A class can have multiple secondary constructors. You can define the secondary constructor with or without parameters. The secondary constructor can initialize the class and has a body, which can contain initialization logic. If the class has a primary constructor, each secondary constructor needs to initialize the primary constructor.

// The secondary constructor definition starts with the constructor. Primary constructor initialization start with this keyword.

class SmartDevice2(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
//    ...
}

fun main() {
    val smartDevice = SmartDevice2("Android TV", "Entertainment")
    println(smartDevice.deviceStatus)

    val smartDevice2 = SmartDevice2("Android TV", "Entertainment", 0)
    println(smartDevice2.deviceStatus)
}