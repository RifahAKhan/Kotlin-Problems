//Program to print a pattern of 1's and 0's
fun main(){
    var k = 1
    for(i in 1..5){
        for(j in 1..i){
            print("${(k++) % 2}")
        }
        println()
    }
}