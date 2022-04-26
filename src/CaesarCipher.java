import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaesarCipher {
	
	static String caesarCipher(String input, int key)
	{
		StringBuilder encrypted = new StringBuilder(input.toUpperCase());
		String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String shiftedAlphabet= alphabet.substring(key)+alphabet.substring(0,key);
		for(int i=0;i<encrypted.length();i++)
		{
			char currChar = encrypted.charAt(i);
			int idx= alphabet.indexOf(currChar);
			if(idx!=-1)
			{
				char newChar=shiftedAlphabet.charAt(idx);
				encrypted.setCharAt(i, newChar);
			}
		}
		return encrypted.toString();
	}
	public static void main(String[] args) 
	{
		String text = new String();
		File file = new File("C:\\Users\\reddy\\Desktop\\test.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(sc.hasNextLine())
		{
			text+=sc.nextLine();
		}
		System.out.println(text);
		System.out.println(caesarCipher(text, 10));
	}

}
