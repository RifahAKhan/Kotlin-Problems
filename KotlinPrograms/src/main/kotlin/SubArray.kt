fun main(){
    var count = 0
    println("Enter array size: ")
    val arrSize = readLine()?.toInt()
    println("Enter the target: ")
    val target = readLine()?.toInt()!!
    var nums: Array<Int>? = null
    if (arrSize != null) {
        println("Enter array elements: ")
        nums = Array<Int>(arrSize) { readLine()?.toInt()!! }
        if (nums != null) {
            for (i in 0..(arrSize - 1)) {
                for (j in (i + 1)..(arrSize - 1)) {
                    if (nums[i] + nums[j] == target) {
                        count++
                    }
                }
            }
        }
        println(count)
    }
}