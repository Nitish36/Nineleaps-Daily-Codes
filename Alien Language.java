/*In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet 
is some permutation of lowercase letters. Given a sequence of words written in the alien language, and the order of the alphabet, return true if 
and only if the given words are sorted lexicographically in this alien language.*/

public class Main
{
    public static boolean isAlienSorted(String[] words,String order)
    {
        int[] charOrder = new int[26];
        for (int i = 0; i < order.length(); i++)
        {
            charOrder[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++)
        {
            String w1 = words[i];
            String w2 = words[i+1];
            int j = 0;
            while (j < w1.length() && j < w2.length())
            {
                if (w1.charAt(j) != w2.charAt(j))
                {
                    int c1 = charOrder[w1.charAt(j) - 'a'];
                    int c2 = charOrder[w2.charAt(j) - 'a'];
                    if (c1 > c2)
                    {
                        return false;
                    }
                    else
                    {
                        break;
                    }
                }
            j++;
            }
        if (j == w2.length() && w1.length() > w2.length()) {
            return false;
        }
    }
    return true;
    }
	public static void main(String[] args) {
	    String [] words = {"hello","leetcode"};
	    String order = "hlabcdefgijkmnopqrstuvwxyz";
	    System.out.println(isAlienSorted(words,order));
	}
}
