package chap02.section3

fun main() {
    val a: Int = 128 // 127이하이면 주소가 아닌 성능을 위해서 캐시에 들어가 true가나옴
    val b = a

    println(a===b) //자료형이 기본형인 int가 되어 값이 동일 true
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c==d)  // 값 내용만 비교하는경우 동일 하므로 true
    println(c===d)  //값의 내용은 같지만 참조를 비교해 다른 객체(주소다름)이므로 false
    println(c===e)  //값의 내용도 같고 참조된 객체도 동일 (주소동일) 하므로 true


}