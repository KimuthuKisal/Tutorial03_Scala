object Main {

    def main(args: Array[String]): Unit = {
        var total_time = easy_peace(2) + tempo(3) + easy_peace(2)
        println("Total runningt time : " + total_time)
        //53
    }

    def easy_peace(d:Int) : Int = {
        return d*8
    }

    def tempo(d:Int) : Int = {
        return d*7
    }

}