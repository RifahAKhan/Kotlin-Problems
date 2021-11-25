fun main(){
    println("Enter array size: ")
    val arrSize = readLine()?.toInt()
    var nums: Array<Int>? = null
    if (arrSize != null) {
        println("Enter array elements: ")
        nums = Array<Int>(arrSize) { readLine()?.toInt()!! }
        if (nums != null) {
            for (i in 0 until arrSize) {
                for (j in (i + 1) until arrSize) {
                    for (k in (j + 1) until arrSize) {
                        for(l in (k + 1) until arrSize) {
                            if (nums[i] + nums[j] + nums[k] + nums[l] == 0) {
                                println("[${nums[i]},${nums[j]},${nums[k]},${nums[l]}]")
                            }
                        }
                    }
                }
            }
        }
    }
}