object Main {

  def main(args: Array[String]): Unit = {
    val volume = find_vloume(5)
    println("Volume of the sphere : " + volume);
    //392.69908169872417

  }

  def find_vloume(r:Int) : Double = {
        return 4/3*math.Pi*r*r*r
    }

}