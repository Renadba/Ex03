
fun main(){

//Ex1
    println("Ex1")
    for(num in 0..100){
        if(num == 71)
            println("IT IS OVER 70!!!")
        else println(num)
    }

//Ex2
    println("Ex2")

    var temperature = 35

    while(temperature>= 10){

        when(temperature){
            30 -> println("It is Hot")
            20 -> println(" It is Comfy")
            15 -> println("It is COLD!!!")
            else -> println(temperature)
            }
        temperature--
        }
    }
