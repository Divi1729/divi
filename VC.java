import java.util.*;
import java.lang.*;
import java.io.*;

class VC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
	    Scanner s=new scanner(System.in);
	    System.out.println("ch:");
	    ch=s.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{System.out.println("The given character is a vowel.");}
		else
		{System.out.println("The character is a consonant ");}
		
	}
}