package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  import Main.innerPascal
  test("col=0,row=2") {
    assert(innerPascal(0,2) === 1)
  }

  test("col=1,row=2") {
    assert(innerPascal(1,2) === 2)
  }

  test("col=1,row=3") {
    assert(innerPascal(1,3) === 3)
  }
}
