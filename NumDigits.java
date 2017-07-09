import java.util.*;
import java.lang.*;
import java.io.*;

class Countnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n;
	  int c=0;
	 Scanner s= new Scanner(System.in);
	 n=s.nextInt();
	 while(n>0)
	 {
	   n=n/10;
	   c++;
	 }
	 System.out.println("The number of digits is:"+c);
  	}
}