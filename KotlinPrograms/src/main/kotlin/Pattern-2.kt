fun main(){
    for(i in 1..5){
        for(j in 1..5){
            if(i == 1 || i == 5 || j == 1 || j == 5)
            print("*")
            else
                print(" ")
        }
        println()
    }
}