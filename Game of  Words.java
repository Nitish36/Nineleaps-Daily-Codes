/*Ajay and Rajesh want to play the ‘Game of Words’.
Game Rules
Both players are given the same string, S.
Both players have to make substrings using the letters of the string.
Ajay has to make words starting with vowels.
Rajesh has to make words starting with consonants.
The game ends when both players have made all possible substrings.
Scoring
A player gets +1 point for each occurrence of the substring in the string, S.
For Example:
String  = BANANA
Ajay’s vowel beginning word = ANA
Here, ANA occurs twice in BANANA. Hence, Ajay will get 2 Points.
For better understanding, see the image attached below:
Your task is to determine the winner of the game and their score.
Prints:
string: the winner’s name and score, separated by a space, or Draw if there is no winner.
Input Format:
A single line of input containing the string, S.
Constraints:
The string, S  will contain only uppercase letters: A-Z .
S has no whitespaces.
0 < len(S) < 10^6*/

import java.util.ArrayList;
public class Main
{
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }
	public static void main(String[] args) {
	String s = "ARREAR";
	int ctrA=0,ctrR = 0;
        ArrayList<String> aW = new ArrayList<>();
        ArrayList<String> rW = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (substr.length() > 0) {
                    if (isVowel(substr.charAt(0))) {
                        aW.add(substr);
                        ctrA++;
                    } else {
                        rW.add(substr);
                        ctrR++;
                    }
                }
            }
        }
       if(ctrA>ctrR)
       {
           System.out.println("Ajay "+ctrA);
       }
       else
       {
           System.out.println("Rajesh "+ctrR);
       }
	}
}
