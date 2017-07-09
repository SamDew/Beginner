import java.util.*;
import java.lang.*;
import java.io.*;
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner s  = new Scanner(System.in);
 
      x = s.nextInt();
      y = s.nextInt();
      z = s.nextInt();
 
      if ( x > y && x > z )
         System.out.println("First number is largest:" +x);
      else if ( y > x && y > z )
         System.out.println("Second number is largest:" +y);
      else if ( z > x && z > y )
         System.out.println("Third number is largest:"+z);
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}