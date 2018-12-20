fun main(args: Array<String>) {
    println("Enter Your name.")
    val name = readLine()
    println("Enter age")
    val age = readLine()!!.toInt()
    //Print all Question
//    println("Your name is ${name?.length}")
    println("Your name is $name")
    println("Your age is $age")
    println( printAge(age))



//    println("result Number")

//    printAge()
}

fun printAge(ageInt :Int =20): String {
    return when (ageInt){
        0 -> { "not born"}
        in 1..20 -> {
             "child $ageInt"
        }
        in 20..50 -> {
            "teenage $ageInt"
        }
        else ->{
           "not in the range"
        }
    }
}

fun initCheckAge():Boolean {
    return false
}


