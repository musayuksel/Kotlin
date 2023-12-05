package OOP

//In Kotlin, all the classes are final by default, which means that you can't extend them, so you have to define the relationships between them.
// In the SmartDevice superclass, add an open keyword before the class keyword to make it extendable:
open class SmartDeviceSuper(val name: String, val category: String) {
//  open keyword informs the compiler that this class is extendable

    var deviceStatus = "online"
    fun turnOn() {
        deviceStatus = "online"
        println("Smart device is turned on.")
        turnOff()// we can call a function from inside the class
    }

    open fun turnOff() {// we can override this function in the subclass
        deviceStatus = "offline"
        println("Smart device is turned off.")
    }

    open val deviceType = "Unknown" // we can override this property in the subclass,
}

class SmartPhoneChild(deviceName: String, deviceCategory: String) :
    SmartDeviceSuper(name = deviceName, category = deviceCategory) {
    var speakerVolume = 99
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    override val deviceType = "Smartphone" // we can override this property in the subclass,
    fun increaseVolume() {
        speakerVolume += 1 //this will call the setter function and check if the value is in the range
        println("Speaker volume increased to $speakerVolume.")
    }

    //    Override superclass methods
    override fun turnOff() {
//        The override keyword informs the Kotlin runtime to execute the code enclosed in the method defined in the subclass
//        This is called POLYMORPHISM
//        deviceStatus = "offline" // OR
        super.turnOff() //this will call the superclass turnOff() function
        println("Smartphone is turned off.")
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