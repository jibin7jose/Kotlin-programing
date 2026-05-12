// -----------------------------------------
// File Name: calculator.kt
// Description: Kotlin program for simple calculator operations
// Author: Jibin Jose
// -----------------------------------------

// Running Command:
// kotlinc calculator.kt -include-runtime -d calculator.jar
// java -jar calculator.jar

// Example Input:
// 10
// 5
// *

// Example Output:
// Result: 50.0
// -----------------------------------------

fun main() {

    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Invalid number input")
        return
    }

    print("Choose operation (+, -, *, /): ")
    val op = readLine()

    when (op) {
        "+" -> println("Result: ${num1 + num2}")
        "-" -> println("Result: ${num1 - num2}")
        "*" -> println("Result: ${num1 * num2}")
        "/" -> println("Result: ${num1 / num2}")
        else -> println("Invalid operation")
    }
}
