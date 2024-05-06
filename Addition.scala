object Addition {
  def main(args: Array[String])= {
    // Input numbers
    var num1: Int = 5
    var num2: Int = 7

    // Addition
    var sum: Int = num1 + num2

    // Output
    println("The sum of " + num1 + " and " + num2 + " is: " + sum)
  }
}


object greatestnumber {
 def main(args: Array[String])={
 // Define three numbers
 var num1 = 10;
 var num2 = 25;
 var num3 = 15;
 
 // Find the greatest number
 var greatest = if (num1 >= num2 && num1 >= num3) {
 num1;
 } else if (num2 >= num1 && num2 >= num3) {
 num2;
 } else {
 num3;
 }
 
 // Print the result
 println(s"The greatest number among $num1, $num2, and $num3 is: $greatest");
 }
}