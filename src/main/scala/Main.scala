import scala.collection.mutable.ArrayBuffer

object Main extends App {
  //Chapter 2 exercises
  def signum(n : Int): Int =
    {
    if(n > 0 )
      return 1
    else if(n < 0)
      return -1
    else
      return 0
  }
  def countdown(n : Int) =
    {
      for (i <- 0 to n; from = n - i ){println(from)}

    }

  def recursiveExponents(n : Int): String =
    {
      val r = n
      if(r > 0)
      {
        print("x")
        recursiveExponents(r-1)
      }
      else
        return ""

    }

    //Chapter 3 notes/exercises
    //Literally Everything in 3.1
    val nums = new Array[Int](10)
    val string1 = new Array[String](10)
    val string2 = Array("Hello", "World")
    print(string2(0) + " " + string2(1))
    string2(0) = "Goodbye"
    print(string2(0) + " " + string2(1))

    //3.2 notes
    val b = new ArrayBuffer[Int]()
    b+= 1
    b +=(1,2,3,4,5)
    // ++= adds a collection to the array buffer
    b ++= Array(8,9,10)
    println("\n" + b)
    //Removes last 5 elements of the array
    b.trimEnd(5)
    println(b)
    //at index 2 insert 6
    b.insert(2,6)
    //at index 2 insert 7,8,9
    b.insert(2,7,8,9)
    println(b)
    //remove the value at position 2
    b.remove(2)
    //remove the value at position 2 as well as 3
    b.remove(2,3)
    println(b)

    //3.3
    // Iterate through array
    //for(i <- 0 until b.length) println(i + ":" + b(i))
    // prints values 0-9
    //for(i <- 0 until 10) println(i)
    //counts to 9 by twos
    for(i <- 0 until (10,2)) println(i)
    //prints the elements of the array b
    for(i <- b) println(i)

    //3,4 notes
    val a = Array(2, 3, 5, 7, 11)
    //creates a new array result that is 2 times each element in array a
    val result = for (elem <- a) yield 2 * elem
    println(result)
    //creates an array with a conditional
    val result2 = for (elem <- a if elem % 2 == 0) yield 2 * elem
    println(result2)

}
