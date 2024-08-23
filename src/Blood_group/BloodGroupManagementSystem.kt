package Blood_group

class BloodGroupManagementSystem {
    private val donors = mutableListOf<Donor>()
    private val users = mutableListOf<User>()

    init {
        //Users
        users.add(User("admin", "123456"))
        users.add(User("musfiq", "123456"))
        users.add(User("sakib", "123456"))

        //Donors
        donors.add(Donor("Musfiqur Rahman", "Dhaka", "O+"))
        donors.add(Donor("Ayesha Siddiqua", "Chittagong", "A+"))
        donors.add(Donor("Tahsin Ahmed", "Sylhet", "B+"))
        donors.add(Donor("Fahim Karim", "Khulna", "AB+"))
        donors.add(Donor("Rifat Hasan", "Rajshahi", "O-"))
        donors.add(Donor("Tanzila Alam", "Barisal", "A-"))
        donors.add(Donor("Sabrina Khan", "Mymensingh", "B-"))
        donors.add(Donor("Nazmul Huda", "Rangpur", "AB-"))
        donors.add(Donor("Hasan Mahmud", "Dhaka", "O+"))
        donors.add(Donor("Razia Sultana", "Chittagong", "A+"))
        donors.add(Donor("Zahid Hasan", "Sylhet", "B+"))
        donors.add(Donor("Shakil Ahmed", "Khulna", "AB+"))
        donors.add(Donor("Munira Begum", "Rajshahi", "O-"))
        donors.add(Donor("Farzana Akter", "Barisal", "A-"))
        donors.add(Donor("Jamil Hossain", "Mymensingh", "B-"))
        donors.add(Donor("Moin Uddin", "Rangpur", "AB-"))
        donors.add(Donor("Nadia Rahman", "Dhaka", "O+"))
        donors.add(Donor("Rubel Hossain", "Chittagong", "A+"))
        donors.add(Donor("Sadia Islam", "Sylhet", "B+"))
        donors.add(Donor("Tariq Aziz", "Khulna", "AB+"))
        donors.add(Donor("Hasanuzzaman Khan", "Rajshahi", "O-"))
        donors.add(Donor("Sultana Yasmin", "Barisal", "A-"))
        donors.add(Donor("Rafiq Uddin", "Mymensingh", "B-"))
        donors.add(Donor("Aminul Islam", "Rangpur", "AB-"))
        donors.add(Donor("Jannatul Ferdous", "Dhaka", "O+"))
        donors.add(Donor("Faisal Mahmud", "Chittagong", "A+"))
        donors.add(Donor("Arif Hossain", "Sylhet", "B+"))
        donors.add(Donor("Nasrin Sultana", "Khulna", "AB+"))
        donors.add(Donor("Abdul Kader", "Rajshahi", "O-"))
        donors.add(Donor("Tamanna Akter", "Barisal", "A-"))
        donors.add(Donor("Sharmin Akter", "Mymensingh", "B-"))
        donors.add(Donor("Mahbubur Rahman", "Rangpur", "AB-"))
        donors.add(Donor("Kazi Rahman", "Dhaka", "O+"))
        donors.add(Donor("Sumaiya Islam", "Chittagong", "A+"))
        donors.add(Donor("Imran Hossain", "Sylhet", "B+"))
        donors.add(Donor("Shamima Akter", "Khulna", "AB+"))
        donors.add(Donor("Golam Rabbani", "Rajshahi", "O-"))
        donors.add(Donor("Rokeya Begum", "Barisal", "A-"))
        donors.add(Donor("Tanvir Ahmed", "Mymensingh", "B-"))
        donors.add(Donor("Akbar Ali", "Rangpur", "AB-"))
        donors.add(Donor("Sharmin Sultana", "Dhaka", "O+"))
        donors.add(Donor("Rashidul Islam", "Chittagong", "A+"))
        donors.add(Donor("Nusrat Jahan", "Sylhet", "B+"))
        donors.add(Donor("Ashikur Rahman", "Khulna", "AB+"))
        donors.add(Donor("Shahidul Islam", "Rajshahi", "O-"))
        donors.add(Donor("Rumana Islam", "Barisal", "A-"))
        donors.add(Donor("Touhidul Islam", "Mymensingh", "B-"))
        donors.add(Donor("Nahid Hossain", "Rangpur", "AB-"))
    }

    //login user
    fun login():Boolean{
        print("Enter Username: ")
        val userName = readLine()!!
        println()
        print("Enter Password: ")
        val password = readLine()!!
        println()

        return users.any{
            it.username == userName && it.password == password
        }

    }

    fun searchDonor(){
        print("Enter Donor Name OR Address OR Blood Group: ")
        val query = readLine()!!.trim().lowercase()
        println()

        val results = donors.filter {
            it.name.lowercase().contains(query) || it.address.lowercase().contains(query) || it.bloodGroup.lowercase().contains(query)
        }

        if(results.isEmpty()){
            println("No donor found")
        }else{
            println("Donor found")
            var i = 1
            results.forEach{
                println("Donor: ${i++}")
                println("Name: ${it.name}")
                println("Address: ${it.address}")
                println("Blood Group: ${it.bloodGroup}")
                println()
            }
        }
    }

    fun addDonor(){
        print("Enter Donor Name: ")
        val name = readLine()!!
        println()

        print("Enter Donor Address: ")
        val address = readLine()!!
        println()

        println("Enter Blood Group: ")
        val bloodGroup = readLine()!!
        println()

        donors.add(Donor(name, address, bloodGroup))
        println("Donor Added Successfully")
    }


    fun mainMenu(){
        while (true){
            println("__________________Main Menu__________________")
            println("1.Search Donor")
            println("2.Add Donor")
            println("0.Exit")
            println("Enter your choice: ")
            when(readLine()){
                "1" -> searchDonor()
                "2" ->addDonor()
                "0" -> {
                    println("Exiting")
                    return
                }
                else -> {
                    println("Invalid choice. Please try again")
                }
            }
        }
    }
}