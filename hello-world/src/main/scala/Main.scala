object Main extends App {
  println("Hello, World!")

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  println(addInt(1, 2))
}