fun main() {

    var praveen =  praveen()

    praveen.sumofmembers()
    
    
}


abstract class Saksham{   
    fun sumofmembers(){
        System.out.println("hello sum")
    }

    protected fun subtract(){}
    abstract fun multiplication()
}

interface Saksham1{   
    fun sum()     
}



class praveen : Saksham1,Saksham(){

    override fun sum() { 

    }

    override fun multiplication() { }

    // fun sumofmembers(){
    //     System.out.print("function call from praveen sumofmembers")

    // }
}