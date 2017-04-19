package codekata.ddcn

import org.scalatest.{FlatSpec, Matchers}
import BowlingGameKata._

class BowlingGameKataSpec extends FlatSpec with Matchers {

  "Bowling Game Scorer" should "add scores of 2 balls" in {
    calculateScore(List(1,4)) shouldBe 5
  }

  it should "add scores of 3 bowls" in {
    calculateScore(List(1,4,4)) shouldBe 9
  }

  it should "add scores of 4 bowls" in {
    calculateScore(List(1,4,4,5)) shouldBe 14
  }

  it should "add scores of 7 bowls when third frame is spare" in {
    calculateScore(List(1,4,4,5,6,4,5)) shouldBe 29
  }

  it should "add scores of 8 bowls when third frame is spare" in {
    calculateScore(List(1,4,4,5,6,4,5,4)) shouldBe 38
  }

  it should "add scores when fifth frame is strike" in {
    calculateScore(List(1,4,4,5,6,4,5,4,10,1,1)) shouldBe 52
  }

  it should "add scores including 2 strikes and spares" in {
    calculateScore(List(1,4,4,5,6,4,5,5,10,0,1)) shouldBe 61
  }

}
