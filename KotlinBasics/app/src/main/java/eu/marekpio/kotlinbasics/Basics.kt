package eu.marekpio.kotlinbasics

fun main(){
    // immutable variable
    val const_value_hello = "Hello " // Val can not be overwritten

    // TODO: Add new functionality
    // type string
    var myName = "Marek"
    // type int 32 bit
    // type inference (wnioskowanie o typie) finds out the type from context
    var myAge = 31 // default int (32 bit)
    // write my to display list of my values and their types

    /* Set variable
       value */
    myName = "Krzysztof"
    // const_value_hello = "Error"

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 125
    val myShort: Short = 32_000
    val myInt: Int = 1_200_200_200
    val myLong: Long = 39_812_309_487_120_394

    // Floating Point number Types: Float (32 bit), Double (64 bi)
    val myFloat: Float = 13.37F // F required for float value
    val myDouble: Double = 3.14159265358979323846 // double type is default

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var myIsSunny: Boolean = true
    // var isSunny = true // that is the same
    myIsSunny = false

    // Characters
    val myLetterChar = 'A'
    val myDigitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    println("First character " + firstCharInStr)
    println("Last character " + lastCharInStr)
}