
    // 4 Major Operation for bit manipulation
    /*
    1 .Get 
    2. Set 
    3. Clear
    4. Update
    
    */
fun main(){

    var n = 5
    var pos = 2 
    var bitmask = 1 shl pos
    if ((bitmask and n) == 0) {
        println("The bit at position $pos is zero.")
    } else if ((bitmask and n) != 0) {
        println("The bit at position $pos is one.")
    }
    







}