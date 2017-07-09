import java.util.*;
import java.lang.*;
import java.io.*;

class AlphaNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	char alphabet;
	Scanner s= new Scanner(System.in);
	alphabet=s.next().charAt(0);
	if(Character.isLetter(alphabet))
	System.out.println("It's an alphabet");
	else
	System.out.println("It's a number");
	}
}