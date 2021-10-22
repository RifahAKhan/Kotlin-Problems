//Program to check whether a given year is a leap year or not
fun main(){
    print("Enter the year(xxxx): ")
    val year = readLine()?.toInt()!!
    if(year % 100 == 0) {
        if (year % 400 == 0)
            println("${year} is a Leap Year")
        else
            println("${year} is a not a Leap Year")
    }
    else{
        if(year % 4 == 0)
            println("${year} is a Leap Year")
        else
            println("${year} is a not a Leap Year")

    }
}