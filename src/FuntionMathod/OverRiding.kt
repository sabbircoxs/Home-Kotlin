package FuntionMathod

open class Fruit {
    open fun eat(){
        println("Eating....")
    }
    class Apple:Fruit(){
        override fun eat(){
            println("Apple...")
        }

    }
}