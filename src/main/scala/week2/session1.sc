object session1 {

//  def sumOfInts(a: Int, b: Int): Int =
//    if (a > b) 0 else a + sumOfInts(a + 1, b)
//  sumOfInts(1, 10)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumOfInt(a: Int, b: Int): Int = sum(id, a, b)
  def sumOfCube(a: Int, b: Int): Int = sum(cube, a, b)
  def sumOfFactorials(a: Int, b: Int): Int = sum(factorial, a, b)

  def id(n: Int): Int = n
  def cube(n: Int): Int = n * n * n
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  sumOfFactorials(2, 5)
  sumOfInt(1, 5)
  sumOfCube(1, 3)

}