package exercises

object Exercises {

  def values(): Unit = {
    val a: Int = 6
    val result: Int = 2 + a
    assert(result == 8)
    println("Congratulations! You are amazing!")
  }

  def stringInterpolation(): Unit = {
    val h: String = "Hello"
    val result: String = s"$h World"
    assert(result == "Hello World")
    println("Congratulations! You are incredible!")
  }

  def methods(): Unit = {
    def makeHelloWorld1: String = "Hello World"
    assert(makeHelloWorld1 == "Hello World")
    def makeHelloWorld2(): String = makeHelloWorld1
    assert(makeHelloWorld2() == "Hello World")
    println("Congratulations! You are a great human being!")
  }

  def methodsWithArguments(): Unit = {
    def add(a: Int, b: Int): Int = a + b
    assert(add(1, 2) == 3)
    println("Congratulations! Have a great day!")
  }

  def listSumMethod(): Unit = {
    val l = List(3, 7)
    val result = l.sum
    assert(result == 10)
    println("Congratulations! You deserve the best!")
  }

  def option(): Unit = {
    val choice1: Boolean = true
    val result1: Option[Int] = if (choice1) None else Some(1)
    assert(result1.isEmpty)
    val choice2: Boolean = false
    val result2: Option[Int] = if (choice2) None else Some(1)
    assert(result2.isDefined)
    println("Congratulations! Believe in yourself!")
  }

  def differenceBetweenValLazyValAndDef(): Unit = {
    println("-")
    println("Starting")

    lazy val thisLazyVal: Int = {
      println("this lazy val")
      10
    }

    def thisMethod: Int = {
      println("this method")
      5
    }

    val thisValue: Int = {
      println("this value")
      20
    }

    println("-")
    println("Testing method")
    assert(thisMethod + thisMethod == 10)

    println("-")
    println("Testing Lazy val")
    assert(thisLazyVal + thisLazyVal == 20)

    println("-")
    println("Testing val")
    assert(thisValue + thisValue == 40)

    println("-")
    println("Congratulations! Stay focused on your journey to greatness!")
  }

  def mapForList(): Unit = {
    val l = List(3, 7, 7)
    println(l)

    val upOne = l.map(a => a + 1)
    println(upOne)

    val result = upOne.sum

    assert(result == 20)
    println(
      "Congratulations! 'Write it on your heart that every day is the best day in the year.' -Ralph Waldo Emerson"
    )
  }

  def classNew(): Unit = {
    class Person(firstName: String, lastName: String) {
      lazy val fullName: String = s"$firstName $lastName"
      def sayMyName(): Unit = println(s"My name is $fullName.")
    }
    val p: Person = new Person("Leo", "Benkel")
    p.sayMyName()
    assert(p.fullName == "Leo Benkel")
    println(
      "Congratulations! 'Everything has beauty, but not everyone can see.' -Confucius"
    )
  }

  def comparators(): Unit = {
    val a: Int = 5
    val b: Int = 6

    assert(a < b)

    val c: Int = 10
    val d: Int = 10

    assert(c == d)

    val e: Int = 13
    val f: Int = 12

    assert(e > f)

    println("Congratulations! 'The giant tree grows from a grain.'")
  }

  def listFilterMethod(): Unit = {
    val l = List(1, 2, 3, 4)
    println(l)

    val filtered = l.filter(a => a < 2)
    println(filtered)

    val result = filtered.sum
    assert(result == 1)

    println("Congratulations! 'Prepare the umbrella before it rains.'")
  }

  def callByNameParameters(): Unit = {
    def myIf(predicate: Boolean, ifTrue: => Int, ifFalse: => Int): Int = {
      if (predicate) ifTrue else ifFalse
    }

    lazy val a: Int = {
      throw new Exception("Wrong path")
    }

    lazy val b: Int = {
      println("Creating 'b'")
      567
    }

    val decision: Boolean = false

    val result: Int = myIf(
      decision,
      ifTrue = a,
      ifFalse = b
    )

    assert(result == 567)

    println(
      "Congratulations! 'Do what you have to do, until you can do what you want to do.' Oprah Winfrey"
    )
  }

  def caseClass(): Unit = {
    case class Person(firstName: String, lastName: String)
    val result: Person = Person("Leo", "Benkel")
    assert(result.lastName == "Benkel")
    println(
      "Congratulations! 'Next to trying and winning, the best thing is trying and failing.' ―Lucy Maud Montgomery"
    )
  }

  def objects(): Unit = {
    object Configuration {
      lazy val KeyNumberOfFoos: String = "NumberOfFoos"
      lazy val KeyNumberOfBar: String = "NumberOfBar"
    }

    object Database {
      private val database: Map[String, Int] = Map(
        Configuration.KeyNumberOfFoos -> 567,
        Configuration.KeyNumberOfBar -> 12
      )
      def getDataFromDatabase(key: String): Option[Int] =
        database.get(key)
    }

    val configurationFromDatabase: Option[Int] =
      Database.getDataFromDatabase(Configuration.KeyNumberOfFoos)

    println(configurationFromDatabase)

    assert(configurationFromDatabase.contains(567))

    println("Congratulations! 'Be nice to yourself, you're doing your best.'")
  }

  def visibility(): Unit = {
    object Foo {
      val visibilityPublic = "a"

      private val visibilityPrivate = "b"
    }
    val result: String = Foo.visibilityPublic
    assert(result == "a")

    println("Congratulations! You can change the world.")
  }

  def companionObjects(): Unit = {
    import Animal._

    case class Animal(numberOfLegs: Int) {
      lazy val name: String = convertLegNumberToName(numberOfLegs)
    }

    object Animal {
      val BipedName = "biped"
      val QuadripedName = "quadriped"
      val CentipedName = "centiped"

      private val LegName: Map[Int, String] = Map(
        2 -> BipedName,
        4 -> QuadripedName,
        100 -> CentipedName
      )

      private def convertLegNumberToName(numberOfLegs: Int): String = {
        LegName.get(numberOfLegs).getOrElse(s"$numberOfLegs legged creature")
      }
    }
    val quadriPed: Animal = Animal(4)
    val biPed: Animal = Animal(2)

    // println(Animal.convertLegNumberToName(biPed.numberOfLegs))

    assert(quadriPed.name == QuadripedName)
    assert(biPed.name == BipedName)

    println("Congratulations! We only live 4000 weeks, live them the fullest.")
  }

  def apply(): Unit = {
    class Person(
        val firstName: String,
        val lastName: String
    ) {
      lazy val fullName: String = s"$firstName $lastName"
      def apply(talk: String): String = s"$fullName says: '$talk'"
      override def toString: String = s"Person($firstName, $lastName)"
    }

    object Person {
      def apply(firstName: String, lastName: String): Person = {
        new Person(firstName, lastName)
      }
      def apply(fullName: String): Person = {
        val parts = fullName.split(" ")
        val firstName: String = parts.lift(0).getOrElse("N/A")
        val lastName: String = parts.lift(1).getOrElse("N/A")
        new Person(firstName, lastName)
      }
    }

    val leo: Person = new Person("Leo", "Benkel")
    println(leo)

    val tesla: Person = Person("Nikola", "Tesla")
    println(tesla)

    val edison: Person = Person.apply("Thomas Edison")
    println(edison)

    println(tesla("I want to help bring free energy to the world!"))
    println(edison.apply("I stole a bunch of ideas!"))

    val p: Person = Person("Wonderful You")

    assert(leo.firstName == "Leo")
    assert(tesla.lastName == "Tesla")
    assert(p("Hello World") == s"Wonderful You says: 'Hello World'")

    println(
      "Congratulations! 'Don't cry because it's over. Smile because it happened.' -Dr. Seuss"
    )
  }

  def optionMap(): Unit = {
    val input: Option[Int] = Some(1)
    println(input)

    val mapped: Option[Int] = input.map(a => a + 1)
    println(mapped)

    val result: Int = mapped.getOrElse(0)
    assert(result == 2)

    println(
      "Congratulations! There are no pressure to be happy, take your time."
    )
  }

  def listFlatten(): Unit = {
    val l: List[Int] = List(1, 2, 3, 4)

    val ll: List[List[Int]] = l.map(a => List(a - 1, a, a + 1))
    println(s"Map: $ll")

    val flatList: List[Int] = ll.flatten
    println(s"Flat: $flatList")

    val sum: Int = flatList.sum
    assert(sum == 30, sum)

    println("Congratulations! Happiness = Reality -Expectation")
  }

  def tuple(): Unit = {
    val a: (Int, String) = (12, "abc")

    val first: Int = a._1
    val second: String = a._2

    assert(first == 12)
    assert(second == "abc")

    val flip = a.swap
    val expectedFlip: (String, Int) = "abc" -> 12

    assert(flip == expectedFlip)

    val tripleList: List[(Int, String, Int)] = List(
      (1, "a", 1),
      (2, "h", 2),
      (3, "c", 3)
    )

    val modifiedTripleList: List[(Int, String)] =
      tripleList.map(r => (r._1 + r._3) -> "haha")

    val expectedModifiedTripleList: List[(Int, String)] = List(
      2 -> "haha",
      4 -> "haha",
      6 -> "haha"
    )

    assert(expectedModifiedTripleList == modifiedTripleList)

    println("Congratulations! Do not be afraid, you are not alone.")
  }

  def threadSleep(): Unit = {
    def now = {
      import java.util.Calendar
      Calendar.getInstance().getTime()
    }
    println(s"$now -Start")

    val seconds: Int = 1
    val milliSeconds: Int = seconds * 1000

    println(s"$now -Waiting $seconds seconds")
    Thread.sleep(milliSeconds)
    println(s"$now -Done")

    println("Congratulations! You are the best You there is, so far!")
  }

  def random(): Unit = {
    import scala.util.Random
    {
      val rand = new Random()

      println("Random Int:")
      println(rand.nextInt())

      val maxRand = 10
      println(s"Random Int lower than $maxRand:")
      println(rand.nextInt(maxRand))
    }

    object RandomUtils {
      val seed = 0
      private val rand = new Random(seed)

      def randomInt(min: Int, max: Int): Int = {
        rand.nextInt(max - min) + min
      }
    }

    val minRand = 10
    val maxRand = 20
    println(
      s"Random number between $minRand and $maxRand with seed ${RandomUtils.seed}:"
    )
    println(RandomUtils.randomInt(minRand, maxRand))

    val output = RandomUtils.randomInt(13, 200)
    println(output)
    assert(output == 41, output)

    for {
      min <- 0 to 1000
      max <- 0 to 2000
      if min < max
    } {
      val randomNumber = RandomUtils.randomInt(min, max)
      assert(randomNumber >= min)
      assert(randomNumber < max)
    }

    println("Congratulations! Keep moving forward.")
  }

  def flatMap(): Unit = {
    val opt: Option[Int] = Some(1)
    val outOpt: Option[Int] = opt.flatMap {
      case n if n > 3 => Some(n)
      case 1          => Some(3)
      case _          => None
    }
    assert(outOpt == Some(3))

    val l: List[Int] = 2 :: 4 :: Nil
    val outList: List[Int] = l.flatMap {
      case n if n == 2 => List(1, 2, 3)
      case n if n == 3 => n :: n :: Nil
      case n if n < 5  => n :: Nil
      case _           => Nil
    }
    assert(outList.length == 4)

    println("Congratulations! Go beyond.")
  }

  def curry(): Unit = {
    def add(a: Int)(b: Int): Int = a + b
    val add2: Int => Int = add(2)
    val r1: Int = add2(4)
    assert(r1 == 6)

    val r2 = add(3)(7)
    assert(r2 == 10)
    val r3 = add(3) { 3 + 4 }
    assert(r3 == 10)

    println("Congratulations! Don't stop going forward!")
  }

  def `try`(): Unit = {
    // throw new Exception("Something is broken")
    // val badBadMath = 5 / 0

    import scala.util.Random
    import scala.util.{Try, Success, Failure}

    val rand = new Random(0)
    val numerator: Int = 12
    def denominator(): Int = if (rand.nextBoolean()) 0 else 1
    def mightFail(): Try[Int] = Try(numerator / denominator())

    def results(): Int = mightFail() match {
      case Success(v) => v
      case Failure(ex) =>
        println(s"It failed but we are trying again: $ex")
        results()
    }
    assert(results() == 12)

    def badMethod(): Try[Int] = Try(throw new Exception("Bad method"))
    val alternativeResults: Int = badMethod().getOrElse(8)
    assert(alternativeResults == 8)

    println("Congratulations! Go beyond.")
  }

  def range(): Unit = {
    val inputList1 = (0 to 50)
    println(inputList1)
    val result1: Int = inputList1.sum
    val expected1: Int = 1275
    assert(result1 == expected1, result1)

    val step: Int = 3
    val inputList2 = (0 until 20 by step).toList
    println(inputList2)
    val result2: Int = inputList2.length
    val expected2: Int = 7
    assert(result2 == expected2, result2)

    println(
      "Congratulations! 'Happiness is when what you think, what you say, and what you do are in harmony.' -Mahatma Ghandi"
    )
  }

  def listParallel(): Unit = {
    import scala.collection.parallel.CollectionConverters._

    val from: Int = 0
    val end: Int = 12
    val step: Int = 4
    val expected: Int = 32
    val result1: Int = (from to end by step).map { a =>
      val adder: Int = 2
      println(s"#seq> $a + $adder")
      a + adder
    }.sum
    assert(result1 == expected, result1)

    println("With 'par':")
    val result2: Int = (from to end by step).par.map { a =>
      val adder: Int = 2
      println(s"#par> $a + $adder")
      a + adder
    }.sum
    assert(result2 == expected, result2)

    println(
      "Congratulations! 'Do today what others won't so tomorrow you can do what others can't.' -Jerry Rice"
    )
  }

  def main(): Unit = {
    object Database {
      private lazy val fakeDatabase: Map[Int, String] = Map(
        76 -> "Leo",
        12 -> "bob"
      )

      def apply(key: Int): Option[String] = fakeDatabase.get(key)
    }

    // Yes, missing the point, I know.
    object Maine {
      def maine(args: Array[String]): Unit = {
        assert(Database(12) == Some("bob"))
        assert(Database(34) == None)
        assert(Database(76) == Some("Leo"))

        println(
          "Congratulations! 'It does not matter how slowly you go as long as you do not stop.' -Confucius"
        )
      }
    }
    Maine.maine(Array())
  }

  def set(): Unit = {
    val s1: Set[Int] = Set(6, 0, 2, 19, 1)
    println(s1)
    val s2: Set[Int] = (0 to 6 by 2).toSet
    println(s2)

    val s: Set[Int] = s1 ++ s2
    println(s)

    val increment: Int = 1
    val result = s.map(a => a + increment).sum

    assert(result == 38, result)

    println(
      "Congratulations! 'The secret of getting ahead is getting started.' -Mark Twain"
    )
  }

  def definedType(): Unit = {
    type MyType = Int
    def factory(): MyType = 2
    val n: MyType = factory()
    val expected: MyType = 2
    assert(n == expected, n)

    println(
      "Congratulations! 'Well done is better than well said.' -Stephen Hawking"
    )
  }

  def patternMatching(): Unit = {
    type L = List[Int]

    val startR: Int = 0
    val endR: Int = 10
    val l: L = (startR to endR).toList
    println(l)

    val l1: L = l.map {
      case 0          => 1
      case n if n < 5 => n + 4
      case n if n < 8 => n - 3
      case _          => 0
    }
    println(l1)
    val expected1: Int = 36
    assert(l1.sum == expected1, l1)

    def transform(input: L, f: Int => Int): L = {
      def loop(accumulator: L, rest: L): L = {
        println(s"acc: $accumulator")
        rest match {
          case Nil          => accumulator
          case head :: tail => loop(accumulator :+ f(head), tail)
        }
      }
      loop(Nil, input)
    }

    val l2: L = transform(l1, a => a + 1)
    println(l2)
    val expected2: Int = 47
    assert(l2.sum == expected2, l2)

    println(
      "Congratulations! 'If you can dream it, you can do it.' -George S. Patton"
    )
  }

  def foldLeft(): Unit = {
    val startR: Int = 0
    val endR: Int = 19
    val stepR: Int = 3
    val l: List[Int] = (startR until endR by stepR).toList
    println(l)
    val startFold: Int = 1
    val r1: Int = l.foldLeft(startFold)((a, b) => a + b)
    assert(r1 == 64, r1)

    val factor: Int = 2
    def isEven(n: Int): Boolean = n % factor == 0
    val r2 = l.foldLeft(List.empty[Int]) {
      case (accumulator, n) if isEven(n)  => accumulator :+ (n / factor)
      case (accumulator, n) if !isEven(n) => accumulator :+ (n * factor)
      case _                              => List.empty[Int]
    }
    assert(r2 == List(0, 6, 3, 18, 6, 30, 9), r2)

    println(
      "Congratulations! 'If you're going through hell, keep going.' -Franklin D. Roosevelt"
    )
  }

  def stream(): Unit = {
    val startN: Int = 0
    val increment: Int = 2
    println("- First stream -")
    def stream1(n: Int = 0): LazyList[Int] = {
      n #:: stream1(n + increment)
    }
    val s1 = stream1(startN)
    val takeN: Int = 10
    println(s1.take(takeN))
    println(s1.take(takeN).toList)
    println(s1.take(takeN).toList)
    println(s1.take(takeN).toList)
    val r1 = s1.take(takeN).sum
    assert(r1 == 90, r1)

    println("- Second stream -")
    def stream2(n: Int = 0): LazyList[Int] = {
      LazyList
        .from(n)
        .map(a => a * increment)
    }
    val s2: LazyList[Int] = stream2(startN)
    println(s2.take(6).take(5).take(4).toList)
    println(s2.take(4).take(5).take(6).toList)
    val r2 = s2.take(takeN).sum
    assert(r2 == 90, r2)

    println("- Factorial -")
    def factorial(n: Int): Int = {
      if (n == 0) 1
      else n * factorial(n - 1)
    }
    def factorialStream(n: Int): Int = {
      val start: Int = 1
      val takeN: Int = n
      def multiply(a: Int, b: Int): Int = a * b
      LazyList
        .from(start)
        .take(takeN)
        .foldLeft(1)(multiply)
    }
    (0 to 10).foreach { n =>
      val f: Int = factorial(n)
      val fs: Int = factorialStream(n)
      println(s"$f == $fs")
      assert(f == fs)
    }

    println(
      "Congratulations! 'The secret of getting ahead is getting started.' -Mark Twain"
    )
  }

  def forComprehension(): Unit = {
    case class Row(id: Int, list: List[Int])
    val howManyInput: Int = 10
    val howManyListItem: Int = 20
    val input: List[Row] = (0 to howManyInput)
      .map(i => Row(i, list = (0 to howManyListItem).toList))
      .toList
    val modFilter: Int = 5
    val increase: Int = 1

    val output1: List[Int] = input.flatMap { case Row(id, list) =>
      list.flatMap(n =>
        List(id, n)
          .withFilter(i => id + n % modFilter == 0)
          .map(_ + increase)
      )
    }
    val output1Sum = output1.sum
    println(output1Sum)

    val output2: List[Int] = for {
      Row(id, list) <- input
      n <- list
      i <- List(id, n)
      if id + n % modFilter == 0
    } yield {
      i + increase
    }
    val output2Sum = output2.sum
    println(output2Sum)

    assert(output1Sum == output2Sum, output1Sum)
    assert(output1 == output2)
    val expected: Int = 60
    assert(output1Sum == expected, output1Sum)

    println(
      "Congratulations! 'Knowing is not enough; we must apply. Willing is not enough; we must do.' -Johann Wolfgang von Goethe"
    )
  }

  def implicitClass(): Unit = {
    object Implicits {
      // Compiler says "value class may not be a member of another class"
      // implicit class IntExtra(val i: Int) extends AnyVal {
      //   def isEven: Boolean = i % (2: Int) == 0
      //   def increaseByN(n: Int = 1): Int = i + n
      // }
      implicit class IntExtra(i: Int) {
        def isEven: Boolean = i % (2: Int) == 0
        def increaseByN(n: Int = 1): Int = i + n
      }

      implicit class ListExtra(list: List[Int]) {
        def everyNMap(n: Int)(f: Int => Int): List[Int] = {
          list.zipWithIndex.map {
            case (element, i) if i % n == 0 => f(element)
            case (element, _)               => element
          }
        }
      }
    }

    import Implicits._

    val listEnd: Int = 15
    val input: List[Int] = (0 to listEnd).toList
    println(input)
    val output: List[Int] = input
      .filter(_.isEven)
      .everyNMap(56)(_.increaseByN(4))
    println(output)
    val result: Int = output.sum
    val expected: Int = 60
    assert(result == expected, result)

    println(
      "Congratulations! 'It does not matter how slowly you go as long as you do not stop.' -Confucius"
    )
  }

  def regex(): Unit = {
    import scala.util.matching.Regex
    import java.util.regex.{Matcher, Pattern}
    import scala.util.Try

    val testPhoneNumber: String = "123-456-7890"
    val isPhoneNumber = "[0-9]{3}-[0-9]{3}-[0-9]{4}".r.matches(testPhoneNumber)
    println(s"is phone number: $isPhoneNumber")

    object FindEmail {
      private val regex: Regex = new Regex("([a-z]+)@([a-z]+)\\.([a-z]+)")
      private val pattern: Pattern = regex.pattern

      def apply(input: String): RegexFind = RegexFind(pattern.matcher(input))

      case class RegexFind(private val m: Matcher) {
        private lazy val find: Boolean = m.find()
        private lazy val groupCount: Int = m.groupCount()

        private lazy val matches: List[String] = (for {
          n <- 1 to groupCount
          group = Try(m.group(n))
          if group.isSuccess
        } yield group.get).toList

        override lazy val toString: String = s"match: $find, matches: $matches"
      }
    }
    val testEmail: String = "test@example.com"
    val matches = FindEmail(testEmail)
    println(s"Matches: $matches")

    val testAddress: String = "123 tutorial st."
    val isAddress = "([0-9]+) ([a-z]+) (st|blvd)\\.".r
    testAddress match {
      case isAddress(number, streetName, streetType) =>
        println(s"streetName: $streetName $streetType, at: $number")
        assert(number.toInt == 123, number)
    }

    println(
      "Congratulations! 'The most effective way to do it, is to do it.' -Amelia Earhart"
    )
  }

  def implicitVal(): Unit = {
    case class Tracker(name: String)

    object Utils {
      def add(a: Int, b: Int)(implicit t: Tracker): Int = {
        println(s"${t.name} add")
        a + b
      }

      def multiply(a: Int, b: Int)(implicit t: Tracker): Int = {
        println(s"${t.name} multiply")
        a * b
      }
    }

    object Foo {
      implicit private val t: Tracker = Tracker("[Foo]")

      private val a: Int = 4
      private val b: Int = 4
      val out = Utils.add(a, b)
    }

    object Bar {
      implicit private val t: Tracker = Tracker("[Bar]")

      private val a: Int = 30
      private val b: Int = 2
      val out = Utils.multiply(a, b)
    }

    val fooOut = Foo.out
    val barOut = Bar.out

    assert(fooOut == 8, fooOut)
    assert(barOut == 60, barOut)

    val oneOff = Utils.add(10, 24)(Tracker("Addition"))
    assert(oneOff == 34, oneOff)

    println(
      "Congratulations! 'When something is important enough, you do it even if the odds are not in your favor.' -Elon Musk"
    )
  }

  def future(): Unit = {
    import java.util.concurrent.TimeUnit
    import scala.util.Try
    import scala.concurrent.duration.Duration
    import scala.concurrent.{
      Await,
      ExecutionContext,
      ExecutionContextExecutor,
      Future
    }
    implicit val ex: ExecutionContextExecutor = ExecutionContext.global

    println(">> Start exercise")
    def createCompute(name: String)(operation: => Int): Future[Int] = {
      Future {
        println(s"Start $name")
        val output = operation
        println(s"Done $name")
        output
      }
    }
    val f1: Future[Int] = createCompute("f1") {
      Thread.sleep(100)
      1
    }
    val f2: Future[Int] = createCompute("f2") {
      Thread.sleep(50)
      1
    }.map(a => a + 1)

    val fTotal = for {
      f1Result <- f1
      f3Result <- createCompute("f3") {
        Thread.sleep(50)
        3
      }
      f4Result <- createCompute("f4") {
        Thread.sleep(50)
        4
      }
      f5Result <- createCompute("f5") {
        Thread.sleep(50)
        5
      }
      f2Result <- f2
    } yield {
      f1Result + f2Result + f3Result + f4Result + f5Result
    }
    val outputTotal: Int =
      Await.result(fTotal, Duration(1000, TimeUnit.MILLISECONDS))
    assert(outputTotal == 15, outputTotal)

    println(">> Start Part 2")
    val f: Future[Int] = Future {
      println("start")
      Thread.sleep(1500)
      println("finish")
      1
    }
    val output: Int =
      Try(Await.result(f, Duration(2, TimeUnit.SECONDS))).getOrElse(5)
    Thread.sleep(750)
    assert(output == 1, output)

    println(
      "Congratulations! 'Ever tried. Ever failed. No matter. Try Again. Fail again. Fail better.' -Samuel Beckett"
    )
  }

  def `trait`(): Unit = {
    trait Animal {
      def name: String
      protected def sound: String
      final def talk(): Unit = println(s"$name says $sound")
    }

    case class Dog(override val name: String) extends Animal {
      override protected final lazy val sound = "woof"
    }

    case class Cat(override val name: String) extends Animal {
      override protected final lazy val sound = "meow"
    }

    case class Bird(override val name: String) extends Animal {
      override protected final lazy val sound = "pip"
    }

    val cat: Cat = Cat("Kitty")
    val dog: Dog = Dog("Snuffles")
    val bird: Bird = Bird("Coco")

    val myAnimals: List[Animal] = List(cat, dog, bird)

    myAnimals.foreach(a => a.talk())

    assert(myAnimals.map(a => a.name) == List("Kitty", "Snuffles", "Coco"))

    println(
      "Congratulations! 'Set your goals high, and don't stop till you get there.' -Bo Jackson"
    )
  }

  def either(): Unit = {
    val lEi: List[Either[String, Int]] = List(
      Left("abc"),
      Right(12)
    )
    println(lEi)

    def divide(a: Double, b: Double): Either[String, Double] = {
      if (b == 0) Left("Division by zero") else Right(a / b)
    }
    val a1: Double = 1
    val b1: Double = 0
    val badResult: Either[String, Double] = divide(a1, b1)
    assert(badResult.isLeft)
    badResult.left.foreach(l => println(s"Error: $l"))

    val a2: Double = 24
    val b2: Double = 2
    val goodResult: Either[String, Double] = divide(a2, b2)
    val resultModified: Either[String, Double] = goodResult.map(r => r + 1)
    val resultGet: Double = resultModified.getOrElse(1.0)
    assert(resultGet == 13)
    assert(goodResult.isRight)

    println(
      "Congratulations! 'No bird soars too high if he soars with his own wings.' -William Blake"
    )
  }

  def stringFormat(): Unit = {
    val i: Int = 5
    val outputLeadingZeros = f"$i%04d"
    println(outputLeadingZeros)
    assert(outputLeadingZeros == "0005")

    val length: Int = 4
    val c: Char = '0'
    println(s"%${c}${length}d".format(i))

    val infiniteDouble: Double = 10 / 3.0
    println(f"$infiniteDouble%09.4f")

    val totalCharacterNumber: Int = 7
    val decimalQuantity: Int = 3
    assert(totalCharacterNumber > decimalQuantity)
    val outputTruncDecimalAndLeadZero =
      s"%0${totalCharacterNumber}.${decimalQuantity}f".format(infiniteDouble)
    println(outputTruncDecimalAndLeadZero)
    assert(outputTruncDecimalAndLeadZero == "003.333")

    import java.util.Locale
    import java.text.NumberFormat

    val bigNumber: Long = 123345567
    val formatNumberFR = NumberFormat.getIntegerInstance(Locale.FRANCE)
    println(formatNumberFR.format(bigNumber))
    val formatNumberUS = NumberFormat.getIntegerInstance(Locale.US)
    println(formatNumberUS.format(bigNumber))

    println(
      "Congratulations! 'With the new day comes new strength and new thoughts.' -Eleanor Roosevelt"
    )
  }

  def abstractClass(): Unit = {
    abstract class Shape(
        name: String,
        protected val lengthOfSides: Int,
        numberOfSides: Int
    ) {
      def circumference: Double = numberOfSides * lengthOfSides

      override def toString: String =
        s"$name shape of size $lengthOfSides " +
          f"with $numberOfSides sides have a circumference of $circumference%1.2f"
    }
    case class Square(size: Int) extends Shape("Square", size, 4)
    case class Triangle(size: Int) extends Shape("Triangle", size, 3)
    case class Circle(radius: Int) extends Shape("Circle", radius, 0) {
      override lazy val circumference: Double =
        scala.math.Pi * 2.0 * lengthOfSides
    }

    val square: Square = Square(size = 4)
    val triangle: Triangle = Triangle(size = 3)
    val circle: Circle = Circle(radius = 2)
    val shapes: List[Shape] = List(
      square,
      triangle,
      circle
    )
    shapes.foreach(println)
    assert(square.circumference == 16)
    assert(triangle.circumference == 9)
    assert(Math.abs(circle.circumference - 12) <= 1)

    println(
      "Congratulations! 'Ever tried. Ever failed. No matter. Try Again. Fail again. Fail better.' -Samuel Beckett"
    )
  }

  def recursion(): Unit = {
    def sumUpTo(until: Int): Int = {
      def loop(n: Int = 0, acc: Int = 0): Int = {
        if (n >= until) n + acc
        else loop(n + 1, acc + n)
      }
      loop()
    }

    val result: Int = sumUpTo(5)
    val expected: Int = 15
    assert(result == expected, result)

    println(
      "Congratulations! 'Knowing is not enough; we must apply. Willing is not enough; we must do.' -Johann Wolfgang von Goethe"
    )
  }

  def repeatedParameters(): Unit = {
    case class AnnoyingInput(l: List[Int]) {
      lazy val sum = l.sum
    }
    case class NiceLookingInput(l: Int*) {
      lazy val sum = l.sum
    }

    val a1: AnnoyingInput = AnnoyingInput(List(1, 2, 3))
    val b1: NiceLookingInput = NiceLookingInput(1, 2, 3)
    println(a1)
    println(b1)
    assert(a1.sum == b1.sum)

    val input: List[Int] = List(1, 2, 3)
    val a2: AnnoyingInput = AnnoyingInput(input)
    val b2: NiceLookingInput = NiceLookingInput(input: _*)
    assert(a2.sum == b2.sum)

    println(
      "Congratulations! 'It always seems impossible until it's done.' -Nelson Mandela"
    )
  }

  def genericTrait(): Unit = {
    trait Combine[A] {
      def combineWith(a: A): A
    }

    case class PotatoBag(weight: Double) extends Combine[PotatoBag] {
      override def combineWith(otherBag: PotatoBag): PotatoBag =
        PotatoBag(this.weight + otherBag.weight)
    }

    case class TruckOfPotatoes(potatoBags: PotatoBag*) {
      lazy val totalWeight: Double =
        potatoBags
          .reduceOption((a, b) => a.combineWith(b))
          .map(_.weight)
          .getOrElse(0)
    }

    val truck: TruckOfPotatoes = TruckOfPotatoes(PotatoBag(10), PotatoBag(8.1))
    val totalWeigth = truck.totalWeight
    assert(totalWeigth == 18.1, totalWeigth)

    println(
      "Congratulations! 'Set your goals high, and don't stop till you get there.' -Bo Jackson"
    )
  }

  def `sealed`(): Unit = {
    sealed trait Shape {
      def name: String
    }
    object Shapes {
      case class Square() extends Shape {
        override lazy final val name: String = "Square"
      }
      case class Triangle() extends Shape {
        override lazy final val name: String = "Triangle"
      }
      case class Circle() extends Shape {
        override lazy final val name: String = "Circle"
      }
    }

    val a: Shape = Shapes.Triangle()
    assert(a.name == "Triangle")

    println("Congratulations! Keep on doing great things!")
  }

  def caseObject(): Unit = {
    object A {
      lazy val a: String = "a"
    }
    case object Foo {
      lazy val foo: String = "foo"
    }

    val a: A.type = A
    val foo: Foo.type = Foo
    assert(a == A)
    assert(foo == Foo)
    println(s"'a' is ${a.toString}")
    println(s"'foo' is ${foo.toString}")
    assert(a.a == "a")
    assert(foo.foo == "foo")
    val expectedName: String = "Foo"
    assert(foo.toString == expectedName)

    println(
      "Congratulations! 'Failure will never overtake me if my determination to succeed is strong enough.' -Og Mandino"
    )
  }

  def enumerationFor2x(): Unit = {
    object Ores {
      // Sealed so that unmatched patterns are caught by the compiler
      sealed abstract class Ore(val pricePerKg: Double)
      case object Iron extends Ore(0.1235)
      case object Gold extends Ore(61350.05)
      case object Nickel extends Ore(1.0)
      case object Zinc extends Ore(2.3970)
    }
    import Ores._

    val o: Ore = Ores.Nickel
    val result = o match {
      case Iron   => 1
      case Gold   => 2
      case Nickel => 3
      case Zinc   => 4
    }
    assert(result == 3, result)

    case class Box(ore: Ore, mass: Double) {
      lazy val value: Double = ore.pricePerKg * mass
      override def toString = s"[$ore x ${mass}Kg]"
    }
    val boxes = List(
      Box(Iron, 12),
      Box(Nickel, 4),
      Box(Nickel, 1),
      Box(Gold, 3),
      Box(Iron, 1),
      Box(Zinc, 2),
      Box(Gold, 1),
      Box(Gold, 1)
    )
    val totalWeight = boxes.map(_.mass).sum
    assert(totalWeight == 25, totalWeight)
    val totalValue = boxes.map(_.value).sum
    val totalWeightGold = boxes.filter(_.ore == Gold).map(_.mass).sum
    assert(totalWeightGold == 5, totalWeightGold)
    val totalWeightNickel = boxes.filter(_.ore == Nickel).map(_.mass).sum
    assert(totalWeightNickel == 5, totalWeightNickel)

    println(s"Shipment: $boxes")
    println(s"Total weight: ${totalWeight}Kg | Total Value: $$${totalValue}")
    boxes.groupBy(_.ore).foreach {
      case (Iron, boxes) => println(s"- a lot of iron")
      case (ore, boxes) =>
        val totalWeight = boxes.map(_.mass).sum
        val totalValue = boxes.map(_.value).sum
        println(
          s"- $ore: Total weight: ${totalWeightGold}Kg | Total Value: $$${totalWeightNickel}"
        )
    }

    println(
      "Congratulations! 'Many of us never realize our greatness because we become sidetracked by secondary activities' -Less Brown"
    )
  }

  def contexts(): Unit = {
    // 1
    val a: Int = 10
    val b: Int = {
      val a: Int = 2
      val b: Int = 10
      a + b
    }
    assert(a == 10)
    assert(b == 12)

    {
      val a: Int = 3
      val b: Int = 4
      assert(a + b == 7)

      {
        val a: Int = 4
        val b: Int = 4
        assert(a + b == 8)

        {
          val b: Int = 5
          assert(a + b == 9)

          {
            val a: Int = 5
            assert(a + b == 10)
          }
        }
      }
    }

    println(
      "Congratulations! 'Life is 10% what happens to you and 90% how you react to it.' -Charles R. Swindoll"
    )
  }

  def infixNotation(): Unit = {
    {
      val a: Int = 10
      val b: Int = 7
      val r: Int = a.+(b)
      assert(r == 17, r)
    }

    {
      val a: Boolean = true
      val b: Boolean = false
      val r: Boolean = a.||(b)
      assert(r)
    }

    {
      case class Foo(a: Int) {
        def combineWith(extraA: Int): Foo = {
          this.copy(a = this.a + extraA)
        }

        def combineWith(other: Foo): Foo = {
          this.copy(a = this.a + other.a)
        }

        def increased: Foo = this.combineWith(1)
      }

      val a: Foo = Foo(1)
      val b1: Int = 12
      val r1: Foo = a combineWith b1
      assert(r1.a == 13)

      val b2: Foo = Foo(b1)
      val r2: Foo = a.combineWith(b2)
      assert(r1.==(r2))
    }

    println(
      "Congratulations! 'Failure will never overtake me if my determination to succeed is strong enough.' -Og Mandino"
    )
  }

  def patternMatchingAt(): Unit = {
    case class Person(firstName: String, lastName: String) {
      override lazy val toString: String = s"[$firstName $lastName]"
    }
    object Person {
      def apply(fullName: String): Person = {
        val splitted = fullName.split(" ")
        Person(splitted(0), splitted(1))
      }
    }

    val people = Seq(
      Person("Adriana Zhang"),
      Person("Jerome Serrano"),
      Person("Jakayla Gomez"),
      Person("Terry Terrell"),
      Person("Anabel Rowe"),
      Person("Lara Dudley"),
      Person("Malaki Sullivan"),
      Person("Lara", "Long"),
      Person("No Body"),
      Person("Eugene Gaines"),
      Person("Derrick Pace"),
      Person("Rylee Ayers")
    )
    val output = people
      .flatMap {
        case p @ Person(firstName, _) if firstName.startsWith("A") => Some(p)
        case p @ (Person("Rylee", _) | Person(_, "Pace"))          => Some(p)
        case Person(firstName, "Terrell") => Some(Person(firstName, "Doe"))
        case p @ Person("Lara", _)        => Some(p.copy(firstName = "John"))
        case _                            => None
      }
      .sortBy(_.toString)
    output.foreach(println)

    val expectedLength: Int = 7
    assert(output.length == expectedLength)

    println(
      "Congratulations! 'Do one thing every day that scares you.' -Eleanor Roosevelt"
    )
  }

  def patternMatchingOR(): Unit = {
    sealed trait Shape
    case object Square extends Shape
    case object Triangle extends Shape
    case object Circle extends Shape
    case object Rectangle extends Shape
    case object Hexagone extends Shape
    case object Octagon extends Shape

    val shape: Shape = Octagon
    val output: String = shape match {
      case s @ (Square | Circle)           => s"The $s is perfect"
      case Hexagone | Triangle | Rectangle => "This shape is ok"
      case s                               => s"I don't know this shape: $s"
    }
    println(output)
    assert(output == s"I don't know this shape: $shape")

    println("Congratulations! 'Impossible is just an opinion.' -Paulo Coelho")
  }

  def patternMatchingForCaseClass(): Unit = {
    case class Person(firstName: String, lastName: String) {
      override lazy val toString: String = s"[$firstName $lastName]"

      private lazy val firstLetterFirstName: Char = firstName.toUpperCase.head
      private lazy val firstLetterLastName: Char = lastName.toUpperCase.head

      lazy val initials: String =
        s"$firstLetterFirstName$firstLetterLastName"

      lazy val isFirstBefore: Boolean =
        firstLetterFirstName <= firstLetterLastName
    }
    object Person {
      def apply(fullName: String): Person = {
        val splited = fullName.split(" ")
        Person(splited(0), splited(1))
      }
    }

    val people = Seq(
      Person("Adriana Zhang"),
      Person("Jerome Serrano"),
      Person("Jakayla Gomez"),
      Person("Oscar Martinez"),
      Person("Anabel Rowe"),
      Person("Lara Dudley"),
      Person("Malaki Sullivan"),
      Person("Hailey Terrell"),
      Person("Aubree Ferrell"),
      Person("Eugene Gaines"),
      Person("Derrick Pace"),
      Person("Rylee Ayers"),
      Person("Beckham Meadows"),
      Person("Tanner Francis"),
      Person("Niles Crane"),
      Person("Fabian Compton"),
      Person("Kirsten Potter"),
      Person("Kara Jensen"),
      Person("Jasper Ray"),
      Person("Frasier Crane")
    )
    val output: Seq[(Int, String)] = people.map {
      case Person("Malaki", _) => 1 -> "Mulligan"
      case p @ Person(_, lastName) if lastName.endsWith("l") =>
        2 -> s"$p's last name ends with 'l' and it is $lastName"
      case p @ (Person("Fabian", _) | Person(_, "Potter") |
          Person("Eugene", "Gaines")) =>
        3 -> s"$p was selected by this complex filter"
      case p if p.initials == "JP" => 4 -> s"$p has initials ${p.initials}"
      case p if p.isFirstBefore =>
        5 -> s"$p has the first name's first letter before the last name's first letter: ${p.initials}"
      case p => 6 -> s"$p was not caught by any filter"
    }.sorted
    println("Names processed:")
    output.foreach(println)
    assert(output.length == people.length)

    val groups = output.groupBy(_._1).view.mapValues(_.length)
    println("Names grouped:")
    groups.foreach(println)
    val expectedGroup2: Int = 2
    assert(groups(2) == expectedGroup2)
    val expectedGroup5: Int = 6
    assert(groups(5) == expectedGroup5)

    println(
      "Congratulations! 'The best time to plant a tree was 20 years ago. The second best time is now.' -Chinese Proverb"
    )
  }

  def upperConstraint(): Unit = {}

  def caseClassCopy(): Unit = {}

  def implicitConversion(): Unit = {}

  def caseClassUnapply(): Unit = {}

  def challenge1(): Unit = {}

  def listZip(): Unit = {}

  def placeholder(): Unit = {}

  def implicitProof(): Unit = {}

  def unapplyMagic(): Unit = {}

  def multipleInheritance(): Unit = {}

  def constraintInheritance(): Unit = {}

  def higherKind(): Unit = {}

  def wildcard(): Unit = {}

  def valPatternMatching(): Unit = {}

  def asteriskParameter(): Unit = {}

  def selfReferredType(): Unit = {}

  def optionPatternMatching(): Unit = {}

  def listPatternMatching(): Unit = {}

  def listOfOptionFlatten(): Unit = {}

  def operators(): Unit = {}

  def literalIdentifiers(): Unit = {}

  def extractorPattern(): Unit = {}

  def functor(): Unit = {}

  def foldable(): Unit = {}

  def applicative(): Unit = {}

  def covariance(): Unit = {}

  def traversable(): Unit = {}

  def typeclass(): Unit = {}

  def monad(): Unit = {}
}

object Main {

  def main(args: Array[String]): Unit = {
    Exercises.values()
    Exercises.stringInterpolation()
    Exercises.methods()
    Exercises.methodsWithArguments()
    Exercises.listSumMethod()
    Exercises.option()
    Exercises.differenceBetweenValLazyValAndDef()
    Exercises.mapForList()
    Exercises.classNew()
    Exercises.comparators()
    Exercises.listFilterMethod()
    Exercises.callByNameParameters()
    Exercises.caseClass()
    Exercises.objects()
    Exercises.visibility()
    Exercises.companionObjects()
    Exercises.apply()
    Exercises.optionMap()
    Exercises.listFlatten()
    Exercises.tuple()
    Exercises.threadSleep()
    Exercises.random()
    Exercises.flatMap()
    Exercises.curry()
    Exercises.`try`()
    Exercises.range()
    Exercises.listParallel()
    Exercises.main()
    Exercises.set()
    Exercises.definedType()
    Exercises.patternMatching()
    Exercises.foldLeft()
    Exercises.stream()
    Exercises.forComprehension()
    Exercises.implicitClass()
    Exercises.regex()
    Exercises.implicitVal()
    Exercises.future()
    Exercises.`trait`()
    Exercises.either()
    Exercises.stringFormat()
    Exercises.abstractClass()
    Exercises.recursion()
    Exercises.repeatedParameters()
    Exercises.genericTrait()
    Exercises.`sealed`()
    Exercises.caseObject()
    Exercises.enumerationFor2x()
    Exercises.contexts()
    Exercises.infixNotation()
    Exercises.patternMatchingAt()
    Exercises.patternMatchingOR()
    Exercises.patternMatchingForCaseClass()
    Exercises.upperConstraint()
    Exercises.caseClassCopy()
    Exercises.implicitConversion()
    Exercises.caseClassUnapply()
    Exercises.challenge1()
    Exercises.listZip()
    Exercises.placeholder()
    Exercises.implicitProof()
    Exercises.unapplyMagic()
    Exercises.multipleInheritance()
    Exercises.constraintInheritance()
    Exercises.higherKind()
    Exercises.wildcard()
    Exercises.valPatternMatching()
    Exercises.asteriskParameter()
    Exercises.selfReferredType()
    Exercises.optionPatternMatching()
    Exercises.listPatternMatching()
    Exercises.listOfOptionFlatten()
    Exercises.operators()
    Exercises.literalIdentifiers()
    Exercises.extractorPattern()
    Exercises.functor()
    Exercises.foldable()
    Exercises.applicative()
    Exercises.covariance()
    Exercises.traversable()
    Exercises.typeclass()
    Exercises.monad()
  }
}
