import java.util.*;
import java.lang.*;
import java.io.*;

class Natural
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n;
	  int sum=0;
	 Scanner s= new Scanner(System.in);
	 n=s.nextInt();
	 sum=n*(n-1)/2;
	 System.out.println("Sum of Natural numbers is:"+sum);
  	}
}