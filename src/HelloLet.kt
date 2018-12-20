fun main(args: Array<String>) {

    getMyName()?.let { test: String ->  } ?: printNoName()

// elvis fun   getMyName()?.let { test: String -> println(test) } ?: printNoName()
//    getMyName()?.let { test: String -> println(test) } ?: run { printNoName() }
}

fun getMyName(): String? {
    return null
}

fun printNoName(){
    println("There is No Name")
}