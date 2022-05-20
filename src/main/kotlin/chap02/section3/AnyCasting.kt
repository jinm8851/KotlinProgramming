package chap02.section3

fun main() {
    var a: Any = 1  // Any형 a는 1로 초기화될때 Int형이됨
    a = 20L  //Int형이였던 a는 변경된 값 20L에의해 Long이 됨
    println("a: $a type: ${a.javaClass}")  //a의 자바 기본형을 출력하면 Long이 나옴
}