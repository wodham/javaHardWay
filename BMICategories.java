import java.util.Scanner;

public class BMICategories {
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

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
        System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
        System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
            System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
        System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
        System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
        System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
        System.out.println( "severely obese" );
    }
    else {
    System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
