fun main(){
    char()
    var w = remainder(9 ,2)
    println(w)
    greeting("Joan", 21)
    var s = count("I am tall")
    println(s)
}
    //Given a string “codeHive”. Write a function that prints out a string composed
    //of the fifth, sixth, seventh and eighth  characters of the string

fun char(){
    var name = "codeHive"
    var n = name[4].toString()+ name[5]+ name[6]+name[7]
    println(n)
}
  //Create and invoke a function that given two numbers returns the
  //remainder of their division
fun remainder(a:Int,b:Int):Int{
    var y = a%b
    return y
}
  //Write a function that takes in two parameters, name and age and returns a
  //String with this structure “Hi, my name is p and I am z years old.” Where p
  //and  z are your  name and age respectively
fun greeting(name:String,age:Int) {
    var b = ("Hi my name is $name I am $age years old")
    println(b)
}
//Write a function that takes in a string and returns its length
fun count(name: String):Int {
   var size= name.length
    return size
}