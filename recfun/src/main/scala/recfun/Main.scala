package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = ???

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
/*  def countChange(money: Int, coins: List[Int]): Int = ???
  */
  
/*  def countChange(money: Int, coins: List[Int]): Int = coins match {
  case h :: t =>
    if (h > money) 0 else if (coins == h) 1 else countChange(money, coins - h)  + countChange(t, coins)
  case _ => 0
}*/ 
  
/*val r = f(List(1, 2, 5, 10, 20, 50, 100, 200), 200)*/


def f(ms: List[Int], n: Int): Int = ms match {
  case h :: t =>
    if (h > n) 0 else if (n == h) 1 else f(ms, n - h) + f(t, n)
  case _ => 0
} 

  def countChange(n: Int, ms: List[Int]): Int = ms match {
  case h :: t =>
    if (h > n) 0 else if (n == h) 1 else countChange(n - h , ms) + countChange(n , t)
  case _ => 0
} 
  

}
