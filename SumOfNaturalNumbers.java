import java.util.*;
import java.lang.*;
import java.io.*;
class SumOfNaturalNumbers
{
   public static void main(String args[])
   {
     int SUM;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = s.nextInt();
     SUM = (n*(n+1))/2;
                  System.out.println("The sum is:" +SUM);
   }
}