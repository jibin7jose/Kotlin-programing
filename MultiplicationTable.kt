// -----------------------------------------
// File Name: MultiplicationTable.kt
// Description: Kotlin program to print multiplication table
// Author: Jibin Jose
// -----------------------------------------

// Running Command:
// kotlinc MultiplicationTable.kt -include-runtime -d table.jar
// java -jar table.jar

// Example Input:
// 5

// Example Output:
// Enter a number: 5
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// 5 x 6 = 30
// 5 x 7 = 35
// 5 x 8 = 40
// 5 x 9 = 45
// 5 x 10 = 50
// -----------------------------------------

fun main() {

    print("Enter a number: ")
    val number = readLine()!!.toInt()

    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}
