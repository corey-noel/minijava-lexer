class Factorial {
      public static void main( String[] a ) {
            System.out.println( new Fac().ComputeFac( 10 ) );
      }
}

/* 
block comment
/*
/*

with weird nesting
*/

class Fac { // end of line comment
      public int ComputeFac( int num ) {
            int num_aux;
            if( num < 1 )
                  num_aux = 1;
            else
                  num_aux = num * ( this.ComputeFac( num - 1 ) );
            return num_aux;
      }
}


// comment with no content or newline at end of file
//