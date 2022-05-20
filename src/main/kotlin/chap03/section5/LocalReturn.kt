package chap03.section5.localrerurn


fun main() {
    shortFunc(3) { println("Finrst call: $it")
    return } //의도치 않은 받환
}

inline fun shortFunc(a: Int, out:(Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")  // 이 문장은 실행되지 않음
}