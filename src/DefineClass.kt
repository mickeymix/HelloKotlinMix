//class FootballClub {
//    var clubName: String = "Arsenal"
//    var numberOfPlayer = 30
//    var point :Int = 54
//
//    fun display(): String {
//        return  "clubName is $clubName. Number of Player in the club are $numberOfPlayer. Place of the club in scoreboard $point"
//    }
//}

class FootballClub(var clubName: String = "Arsenal", var numberOfPlayer: Int = 30, var point: Int = 54) {
//    var clubName: String = "Arsenal"
//    var numberOfPlayer = 30


    constructor(testnum :Int):this(){

    }

    constructor():this("test",50,30)

    init {

    }
    fun display(): String {
        return "clubName is $clubName. Number of Player in the club are $numberOfPlayer. Place of the club in scoreboard $point"
    }
}

fun main(args: Array<String>) {
    var fvClub = FootballClub()

}