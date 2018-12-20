fun main(args: Array<String>) {
    needToFindSeven()
}

fun needToFindSeven() {
    val list3 : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    print(list3)
}
