package list6

import java.io.BufferedReader
import java.io.StringReader

fun addValidNumbers(numbers: List<Int?>){
    var SumOfValidNubers = 0
    var invalidNumbers = 0
    for(number in numbers) { //리스트에서 널이 될 수 있는 값을 읽는다.
        if(number != null){ //널에 대한 값을 확인한다.
            SumOfValidNubers += number
        }
        else{
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $SumOfValidNubers")
    println("Invalid numbers : $invalidNumbers")
}

fun main(args: Array<String>){
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
}