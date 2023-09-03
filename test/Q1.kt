fun main(){

    var a = 0
    var b = 1
    var c = 0
    println("This is a Fibonnaci series : ")
    for (i in 0..5) {
        c = a + b
        print("$a, ")
        b = a
        a = c
        

    }



}