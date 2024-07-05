package test.com.pract.sparkBasic
import org.scalatest.FunSuite
import java.util.NoSuchElementException
import org.scalatest.BeforeAndAfter
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._
import com.holdenkarau.spark.testing.{RDDComparisons, SharedSparkContext, DataFrameSuiteBase}

class sparkTestingFirst extends FunSuite with DataFrameSuiteBase {
  test("really simple transformation") {
    val input = List("hi", "hi cloudera", "bye")
    val expected = List(List("hi"), List("hi", "cloudera"), List("bye"))
    
  }
}