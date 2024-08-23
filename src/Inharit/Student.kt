package Inharit

class Student(name: String, age:Int, gender:String, var studentID:String):Persons(name,age,gender) {

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Student ID: $studentID")

    }
}