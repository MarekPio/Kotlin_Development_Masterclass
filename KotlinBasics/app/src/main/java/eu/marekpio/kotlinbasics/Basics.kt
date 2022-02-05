package eu.marekpio.kotlinbasics

fun main(){
    val const_value_hello = "Hello " // Val can not be overwritten
    var myName = "Marek"
    myName = "Krzysztof"
    // const_value_hello = "Error"
    print(const_value_hello + myName)
}