
class  Singleton{
    var name:String?=null
    constructor(){
        println("instance is created")
    }

    companion object {
        const val test = "ddsds"
        val instance:Singleton by lazy { Singleton() }
    }
}

fun  main(args:Array<String>){
    Singleton.test
    val s1=Singleton.instance
    s1.name="test"
    println(s1.name)

    val s2=Singleton.instance
    println(s2.name)

    val s3=Singleton.instance
    println(s3.name)
}