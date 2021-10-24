//Program to print a pattern of *
fun main(){
    var n = readLine()?.toInt()!!
    var left = n
    var right = n
    for(i in 1..n){
        for(j in 1..(n * 2)){
            if(j == left || j == right)
                print("*")
            else
                print(" ")
        }
        left--
        right++
        println()
    }
}