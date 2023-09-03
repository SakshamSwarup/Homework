 fun main(args: Array<String>) {

    var a = arrayOf(0,2,4,5,7,6,3,1,9,11)
    println("This is even")

    for (i in a) {

        if ((i%2)==0){
            print("$i")
             }
        
    }
    print("This is odd.")
    // var  x = 0
    var index:Int = 0
    while (index < a.size){        
        if((a[index] %2) > 0){
            val oddnumber = a[index]
            print(oddnumber)
        }
        index +=1
    }
    
    

    
}