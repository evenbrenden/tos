package exercises

object Exercises {

  def values(): Unit = {

    val a: Int = 6
    val result: Int = 2 + a
    assert(result == 8)
  }

  def stringInterpolation(): Unit = {

    val h: String = "Hello"
    val result: String = s"$h World"
    assert(result == "Hello World")
  }
}

object Main {

  def main(args: Array[String]): Unit = {

    Exercises.values()
    Exercises.stringInterpolation()
  }
}
