//Program to convert total days into years, months, days[assuming that all months have 30 days]
fun main(){
    print("Enter total days: ")
    var total = readLine()?.toInt()!!
    println("Total Days: ${total}")
    println("Years: ${total / 360}")
    var rem = total % 360
    println("Months: ${rem / 30}")
    println("Days: ${rem % 30}")
}