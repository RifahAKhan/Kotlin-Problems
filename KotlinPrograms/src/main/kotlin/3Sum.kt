fun main(){
    println("Enter array size: ")
    val arrSize = readLine()?.toInt()
    var nums: Array<Int>? = null
    if (arrSize != null) {
        println("Enter array elements: ")
        nums = Array<Int>(arrSize) { readLine()?.toInt()!! }
        if (nums != null) {
            for (i in 0..(arrSize - 3)) {
                for (j in (i + 1)..(arrSize - 2)) {
                    for (k in (j + 1) until arrSize) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            println("[${nums[i]},${nums[j]},${nums[k]}]")
                        }
                    }
                }
            }
        }
    }
}
