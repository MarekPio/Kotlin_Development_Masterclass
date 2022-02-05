package eu.marekpio.kotlinbasics

fun main(){
    // immutable variable
    val const_value_hello = "Hello " // Val can not be overwritten

    // TODO: Add new functionality
    // type string
    var myName = "Marek"
    // type int 32 bit
    var myAge = 31 // default int (32 bit)
    // write my to display list of my values and their types


    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 125
    val myShort: Short = 32_000
    val myInt: Int = 1_200_200_200
    val myLong: Long = 39_812_309_487_120_394

    // Floating Point number Types: Float (32 bit), Double (64 bi)
    val myFloat: Float = 13.37F // F required for float value
    val myDouble: Double = 3.14159265358979323846 // double type is default

    /* Set variable
       value */
    myName = "Krzysztof"
    // const_value_hello = "Error"

    print(const_value_hello + myName)
}