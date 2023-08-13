fun main(){
    star1()
    println()
    star2()
    star3()
}

fun star1(){

for (i in 1..5) {
        for (j in 1..5) {
            if(i==1|| i==5 || j==1 || j==5){
                print("*")

            }else{

                print(" ")
            }
            
            
        }
        println("")
    }

}

fun star2() {
    for (k in 5 downTo 1) {
        for (l in 1..k) {
            print("*")
        }
        println("")
    }
}

fun star3(){
    for(p in 5 downTo 1 ){
        for(q in 1..5 ){
            if (p==q || p<=q ){
                print("*")
            }else{
                print(" ")
            }



        }
        println("")


    }



}

