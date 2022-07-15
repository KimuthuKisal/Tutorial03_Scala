object Main {

  def main(args: Array[String]): Unit = {
    val area = find_radius(5)
    println("Area of the disk : " + area);
    //78.53981633974483

  }

  def find_radius(r:Int) : Double = {
        return math.Pi*r*r
    }

}