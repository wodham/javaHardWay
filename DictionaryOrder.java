import java.util.Scanner;

public class DictionaryOrder {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String self;

System.out.print( "Make up the name of a programming language! " );
self = keyboard.nextLine();

 if ( self.compareToIgnoreCase("c++") < 0 )
      System.out.println( self + " comes BEFORE c++" );
 if ( self.compareToIgnoreCase("c++") == 0 )
      System.out.println( "c++ isn't a made-up language!" );
 if ( self.compareToIgnoreCase("c++") > 0 )
      System.out.println( self + " comes AFTER c++" );

 if ( self.compareToIgnoreCase("go") < 0 )
      System.out.println( self + " comes BEFORE go" );
 if ( self.compareToIgnoreCase("go") == 0 )
      System.out.println( "go isn't a made-up language!" );
 if ( self.compareToIgnoreCase("go") > 0 )
      System.out.println( self + " comes AFTER go" );

 if ( self.compareToIgnoreCase("java") < 0 )
      System.out.println( self + " comes BEFORE java" );
 if ( self.compareToIgnoreCase("java") == 0 )
      System.out.println( "java isn't a made-up language!" );
 if ( self.compareToIgnoreCase("java") > 0 )
      System.out.println( self + " comes AFTER java" );

 if( self.compareTo("lisp") < 0 )
      System.out.println( self + " comes BEFORE lisp" );
 if ( self.compareToIgnoreCase("lisp") == 0 )
      System.out.println( "lisp isn't a made-up language!" );
 if ( self.compareToIgnoreCase("lisp") > 0 )
      System.out.println( self + " comes AFTER lisp" );

 if ( self.compareToIgnoreCase("python") < 0 )
      System.out.println( self + " comes BEFORE python" );
 if ( self.compareToIgnoreCase("python") == 0 )
      System.out.println( "python isn't a made-up language!" );
 if ( self.compareToIgnoreCase("python") > 0 )
      System.out.println( self + " comes AFTER python" );

 if ( self.compareToIgnoreCase("ruby") < 0 )
      System.out.println( self + " comes BEFORE ruby" );
 if ( self.compareToIgnoreCase("ruby") == 0 )
      System.out.println( "ruby isn't a made-up language!" );
 if ( self.compareToIgnoreCase("ruby") > 0 )
      System.out.println( self + " comes AFTER ruby" );

 if ( self.compareToIgnoreCase("visualbasic") < 0 )
      System.out.println( self + " comes BEFORE visualbasic" );
 if ( self.compareToIgnoreCase("visualbasic") == 0 )
      System.out.println( "visualbasic isn't a made-up language!" );
 if ( self.compareToIgnoreCase("visualbasic") > 0 )
      System.out.println( self + " comes AFTER visualbasic" );
    }
 }
