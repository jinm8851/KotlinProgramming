package chap02.section3

fun main() {
    var test: Number = 12.2 // 12.2에 의해 test는 Float형으로 스마트 캐스트
    println("$test")

     test = 12
    println("$test")  //Int 형으로 스마트 캐스트

     test = 120L
    println("$test")  //Long 형으로 스마트 캐스트

     test = 12.0f
    println("$test")  //Float 형으로 스마트 캐스트
}