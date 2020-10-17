import java.util.Scanner;
//
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Calculator calc = new Calculator();

    while (true) {
      System.out.println("Input a command:");
      String command = input.next();

      if ("add".equals(command)) {
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        System.out.println(calc.add(a, b));
        System.out.println();
      } else if ("subtract".equals(command)) {
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        System.out.println(calc.subtract(a, b));
        System.out.println();
      } else if ("multiply".equals(command)) {
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        System.out.println(calc.multiply(a, b));
        System.out.println();
      } else if ("divide".equals(command)) {
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        System.out.println(calc.divide(a, b));
        System.out.println();
      } else if ("fibonacci".equals(command)) {
        int n = input.nextInt();
        input.nextLine();
        System.out.println(calc.fibonacciNumberFinder(n));
        System.out.println();
      } else if ("binary".equals(command)) {
        int n = input.nextInt();
        input.nextLine();
        System.out.println(calc.intToBinaryNumber(n));
        System.out.println();
      } else if ("quit".equals(command)) {
        input.close();
        System.out.println();
        return;
      } else {
        System.out.println("Usage: command [args]...");
        System.out.println();
      }
    }
  }
}
