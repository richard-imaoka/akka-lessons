package my.cats.advanced

object FunctorApp {

  def mapTest(): Unit ={
    /**
     * Informally, a functor is anything with a map method.
     */
    List(1, 2, 3).map(x => (x % 2) == 0)
    // res0: List[Boolean] = List(false, true, false)

    List(1, 2, 3).map(_ * 2).map(_ + 4)
    // res1: List[Int] = List(6, 8, 10)

    List(1, 2, 3).map(x => (x * 2) + 4)
    // res2: List[Int] = List(6, 8, 10)

    Option(1).map(_.toString)
    // res3: Option[String] = Some(1)

    Option(123).map(_ * 4).map(_ + 4)
    // res4: Option[Int] = Some(496)

    Option(123).map(x => (x * 2) + 4)
    // res5: Option[Int] = Some(250)
  }

  def moreConcreteExamples(): Unit ={
    import scala.concurrent.{Future, Await}
    import scala.concurrent.ExecutionContext.Implicits.global
    import scala.concurrent.duration._

    val future1 = Future("Hello world!")
    // future1: scala.concurrent.Future[String] = Future(<not completed>)

    val future2 = future1.map(_.length)
    // future2: scala.concurrent.Future[Int] = Future(<not completed>)

    Await.result(future1, 1.second)
    // res6: String = Hello world!

    Await.result(future2, 1.second)
    // res7: Int = 12
  }

  def functionMaps(): Unit ={
    import cats.instances.function._
    import cats.syntax.functor._

    val func1 = (x: Int)    => x.toDouble
    // func1: Int => Double = <function1>

    val func2 = (y: Double) => (y * 2).toString
    // func2: Double => Double = <function1>

    val func3 = func1.map(func2)
    // func3: Int => String = scala.runtime.AbstractFunction1$$Lambda$9405/272413009@2deb99ee

    func3(1) // function composition by calling map
    // res8: String = 2.0

    func2(func1(1)) // function composition written out by hand
    // res9: String = 2.0

  }

  def main(args: Array[String]): Unit = {

  }
}