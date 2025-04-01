/*

Problem Statement: Given a string s, reverse the words of the string.

Examples:

Example 1:
Input: s=”this is an amazing program”
Output: “program amazing an is this”

Example 2:
Input: s=”This is decent”
Output: “decent is This”

*/

import java.util.Scanner;

public class ReverseWords
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = reverse(str);
        System.out.print(ans);

    }

    private static String reverse(String str)
    {
        String[] words = str.split("\\s+");
        StringBuilder s = new StringBuilder();

        for(int i = words.length - 1;i>=0;i--)
        {
            s.append(words[i]).append(" ");
        }

        return s.toString().trim();
    }
}
