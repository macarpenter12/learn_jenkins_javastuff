import java.util.Random;
import java.util.UUID;

class Calculator {

  Calculator(){

  }

  int add(int a , int b){
    return a + b;
  }

  int subtract(int a , int b){
    return a - b;
  }

  int multiply(int a , int b){
    return a * b;
  }

  int divide(int a , int b){
    if (b == 0) {
      throw new ArithmeticException("/ by zero");
    }
    return a / b;
  }


  /*
  Returns the n'th number in the fibonacci sequence
  https://en.wikipedia.org/wiki/Fibonacci_number
  Example below
  n = x
  0 = 0
  1 = 1
  2 = 1
  3 = 2
  4 = 3
  5 = 5
  .
  .
  .
  etc
   */
  int fibonacciNumberFinder(int n){
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    int[] temp = new int[n + 1];
    temp[0] = 0;
    temp[1] = 1;

    for(int i = 2; i <= n; i++) {
      temp[i] = temp[i - 2] + temp[i - 1];
    }

    return temp[n];
  }


  /*
  Returns binary value of the given int number
  The binary number will be stored as a string
  if int a = 0 then this method returns: 0
  if int a = 10 then this method returns: 1010
  if int a = 16 then this method returns: 10000
   */
  String intToBinaryNumber(int n){
    if (n == 0) {
      return "0";
    }
    StringBuilder result = new StringBuilder();
    while (n > 0) {
      result.insert(0, n % 2);
      n /= 2;
    }
    return result.toString();
  }

  /*
  Create a completely unique String identifier for a given string
  Each createdID must contain the string n in its unaltered Form
  if String n = "Jason"
  then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

  if you run this function twice with the same String input, it must return 2 unique String IDs
   */
  String createUniqueID(String n){
    StringBuilder uniqueID = new StringBuilder(UUID.randomUUID().toString());
    int random = new Random().nextInt(uniqueID.length());
    uniqueID.insert(random, n);
    return uniqueID.toString();
  }


}
