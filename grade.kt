// -----------------------------------------
// File Name: grade.kt
// Description: Kotlin program to calculate grade using safe input
// Author: Jibin Jose
// -----------------------------------------

// Running Command:
// kotlinc grade.kt -include-runtime -d grade.jar
// java -jar grade.jar

// Example Output:
// Enter your mark: 85
// Grade B
// -----------------------------------------

fun main() {

    print("Enter your mark: ")

    val input = readLine()

    if (input != null) {

        val mark = input.toInt()

        when {
            mark >= 90 -> println("Grade A")
            mark >= 75 -> println("Grade B")
            mark >= 50 -> println("Grade C")
            else -> println("Fail")
        }

    } else {
        println("No input received")
    }
}
