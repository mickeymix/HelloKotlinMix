import java.util.*


fun main(args:Array<String>){

    //inputc
    print("Enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

    //process
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var Age:Int?
    Age=year.minus(DOB)

    //output

    println("Your age is $Age years")


}