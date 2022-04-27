public class Words 
{
	static void countChars(String phrase)
	{
		char[] charstr= phrase.toLowerCase().toCharArray();
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int[] count = new int[26];
		for(int i=0;i<charstr.length;i++)
		{
			int idx= alphabets.indexOf(charstr[i]);
			if(idx!=-1)
				count[idx]=count[idx]+1;
		}
		for(int i=0;i<26;i++)
		{
			System.out.println(alphabets.charAt(i) +" --> " +count[i]);
		}
	}
}
