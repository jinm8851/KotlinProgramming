package chap04.section1

fun main() {
    print("Enter te score: ")
    val score = readLine()!!.toDouble()  //콘솔로 부터 입력 받음
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.0 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }

   val msg =  when(score) {
        in 90.0..100.0 -> "Good"

       else -> "Not bad"
   }
    println("Score: $score, Grade: $grade, status: $msg" )
}