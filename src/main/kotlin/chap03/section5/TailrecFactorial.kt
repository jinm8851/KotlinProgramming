package chap03.section5.tailrec

//꼬리 재귀 함수
// 자기 자신을(스택에 싸이지않과) 호출하지 않고 계산을 실행함함
fun main() {
    val number = 4

    println("Factorlal: $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}