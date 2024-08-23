package FuntionMathod

fun main(args: Array<String>) {
    sum(2,2)
    sum("Strring", 34.4, 34)
    sum(34, 43.4, "String")
    sum(34.4, 432.4)
}
fun sum(a: Int, b: Int){
    println(a+b)
}
fun sum(x: String, y:Double, z:Int){
    println(x+y+z)
}
fun sum(x:Int, y:Double, z:String){
    println(z+x+y)
}
fun sum(x:Double, y:Double,):Double{
    return x+y
}