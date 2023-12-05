package OOP

//In Kotlin, all the classes are final by default, which means that you can't extend them, so you have to define the relationships between them.
// In the SmartDevice superclass, add an open keyword before the class keyword to make it extendable:
open class SmartDeviceSuper(val name: String, val category: String) {
//  open keyword informs the compiler that this class is extendable

    var deviceStatus = "online"
    fun turnOn() {
        println("Smart device is turned on.")
        turnOff()// we can call a function from inside the class
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

class SmartPhoneChild(deviceName: String, deviceCategory: String) :
    SmartDeviceSuper(name = deviceName, category = deviceCategory) {
    var speakerVolume = 99
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseVolume() {
        speakerVolume += 1 //this will call the setter function and check if the value is in the range
        println("Speaker volume increased to $speakerVolume.")
    }
}


//IS-A relationship : inheritance
//HAS-A relationship : composition

// The SmartHome class HAS-A smart TV device.
class SmartHome(val smartDeviceSuper: SmartDeviceSuper) {
    fun turnOnTv() {// This function can access the SmartDeviceSuper properties and functions
        smartDeviceSuper.turnOn()
    }
}


fun main() {
    val smartPhone = SmartPhoneChild("Samsung Galaxy S20", "Communication")
    smartPhone.turnOn()
    smartPhone.increaseVolume()
    smartPhone.increaseVolume()
}