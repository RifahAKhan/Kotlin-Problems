//Program to print a pattern of numbers
fun main(){
    for(i in 1..5){
        for(j in 1..i){
            print("$j ")
        }
        println()
    }
    for(i in 5 downTo 1){
        for(j in 1..(i - 1)){
            print("$j ")
        }
        println()
    }
}