package Calculator

class Calculator_impl{

    val calculator_api = new Calculator_api()

    def doAddition(number_1 : Int, number_2 : Int) = {
      println("Addition is " + calculator_api.Addition(number_1 , number_2))
    }

    def doSubtraction (number_1 : Int, number_2 : Int)= {
      println ("Subtraction is " + calculator_api.Subtraction (number_1 , number_2 ) )
    }

    def doMultiplication(number_1 : Int, number_2 : Int) =  {
      println ("Multiplication is " + calculator_api.Multiplication (number_1 , number_2 ) )
    }

    def doDivision(number_1 : Int, number_2 : Int) = {
      println ("Division is " + calculator_api.Division (number_1 , number_2 ) )
    }

    def getPower(number_1 : Int, number_2 : Int) = {
      println ("Value is " + calculator_api.power (number_1 , number_2 ) )
    }

    def getAbsoluteValue(number : Int) = {
      println ("Absolute value is " + calculator_api.Absolute (number) )
    }

    def getModulus(number_1 : Int, number_2 : Int) = {
      println ("Modulus is " + calculator_api.Modulus (number_1 , number_2 ) )
    }

    def getMaximum(number_1 : Int, number_2 : Int) = {
      println ("Maximum value " + calculator_api.Maximum (number_1 , number_2 ) )
    }

    def getMinimum(number_1 : Int, number_2 : Int) = {
      println ("Minimum is " + calculator_api.Minimum (number_1 , number_2 ) )
    }
}

