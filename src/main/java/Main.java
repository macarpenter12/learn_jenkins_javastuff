import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Calculator calc = new Calculator();

    while (true) {
      System.out.println("Input a command:");
      String command = input.next();

      switch (command) {
        case "add": {
          int a = input.nextInt();
          int b = input.nextInt();
          input.nextLine();
          System.out.println(calc.add(a, b));
          System.out.println();
          break;
        }
        case "subtract": {
          int a = input.nextInt();
          int b = input.nextInt();
          input.nextLine();
          System.out.println(calc.subtract(a, b));
          System.out.println();
          break;
        }
        case "multiply": {
          int a = input.nextInt();
          int b = input.nextInt();
          input.nextLine();
          System.out.println(calc.multiply(a, b));
          System.out.println();
          break;
        }
        case "divide": {
          int a = input.nextInt();
          int b = input.nextInt();
          input.nextLine();
          System.out.println(calc.divide(a, b));
          System.out.println();
          break;
        }
        case "fibonacci": {
          int n = input.nextInt();
          input.nextLine();
          System.out.println(calc.fibonacciNumberFinder(n));
          System.out.println();
          break;
        }
        case "binary": {
          int n = input.nextInt();
          input.nextLine();
          System.out.println(calc.intToBinaryNumber(n));
          System.out.println();
          break;
        }
        case "quit":
          input.close();
          System.out.println();
          return;
        default:
          System.out.println("Usage: command [args]...");
          System.out.println();
          break;
      }
    }
  }
}
