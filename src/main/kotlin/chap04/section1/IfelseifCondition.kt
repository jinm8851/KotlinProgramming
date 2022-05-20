package chap04.section1

fun main() {
    print("Enter te score: ")
    val score = readLine()!!.toDouble()  //콘솔로 부터 입력 받음
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0..89.9) {  //(score >= 80.0 && score <= 89.9) 시작값과 끝값이 포함된다.
        grade = 'B'
    } else if (score in 70.0..79.9) {  //(score >= 70.0 && score <= 79.9)
        grade = 'C'
    }

    println("Score: $score, Greade: $grade")

}