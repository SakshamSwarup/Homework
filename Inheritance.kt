fun main() {
    
var TataTruck1 = truck()
TataTruck1.wheels()

}

/*By Default classes are final . So it cannot be inherited
We use open keyword to inherite the class and override the methods. */
open class Vechicle {
   
    fun wheels(){ println("It has a four Wheels.")}
    fun horn(){println("It has 1 Horn.")}
    fun Doors(){}
    fun Backlight(){}
    fun FrontLight(){}


}

class truck:Vechicle() {

    fun grandCarrier(){}
    
}
