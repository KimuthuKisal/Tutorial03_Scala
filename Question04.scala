object Main {

  def main(args: Array[String]): Unit = {
    val b_price = 24.95
    val b_count = 60
    val price = total_cost( b_price, b_count)
    println("Wholesale Cost : " + price)
    //908.6999999999999

  }

  def total_cost(book_price:Double, book_count:Int) : Double = {
        var total_price = book_price * book_count * 0.6 + 3
        if ( book_count>50 ){
            total_price = total_price + ( book_count-50 )*0.75
        }
        return total_price
    }

}