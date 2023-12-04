# Object-Oriented Programming (OOP) Definitions

Classes provide blueprints from which objects can be constructed in Kotlin. An object is an instance of a class that
encapsulates data specific to that object. In Kotlin, you can use objects and class instances interchangeably.

Let's continue with the analogy of building a house. In Kotlin, a class represents the architect's blueprint or design
plan for the house, while the object is the actual house constructed based on that blueprint.

```kotlin
class House {
    // Properties specific to the house
    var color: String = ""
    var numberOfRooms: Int = 0

    // Method specific to the house
    fun openDoor() {
        println("The door is open.")
    }
}
```

In the code above, the House class defines `properties` such as `color` and `numberOfRooms`. It also includes a `method`
called `openDoor()` that performs a specific action. Each house object created from this class will have its own set of
values for the properties.

These are the recommended naming conventions for a class:

- Use PascalCase for class names.
- Use camelCase for property and method names.
- Use a verb for method names.

A class consists of three parts :

- Properties
- Methods
- Constructors



### Creating an Object

```kotlin
val myHouse = House()
myHouse.color = "Blue"
myHouse.numberOfRooms = 3

val neighborHouse = House()
neighborHouse.color = "Yellow"
neighborHouse.numberOfRooms = 4

myHouse.openDoor()             // Output: The door is open.
println(neighborHouse.color)   // Output: Yellow

```

### There are four basic concepts of OOP,

OOP helps you simplify complex, real-world problems into smaller objects.

**Encapsulation**. Wraps the related properties and methods that perform action on those properties in a class. For
example, consider your mobile phone. It encapsulates a camera, display, memory cards, and several other hardware and
software components. You don't have to worry about how components are wired internally.

**Abstraction**. An extension to encapsulation. The idea is to hide the internal implementation logic as much as
possible. For example, to take a photo with your mobile phone, all you need to do is open the camera app, point your
phone to the scene that you want to capture, and click a button to capture the photo. You don't need to know how the
camera app is built or how the camera hardware on your mobile phone actually works. In short, the internal mechanics of
the camera app and how a mobile camera captures the photos are abstracted to let you perform the tasks that matter.

**Inheritance**. Enables you to build a class upon the characteristics and behavior of other classes by establishing a
parent-child relationship. For example, there are different manufacturers who produce a variety of mobile devices that
run Android OS, but the UI for each of the devices is different. In other words, the manufacturers inherit the Android
OS feature and build their customizations on top of it.

**Polymorphism**. The word is an adaptation of the Greek root poly-, which means many, and -morphism, which means forms.
Polymorphism is the ability to use different objects in a single, common way. For example, when you connect a Bluetooth
speaker to your mobile phone, the phone only needs to know that there's a device that can play audio over Bluetooth.
However, there are a variety of Bluetooth speakers that you can choose from and your phone doesn't need to know how to
work with each of them specifically.
