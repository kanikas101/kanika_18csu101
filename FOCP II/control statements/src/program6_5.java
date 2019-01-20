import java.util.*;
class program6_5
{
	public static void main(String args[])
	{
	char ch;
	System.out.println("enter a character : ");
	Scanner scan=new Scanner(System.in);
	ch=scan.next().charAt(0);
	if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
	{
	switch(ch)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':System.out.println("VOWEL!!!");
	         break;
	default:System.out.println("CONSONANT!!");
	}
	}
	else
	{
	System.out.println("ERROR!! NOT A CHARACTER!!");
	}
}
}