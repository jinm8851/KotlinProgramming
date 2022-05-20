package chap03.section3.high2


fun main() {
    val result: Int

    // 람다식을 매개변수와 인자로 사용한 함수수
  // result = hignOrder({ x, y -> x + y }, 2, 3)

    // 참조 방식을 사용한 함수
   result = hignOrder(::sum, 2, 3)
    println(result)
}

fun hignOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}

fun sum(a:Int,b: Int): Int = a+b