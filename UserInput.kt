/*
-----------------------------------------
File Name: UserInput.kt
Description: Kotlin program demonstrating user input using readLine()
Author: Jibin Jose
-----------------------------------------

Compile:
kotlinc UserInput.kt -include-runtime -d UserInput.jar

Run:
java -jar UserInput.jar

Example Output:
Enter your name: Jibin
Welcome, Jibin
-----------------------------------------
*/

fun main() {

    print("Enter your name: ")

    val name = readLine()

    println("Welcome, $name")
}
