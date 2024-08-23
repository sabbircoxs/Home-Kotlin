package Inharit

class BusinessMan(name: String, age:Int, gender: String, var annulIncome:Double):Persons(name, age, gender) {

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("AnnulIncome: $annulIncome")
    }
}