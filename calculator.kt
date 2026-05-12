// -----------------------------------------
// File Name: calculator.kt
// Description: Kotlin program for simple calculator operations
// Author: Jibin Jose
// -----------------------------------------

// Running Command:
// kotlinc calculator.kt -include-runtime -d calculator.jar
// java -jar calculator.jar

// Example Output:
// Enter first number: 10
// Enter second number: 5
// Choose operation (+, -, *, /): *
// Result: 50.0
// -----------------------------------------

fun main() {

    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

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
