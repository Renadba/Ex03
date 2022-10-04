fun main(){

    var arr = arrayListOf(9.0 , 2.3 , 5.7 , 3.4, 2.1)
    var average = 0.0
    for(index in 0 until arr.size){
        average += arr[index]
    }
    println("The average is : ${average / 5}")

}