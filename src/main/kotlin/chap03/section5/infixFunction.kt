package chap03.section5

fun main() {
    //일반 표현법
    val multi = 3.multiply(10)

    //중위표현법 infix
    val multi1 = 4 multiply 10

    println("multi: $multi")
    println("multi1: $multi1")
}

infix fun Int.multiply(x: Int): Int   { return this * x }

/* 중위 함수 조건
*  멤버 메서드 또는 확장 함수여야 한다
*  하나의 매개변ㅅ를 가져야 한다.
*  infix 키워드를 사용하여 정의 한다.*/