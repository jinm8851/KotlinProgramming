package chap04.section1


fun main() {
    print("Enter te score: ")
    val score = readLine()!!.toDouble()  //콘솔로 부터 입력 받음
    var grade: Char = 'F'

    //인수 없는 when 문 사용
    when  {
      score  >= 90.0 -> grade = 'A'  //인자가 있는 when 문과 다르게 조건식을 구성할 수 있음
       score in 80.0..89.9 -> grade = 'B'
       score in 70.0..79.0 -> grade = 'C'
        score !in 70.0..100.0 -> grade = 'F'
    }

    val msg =  when(score) {
        in 90.0..100.0 -> "Good"

        else -> "Not bad"
    }
    println("Score: $score, Grade: $grade, status: $msg" )
}