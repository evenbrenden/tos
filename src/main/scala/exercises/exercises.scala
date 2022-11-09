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

    println("Congratulations! Happiness = Reality - Expectation")
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
    println(s"$now - Start")

    val seconds: Int = 1
    val milliSeconds: Int = seconds * 1000

    println(s"$now - Waiting $seconds seconds")
    Thread.sleep(milliSeconds)
    println(s"$now - Done")

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

  def main(): Unit = {}

  def set(): Unit = {}

  def definedType(): Unit = {}

  def patternMatching(): Unit = {}

  def foldLeft(): Unit = {}

  def stream(): Unit = {}

  def forComprehension(): Unit = {}

  def implicitClass(): Unit = {}

  def regex(): Unit = {}

  def implicitVal(): Unit = {}

  def future(): Unit = {}

  def `trait`(): Unit = {}

  def either(): Unit = {}

  def stringFormat(): Unit = {}

  def abstractClass(): Unit = {}

  def recursion(): Unit = {}

  def repeatedParameters(): Unit = {}

  def genericTrait(): Unit = {}

  def `sealed`(): Unit = {}

  def caseObject(): Unit = {}

  def enumerationFor2x(): Unit = {}

  def contexts(): Unit = {}

  def infixNotation(): Unit = {}

  def patternMatchingAt(): Unit = {}

  def patternMatchingOR(): Unit = {}

  def patternMatchingForCaseClass(): Unit = {}

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
