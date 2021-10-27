import java.util.*

//Program to sort a given array and remove duplicates from the array
fun main(){
    var arr = mutableListOf(10,9,8,1,20,9,12,4,8)
    println("Original array: ${arr}")
    arr.sort()
    println("Sorted array: ${arr}")

    val distinct = arr.toSet()
    println("Perfect Array:${distinct}")

}