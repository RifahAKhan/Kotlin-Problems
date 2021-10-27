//Program to find the longest prefix string in the list of arrays
fun main() {
    var strs = arrayOf("flower", "flow", "flight")
    if (strs.size == 0)
        println(" ")
    var prefix = strs[0];
    for (i in 1..(strs.size - 1)) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1);
            if (prefix.isEmpty())
                println(" ")
        }
    }
    println(prefix)
}