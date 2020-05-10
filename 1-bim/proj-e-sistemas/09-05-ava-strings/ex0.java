/******************************************************************************
                            3°B Informática.
                    Aluno: Lakhsmy Castro Magalhães.
*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		// Note: the BasicStringHandler class dont modify original target string
		BasicStringHandler handler = new BasicStringHandler();
		
		// Read the String, 
		// you can replace this with the hardcode string "UMA frase COM letras MAIÚSCULAS e minúsculas" as below:
		// String target = "UMA frase COM letras MAIÚSCULAS e minúsculas";
		String target = input.nextLine();
		
		// Use BasicStringHandler methods with native Java String Methods
		String inLowerCase = handler.toLowerCase(target);
		String inUpperCase = handler.toUpperCase(target);
		String startedInSecondLetter = handler.startIn(target, 2);
		String replaced = handler.replace(target, "A", "X");
		
		// Show in console
		System.out.println(inLowerCase);
		System.out.println(inUpperCase);
		System.out.println(startedInSecondLetter);
		System.out.println(replaced);
	}
}

class BasicStringHandler 
{
    public static String toLowerCase(String target){
        return target.toLowerCase();
    }
    public static String toUpperCase(String target){
        return target.toUpperCase();
    }
    public static String startIn(String target, int indexToStart){
        return target.substring(indexToStart);
    }
    public static String replace(String target, String from, String to){
        return target.replace(from, to);
    }
}
