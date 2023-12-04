package OOP

//In Kotlin, all the classes are final by default, which means that you can't extend them, so you have to define the relationships between them.
// In the SmartDevice superclass, add an open keyword before the class keyword to make it extendable:
open class SmartDeviceSuper(val name: String, val category: String) {
//    ...
}