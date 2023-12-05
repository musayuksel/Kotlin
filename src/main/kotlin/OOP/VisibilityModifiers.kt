package OOP

//Visibility modifiers play an important role to achieve ENCAPSULATION
//In Kotlin, there are four visibility modifiers:
//public: Default visibility modifier. Makes the declaration accessible EVERYWHERE
//private: Makes the declaration accessible only inside the CLASS or source file containing the declaration.
//protected: Makes the declaration accessible only inside the CLASS, SUBCLASS, and source file containing the declaration.
//internal: Makes the declaration accessible only inside the MODULE, SUBMODULE, and source file containing the declaration.

// When you don't specify a visibility modifier, the declaration is public by default which we don't want.
// RULE OF THUMB : Always use the most restrictive visibility modifier possible. private > protected > internal > public

open class SmartDeviceSecure(val name: String, val category: String) {

    //    property should be readable outside of the class through class objects. However, only the class and its children should be able to update or write the value.
    var deviceStatus = "online"
        //        protected set(value) {
        //            field = value
        //        } // we haven't done any action here, just assigned the value to the field variable which is default in Kotlin, So
        protected set // we can remove the value parameter and the body of the function

    protected fun turnOn() { // we can't access this function outside of the class
        deviceStatus = "online"
        println("Smart device is turned on.")
    }
}

class SmartHomeSecure(
    val smartTvDevice: SmartDeviceSecure,
//    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set // we can't access this property outside of the class

    fun turnOnTv() {
        deviceTurnOnCount++

    }
}
