import scala.annotation.tailrec

object substitution {

  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)


  def factorial(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc else loop(acc * n, n - 1)
    loop(1, n)
  }


  gcd(14, 21)
  factorial(4)

}