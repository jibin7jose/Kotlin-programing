/*
-----------------------------------------
File Name: EvenOdd.kt
Description: Kotlin program to check whether a number is even or odd
Author: Jibin Jose
-----------------------------------------

Compile:
kotlinc EvenOdd.kt -include-runtime -d EvenOdd.jar

Run:
java -jar EvenOdd.jar

Example Output:
Enter a number: 10
10 is Even
-----------------------------------------
*/

fun main() {

    print("Enter a number: ")

    val number = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("$number is Even")
    } else {
        println("$number is Odd")
    }
}
