public class EscapeSequencesComments {
  public static void main( String[] args ) {
    //This excersise demonstrates escape sequences & comments (like this)!
    System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
    System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
    //System.out.frimp( "Learn Java the Hard Way" );
    System.out.print( "Hello\n" ); //This line prints Hello.
    System.out.print( "Jello\by\n" ); //This line prints Jelly.
    /* The quick brown fox jumped over a lazy dog.
    Quick wafting zephyrs vex bold Jim. */
    System.out /* testing */ .println( "Hard to believe, eh?" );
    System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
    System.out.println( "\\// -=- \\//" );
    System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
    System.out.println( "I hope you understnad \"escape sequences\" now.\n" );
    // and comments. :)
  }
}
/*This project would not compile with a block
comment between print and ln on line 13.*/
