//Program to check if a given number is a palindrome or not
fun main(){
    println("Enter a number: ")
    var n = readLine()?.toString()
    if(n.toString().reversed() == n)
        println("$n is Palindrome")
    else
        println("$n is not a Palindrome")
}