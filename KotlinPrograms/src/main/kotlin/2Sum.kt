fun main() {
    println("Enter array size: ")
    val arrSize = readLine()?.toInt()
    var nums: Array<Int>? = null
    if (arrSize != null) {
        println("Enter array elements: ")
        nums = Array<Int>(arrSize) { readLine()?.toInt()!! }
        if (nums != null) {
            println("Enter the target: ")
            var target = readLine()?.toInt()!!
            for (i in 0 until arrSize) {
                for (j in (i + 1) until arrSize) {
                    if (nums[i] + nums[j] == target) {
                        println("[${i},${j}]")
                    }
                }
            }
        }
    }
}