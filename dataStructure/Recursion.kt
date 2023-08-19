fun main(){
    
    println(recursion(6))
}


fun recursion(n:Int):Int{

if (n==0 ){
    
return 1


} else{
    return n *recursion(n-1)
   
}



}
