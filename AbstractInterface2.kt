fun main() {
    var objMaruti = Maruti()
        println(objMaruti.car())
        println(objMaruti.doors())
    
      var objHuman = human()
     println(objHuman.ears())
     println( objHuman.eyes())
    
    
    
    }
    
    abstract class Cars{
    
        abstract fun car()
        fun wheels(){
            println("the Car has Four wheeels.")
        }
        fun doors(){
            println("Car has 4 Doors ")
        }
    }
    
    class Maruti: Cars(){
        override fun car() {
            println("Its Maruti Suzuki Brand Car.")
        }
    
    
    
    
    
    }
    interface Animals{    // Interface Animal acts as Superclass.
        fun ears(){
            println("2 ears")
        }
        fun eyes(){
            println("2 eyes")
        }
        fun eats(){
            println("They Eats")
        }
        fun run(){
            println("They Run")
        }
    }
    
    class human:Animals{  // Subclass.
        override fun ears() {
            super.ears()        // Super Keyword, The human class inherit can use and utlize the default behviour Of Superclass.
        }
    
        override fun eyes() {
            super.eyes()
        }
    
        override fun eats() {
            super.eats()
        }
    
    
    }
