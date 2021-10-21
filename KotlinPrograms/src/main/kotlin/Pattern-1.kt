fun main(){
   for(i in 5 downTo 1){
       for(j in 5 downTo i){
           print("$j ")
       }
       println()
   }
    println()
    for(i in 1..5){
        for(j in 5 downTo i){
            print("$j ")
        }
        println()
    }
}