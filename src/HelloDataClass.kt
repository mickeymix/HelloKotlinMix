fun main(args: Array<String>) {
   val footballClub =  footballClub("Arsenal",54,5)
    footballClub.name
    footballClub.point
    footballClub.position
}


data class footballClub(var name:String,var point:Int , var position :Int){
    constructor():this("",0,0)
}