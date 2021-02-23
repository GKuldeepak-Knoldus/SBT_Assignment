package Calculator

class Calculator_api {

  // Addition Method for adding two numbers
  def Addition (number_1 : Int , number_2 : Int) : Int  = number_1 + number_2

  // Subtraction method
  def Subtraction(number_1 : Int , number_2 : Int) : Int = number_1 - number_2

  // Multiplication method for multiplying two numbers
  def Multiplication(number_1 : Int , number_2 : Int) : Int = number_1 * number_2

  // Division Method
  def Division (number_1 : Int , number_2 : Int) : Int = {
    require(number_2 != 0, "Denominator can not be 0")
    number_1 / number_2
  }

  // power method for calculating power of a number
  def power(number_1: Int, number_2: Int): Double = Math.pow(number_1, number_2)

  // Absolute method for calculating absolute value
  def Absolute(number:Int):Int = Math.abs(number)

  // Modulus method
  def Modulus(number_1:Int , number_2:Int):Int = number_1 % number_2

  // Maximum method for calculating maximum between two numbers
  def Maximum(number_1:Int , number_2:Int):Int = if(number_1 > number_2) number_1 else number_2

  // Minimum method for calculating minimum between two numbers
  def Minimum(a:Int,b:Int):Int = if(a<b) a else b

}
