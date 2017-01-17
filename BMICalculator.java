import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double ft, inch, pound, bmi, a, b, c;

    a = 0.45;
    b = 12;
    c = 0.025;

    System.out.print( "Your height in (feet only): " );
    ft = keyboard.nextDouble();

    System.out.print( "Your height (inches only): " );
    inch = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pound = keyboard.nextDouble();

    bmi = pound*a / ft*ft*+b*c;

    System.out.println( "Your BMI is " + bmi );
  }
}
