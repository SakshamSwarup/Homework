fun main (){

val s1 = Student("Saksham", 20, "M 56 ")
s1.success()


}


class Student(var Name: String, var RollNo: Int, var Addrress:String){

fun success(){


println("You have successfully filled the data of Mr. ${Name}. ")


}


}