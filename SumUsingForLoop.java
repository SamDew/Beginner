import java.util.*;
import java.lang.*;
import java.io.*;
class SumOfNaturalNumbers
{
   public static void main(String args[])
   {
     int SUM=0;
     int i;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = s.nextInt();
     for(i=0; i<n; i++)
     {
     SUM =  SUM + i;
     }
    System.out.println("The sum is:" +SUM);
   }
}