import java.util.*;
import java.lang.*;
import java.io.*;
class AlphaNum
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
char n = s.next().charAt(0);
if((n>='a' && n<='z')||(n>='A' && n<='Z'))
System.out.println("It is a character");
else
System.out.println("It is a number");
}
}