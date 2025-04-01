/*

Problem Statement: Given a String, write a program to remove vowels from a given String.

Examples:

Example 1:
Input: Str = “take u forward”
Output: tk  frwrd
Explanation: All vowels are removed from the given String.

Example 2:
Input: Str = “I am very happy today”
Output:  m vry hppy tdy
Explanation: All vowels are removed from the given String.

*/

import java.util.Scanner;

public class RemoveVowels
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
                ans = ans + ch;
        }

        System.out.print(ans);

    }
}
