/*
-----------------------------------------
File Name: Variables.kt
Description: Kotlin program demonstrating variables and basic data types
Author: Jibin Jose
-----------------------------------------

Compile:
kotlinc Variables.kt -include-runtime -d Variables.jar

Run:
java -jar Variables.jar

Output:
Name: Jibin
Age: 22
Height: 5.8
Student: true
Updated Age: 23
-----------------------------------------
*/

fun main() {
    val name: String = "Jibin"
    var age: Int = 22
    val height: Double = 5.8
    val isStudent: Boolean = true

    println("Name: $name")
    println("Age: $age")
    println("Height: $height")
    println("Student: $isStudent")

    age = 23  // var can change
    println("Updated Age: $age")
}
