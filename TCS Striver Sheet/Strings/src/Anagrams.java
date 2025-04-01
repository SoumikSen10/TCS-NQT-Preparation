/*

Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

Examples:

Example 1:
Input: CAT, ACT
Output: true
Explanation: Since the count of every letter of both strings are equal.

Example 2:
Input: RULES, LESRT
Output: false
Explanation: Since the count of U and T  is not equal in both strings.

*/

import java.util.Scanner;

public class Anagrams
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        System.out.print(anagramCheck(s1,s2));

    }

    private static boolean anagramCheck(String s1, String s2)
    {
        if(s1.length()!=s2.length())
            return false;

        int[] freq = new int[26];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            freq[ch-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
                return false;
        }

        return true;

    }
}
