package Inharit

class Teacher(name: String, age: Int, gender: String, var teacherID:Int, var subject:String): Persons(name, age, gender) {

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Teacher: $teacherID")
        println("Subject: $subject")
    }
}