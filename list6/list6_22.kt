package list6

import java.io.BufferedReader

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>() //널이 될 수 있는 Int 값으로 이뤄진 리스트를 만든다.
    for(line in reader.lineSequence()){
        try{
            val number = line.toInt()
            result.add(number)//정수(널이 아닌 값)를 리스트에 추가한다.
        }
        catch (e: NumberFormatException){
            result.add(null)
        }
    }
    return result
}