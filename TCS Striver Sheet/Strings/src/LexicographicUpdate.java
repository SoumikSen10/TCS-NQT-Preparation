/*

Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (i.e. a becomes b, p becomes q, z becomes a)

Examples:

Example 1:
Input: string str = “abcdxyz”
Output: bcdeyza

Example 2:
Input: string str = “Java”
Output: Kbwb

*/

import java.util.Scanner;

public class LexicographicUpdate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String ans = lexicography(str);
        System.out.print(ans);
    }

    private static String lexicography(String str)
    {
        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray())
        {
            if (Character.isLowerCase(ch))
            {
                // Lowercase letters
                ans.append((char) ('a' + (ch - 'a' + 1) % 26));
            }
            else if (Character.isUpperCase(ch))
            {
                // Uppercase letters
                ans.append((char) ('A' + (ch - 'A' + 1) % 26));
            }
            else
            {
                // Non-alphabetic characters remain unchanged
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
