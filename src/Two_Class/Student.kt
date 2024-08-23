package Two_Class

class Student {
    var name:String = ""
    var ID:Int = 0
    var address:String = ""

    constructor(name:String,){
        this.name = name
    }
    constructor(name:String,id:Int){
        this.name = name
        this.ID = id
    }
    constructor(name:String,id:Int,address:String){
        this.name = name
        this.ID = id
        this.address = address
        println("Name: $name, ID: $id, Address: $address")
    }
    fun main(){
        if (name.equals("") && ID == 0 && address.equals("")){
            println("No Data")
        }
        else if (ID == 0 && address.equals("")){
            println("Name: $name")
        }
        else{
            println("Name: $name, ID: $ID, Address: $address")
        }
    }
}