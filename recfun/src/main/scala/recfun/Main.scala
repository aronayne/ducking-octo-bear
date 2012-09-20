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
  def pascal(c : Int , r : Int) : Int = 
   innerPascal(r , c)

      
  def innerPascal(r:Int, c:Int) : Int = 
    if (c == 0) 
      1 
    else 
      innerPascal(r, c-1) * (r-c)/c
      
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
      
      var counter = 0
      var head = ' '
      countBrackets(chars)
      
      def countBrackets(chars: List[Char]): Unit = {
        
        if(!chars.isEmpty) {
            head = chars.head
    		if (head == '('){
    			counter += 1
    		}
            if (head == ')'){
    		  counter -= 1
    		}
    		  countBrackets(chars.tail)
        }
      }
      counter == 0
      
    }

  /**
   * Exercise 3
   */
def countChange(n: Int, ms: List[Int]): Int = 

  ms match {
  case h :: t =>
    if (h > n) 0 else if (n == h) 1 else countChange(n - h , ms) + countChange(n , t)
  case _ => 0

} 
  

}
