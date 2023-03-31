/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.*/
public class Main
{
	public static void main(String[] args) {
		String s = "Data Guild";
		String [] str = s.split(" ");
		for(String word: str)
		{
		    for(int i = word.length()-1;i>=0;i--)
		    {
		        System.out.print(word.charAt(i));
		    }
		    System.out.print(" ");
		}
	}
}
