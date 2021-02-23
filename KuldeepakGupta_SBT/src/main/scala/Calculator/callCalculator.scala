package Calculator

object callCalculator {
  def main(args: Array[String]): Unit = {
    val calculator_impl = new Calculator_impl()
    calculator_impl.doAddition(20 ,10)
    calculator_impl.doSubtraction(20 , 10)
    calculator_impl.doMultiplication(20,10)
    calculator_impl.doDivision(20,10)
    calculator_impl.getPower(4,3)
    calculator_impl.getAbsoluteValue(-25)
    calculator_impl.getModulus(40,3)
    calculator_impl.getMaximum(23,56)
    calculator_impl.getMinimum(-25 , 3)
  }

}
