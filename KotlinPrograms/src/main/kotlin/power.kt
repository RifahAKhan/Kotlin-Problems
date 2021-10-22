//Program to check whether a given number is a power of 2
fun main(){
    var flag = 1
    print("Enter the number: ")
    var num = readLine()?.toInt()!!
    while(num > 1 && flag == 1){
        val rem = num % 2
        if(rem == 1)
             flag = 0
        else
            num = num / 2
    }
    if(flag == 1)
        println("The number is a power of 2")
    else
        println("The number is not a power of 2")
}