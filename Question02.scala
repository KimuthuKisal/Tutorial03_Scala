object Main {

  def main(args: Array[String]): Unit = {
    val temp = cels_to_fahr(35)
    println("Temperature in Fahrenheit : " + temp);
    //95.0

  }

  def cels_to_fahr(t:Int) : Double = {
        return t*1.8 + 32
    }

}