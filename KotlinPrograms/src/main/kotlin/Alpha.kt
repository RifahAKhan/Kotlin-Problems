//Program to print a pattern of alphabets
fun main(){
    var n = readLine()?.toInt()!!
    var left = n
    var right = n
    for(i in 1..n){
        for(j in 1..(n * 2)){
            if(j == left || j == right)
                print((i + 64).toChar())
            else
                print(" ")
        }
        left--
        right++
        println()
    }
}