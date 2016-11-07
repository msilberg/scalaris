object session {

//  def sqrt(x: Double) = {
//
//    def abs(x: Double) =
//      if (x <= 0) -x else x
//
//    def isGoodEnough(guess: Double, x: Double): Boolean =
//      abs(guess * guess - x) / x < 0.001
//
//    def improve(guess: Double, x: Double) =
//      (guess + x / guess) / 2
//
//    def sqrtIter(guess: Double, x: Double): Double =
//      if (isGoodEnough(guess, x)) guess
//      else sqrtIter(improve(guess, x), x)
//
//    sqrtIter(1.0, x)
//
//  }

  def sqrt(x: Double) = {

    def abs(x: Double) =
      if (x <= 0) -x else x

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    sqrtIter(1.0)

  }

  sqrt(4)
  sqrt(1e-6)
  sqrt(1e2)
  1e2
}