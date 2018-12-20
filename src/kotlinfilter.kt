fun main(args: Array<String>) {
//    var list3 : MutableList<String> = mutableListOf("mix","test","test2","mera","micka")
//
//    println(list3.filter { s: String -> s == "mix" })
//    println(list3.asSequence().filter { s: String -> s == "mix" }.toList())
//    println(list3.filter { s: String -> s == "m" }.sortedBy { it.length })


    listOf(1, 2, 3)
            .filter { println("Filter: $it"); it % 2 == 0 }
            .map { println("Map: $it"); it + 1 }
            .forEach { println("Each: $it") }

//    sequenceOf(1, 2, 3)
//            .filter { println("Filter: $it"); it % 2 == 0 }
//            .map { println("Map: $it"); it + 1 }
//            .forEach { println("Each: $it") }
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    spices.filter { it.contains("curry")}.sortedBy { it.length }

    spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
//    > [cayenne]
    spices.filter { it.startsWith('c') && it.endsWith('e') }
}