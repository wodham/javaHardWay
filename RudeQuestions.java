import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, clown;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name?" );
    name = keyboard.next();

    System.out.print( "Hi, " + name +  "! How old are you?" );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "?" );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, what's your income, " + name + "?" );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.print( name + "." );

    System.out.print( " Oh! Are you afraid of clowns? " );
    clown = keyboard.next();

    System.out.print( clown +"? I feel the same way about clowns! " );

  }
}

//The program does not blow up when an integer is entered where a double is expected.
//The program does not blow up when an integer or double is entered.
//Question 1, nothing causes the program to blow up.
//Question 2, anything other than an integer causes the program to blow up.
//Question 3, anything other than an integer or a double causes the program to blow up.
//Question 4, anything other than an integer or a double causes the program to blow up.
