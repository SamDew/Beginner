import java.util.*;
import java.lang.*;
import java.io.*;
class Number_type
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int n = s.nextInt();
if(n%2 == 1)
System.out.println("Number is Odd");
else
System.out.println("Number is Even");
}
}