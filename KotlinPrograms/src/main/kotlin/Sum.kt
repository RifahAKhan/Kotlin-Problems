//Program to find the sum of all the digits of a number
fun main(){
    var sum = 0
    print("Enter the number: ")
    var num = readLine()?.toInt()!!
    while(num != 0){
        var digit = num % 10
        sum = sum + digit
        num = num / 10
    }
    println("Sum of the digits is ${sum}")
}