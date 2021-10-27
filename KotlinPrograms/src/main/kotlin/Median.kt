//Given two sorted arrays num1 and num2 of size m and n respectively, return the median of the two sorted arrays
fun main(){
    println("Size of arr1: ")
    val arr1Size = readLine()?.toInt()!!
    println("Size of arr2: ")
    val arr2Size = readLine()?.toInt()!!
    var arr1 : Array<Int>?= null
    var arr2 : Array<Int>?= null
    println("Enter the elements of arr1: ")
    arr1 = Array<Int>(arr1Size){ readLine()?.toInt()!!}
    println("Enter the elements of arr2: ")
    arr2 = Array<Int>(arr2Size){ readLine()?.toInt()!!}
    var arr3 = arr1 + arr2
    arr3.sort()
    println(arr3.contentToString())
    if(arr3.size % 2 == 0){
        println("Two middle elements")
        println("${arr3[arr3.size / 2 - 1]} and ${arr3[arr3.size / 2]}")
    }
    else{
        println("One middle element")
        println(arr3[((arr3.size + 1) / 2) - 1])
    }
}