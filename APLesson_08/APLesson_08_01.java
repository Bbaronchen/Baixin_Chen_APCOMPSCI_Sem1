import java.util.Scanner;

public class APLesson_08_01
{
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sentence = kb.nextLine();
		replace(sentence);
		
	}
	
	public static void replace(String sentence)
	{
		if (sentence.indexOf(" ") < 0) 
		{
			System.out.println(sentence);
		}
		else
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1);
			replace(sentence);
		}
	}
}