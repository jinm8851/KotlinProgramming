package chap04.section1

fun main() {

    val a = 12
    val b = 7


    val max = if (a > b) {
        println("a 선택")
        a  //마지막 식인 a 가 반환되어 max에 할당
    }else {
        println("b선택")
        b  //마지막 식인 b 가 반환되어 max에 할당
    }
    println(max)
}