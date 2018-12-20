
fun main(args:Array<String>){

    var arraylist= ArrayList<String>()
    arraylist.add("jena")
    arraylist.add("Laya")
    arraylist.add("Hussein")
    arraylist.add("Ahmed")

    println("First name:"+ arraylist.get(0))
    arraylist.set(0," Laya Hussein")

    println(" all element by object")
    for ( item in arraylist){
        println(item)
    }

    println(" all element by index")
   for( index in 0..arraylist.size-1){
       println(arraylist.get(index))
   }

    // Search
    if( arraylist.contains("Hussein")){
        println(" name is found")
    }else{
        println(" name is not found")
    }


//    var list3 : MutableList<Int> = mutableListOf()
//    for (i in 0..100 step 7) list3.add(i)
//    print(list3)
//    [0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98]
    //    val arr: List<Int> = listOf(1,2,3,4,5)
    //    arr.add(8)
    //
    //    val marr: MutableList<Int> = mutableListOf(1,2,3,4,5)
    //    marr.add(8)

}