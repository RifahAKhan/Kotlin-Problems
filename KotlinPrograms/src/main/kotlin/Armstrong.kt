//Program to check whether a given number is an armstrong number
fun main(){
    var sum = 0
    var num = readLine()?.toInt()!!
    var temp: Int = num
    while(num != 0){
        var digit = num % 10
        sum = sum + digit * digit * digit
        num = num / 10
    }
    if(temp == sum)
        println("Armstrong Number")
    else
        println("Not an Armstrong Number")
}