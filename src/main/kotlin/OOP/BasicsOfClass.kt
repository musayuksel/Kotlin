package OOP

//class SmartDevice { //same thing with class SmartDevice constructor() {
class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
    fun turnOn() {
        println("Smart device is turned on.")
        turnOff()// we can call a function from inside the class
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}


fun main() {
    val smartDevice = SmartDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

}