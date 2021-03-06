import java.util.Scanner;
public class APLesson_09_01
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
	    for (int i = 0; i < words.length; i++) 
		{
			System.out.println("Enter word " + (i+1) + ":");
			words[i] = kb.next();
		}
		
		System.out.println("In order...");
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println("\nReversed...");
		reverse(words);
	}
	
	public static void reverse(String[] words) 
	{
		for (int i = words.length-1; i >= 0; i--) 
		{
			System.out.println(words[i]);
		}
	}
}