import java.util.*;
import java.lang.*;
import java.io.*;
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int n;
      System.out.println("Enter three integers ");
      Scanner s  = new Scanner(System.in);
 
      n = s.nextInt();
       if ( n%4 == 0 )
         System.out.println("It is a leap year:" +n);
      else   
         System.out.println("It is not a leap year:" +n);
   }
}