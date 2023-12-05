package OOP

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// Property delegates allow us to delegate the property initialization to another object.
// The delegate object is responsible for providing the initial value of the property and handling the property updates.
// The delegate object must implement the getValue() and setValue() functions.

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}
// The Above class is a property delegate that allows us to regulate the value of a property.
// setValue() function is called when we assign a value to the property.
// getValue() function is called when we access the property.

class SmartPhoneChildEx(deviceName: String, deviceCategory: String) {
    //....
    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
}

