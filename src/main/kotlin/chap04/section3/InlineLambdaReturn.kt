package chap04.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("Start of retFunc")
    inlineLambda(13, 3) lit@{ a, b ->  //라벨 (lit@) 사용 = 라벨 사용한 불럭을 빠져나감
        val result = a + b
        if (result > 10) return@lit  //10보다 크면 이함수를 빠져나감(retFunc) 사용할땐 골뱅이 먼저
        println("result: $result")  //10보다 크면 이 문장에 도달하지 못함

    }
    println("end of retFunc")

}

/*fun retFunc() {
    println("Start of retFunc")
    inlineLambda(13, 3) { a, b ->  //암묵적 라벨사용 함수이름사용
        val result = a + b
        if (result > 10) return@inlineLambda //10보다 크면 이함수를 빠져나감(retFunc) 사용할땐 골뱅이 먼저
        println("result: $result")  //10보다 크면 이 문장에 도달하지 못함

    }
    println("end of retFunc")
}
*/

/*//  익명함수 사용
fun retFunc() {
    println("Start of retFunc")
    inlineLambda(13, 3, fun( a, b ){ //암묵적 라벨사용 함수이름사용
        val result = a + b
        if (result > 10) return //10보다 크면 이함수를 빠져나감(retFunc) 사용할땐 골뱅이 먼저
        println("result: $result")  //10보다 크면 이 문장에 도달하지 못함

    })
    println("end of retFunc")
}*/
