fun main(args: Array<String>) {
    val mycar =MyCar()
//    mycar.
}

class MyCar(var nameModel:String="",var owner:String,var brand:String) {
constructor():this("","","")
    init {
        println("init1")
    }
    init {
        println("init2")
    }
    init {
        println("init3")
    }
}