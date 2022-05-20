package chap03.section3

fun main() {
    //람다식이 이름 만으로 호출할경우는 해당이름이 람다식자체가 복사가 되서 람다식이 사용되는 시점에서 작동한다
    // 람다식이 값으로 전달했을경우(함수처럼) 함수처럼 호출되서 내용물을 가져온다
    val result = callByValue(lambda())  //람다식 함수를 호출 () 로 함수 호출
    println(result)

    noParam({"Hello world"})    // 매개 변수가 없을때
    noParam { "Hello world" }  // 매개 변수가 없을때

    oneParam({ a -> "Hello World $a" })  // 매개 변수가 하나 있을때 인자 생략할수없음
    oneParam { a -> "Hello World $a" }   // 매개 변수가 하나 있을때 인자 생략할수없음
    oneParam { "Hello World $it" }       // 매개 변수가 하나 있을때  it 으로 대체 할 수 있음

    moreParam({ a,b -> "Hello world $a $b"}) // 소가로 생략가능
    moreParam {_,b -> "hello world $b" } // 두번째 인자만 사용하고 싶을경우

    //일반 매개변수와 람다식매개변수를 같이 사용할경우
    withArgs("Arg1","Arg2",{a,b -> "Hello world $a $b" }) //일반 인자와 함께사용하는 경우
    withArgs("Arg1","Arg2") {a,b -> "Hello world $a $b" } //마지막인자가 람다식일경우 소괄호 바깥으로 불리 가능

    //람다식이 둘일경우
    twoLambda({a,b->"first $a $b"},{"second  $it"})
    twoLambda({a,b->"first $a $b"}) {"second  $it"} //마지막 람다식을 밖으로 빽수 있음

}

fun lambda(): Boolean {
    println("lambda funtion")
    return true
}

fun callByValue(b: Boolean): Boolean {   //일반 변수 자료형으로 선언된 매개 변수
    println("callByValue function")
    return b
}

fun noParam(out: () -> String) = println(out()) //매개 변수가 없을때

fun oneParam(out: (String) -> String) = println(out("OneParam"))  //매개변수가 하나일때

fun moreParam(out: (String,String) -> String) { println(out("OneParam","TowParam"))} // 매개변수가 둘일때

fun withArgs(a:String,b:String,out:(String,String)->String) {  // 일반함수와 같이 사용할경우
    println(out(a,b))
}

fun twoLambda(first:(String,String)->String,second:(String)->String){ //람다식이 둘일경우
    println(first("OneParam","TowParam"))
    println(second("Second"))
}
//val lambda :  () -> Boolean = {
//    println("lambda funtion")
//    true
