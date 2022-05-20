package chap03.section6

fun a() = b()  //최상위 함수 이므로 어디서든 사용가능
fun b() = println("b")

fun c() {
    fun e() = println("e")
    fun d() = e()  // 오류 d()는 지역함수이며 e() 의 이름을 모름
    d()  // 함수 선언 이후에 사용가능능}
}
fun main() {
    a()
    c()

}
