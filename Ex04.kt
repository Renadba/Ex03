fun main(){
    println("Ex04")
    na(5.0 , 10.0 ,  )
}

fun na(a:Double, b:Double , c:String ="+" ){
    when(c){
        "+" -> {println("a + b = ${a+b}" )}
        "-" -> {println("a - b = ${a-b}")}
        "*" -> {println("a * b = ${a*b} ")}
        "/" -> {println("a / b = ${a/b} ")}
        else -> println("none")
    }
}
