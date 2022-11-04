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

  def methods(): Unit = {
    def makeHelloWorld1: String = "Hello World"
    assert(makeHelloWorld1 == "Hello World")
    def makeHelloWorld2(): String = makeHelloWorld1
    assert(makeHelloWorld2() == "Hello World")
  }

  def methodsWithArguments(): Unit = {
    def add(a: Int, b: Int): Int = a + b
    assert(add(1, 2) == 3)
  }

  def listSumMethod(): Unit = {
    val l = List(3, 7)
    val result = l.sum
    assert(result == 10)
  }

  def option(): Unit = {
    val choice1: Boolean = true
    val result1: Option[Int] = if (choice1) None else Some(1)
    assert(result1.isEmpty)
    val choice2: Boolean = false
    val result2: Option[Int] = if (choice2) None else Some(1)
    assert(result2.isDefined)
  }

  def differenceBetweenValLazyValAndDef(): Unit = {}

  def mapForList(): Unit = {}

  def classNew(): Unit = {}

  def comparators(): Unit = {}

  def listFilterMethod(): Unit = {}

  def callByNameParameters(): Unit = {}

  def caseClass(): Unit = {}

  def objects(): Unit = {}

  def visibility(): Unit = {}

  def companionObjects(): Unit = {}

  def apply(): Unit = {}

  def optionMap(): Unit = {}

  def listFlatten(): Unit = {}

  def tuple(): Unit = {}

  def threadSleep(): Unit = {}

  def random(): Unit = {}

  def flatMap(): Unit = {}

  def curry(): Unit = {}

  def `try`(): Unit = {}

  def range(): Unit = {}

  def listParallel(): Unit = {}

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
