import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number;
	    Scanner s=new scanner(System.in);
	    System.out.println("number:");
	    number=s.nextInt();
		if(number>0)
		{System.out.println("The number is positive.");}
		else if(number<0)
		{System.out.println("The number is negative.");}
		else if(number==0)
		{System.out.println("The number is zero.");}
	}
}