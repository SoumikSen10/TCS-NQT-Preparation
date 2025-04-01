/*

Problem Statement: Given a string, calculate the frequency of characters in a string.

Examples:

Example 1:
Input: takeuforward
Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1
Explanation: Count of every character of string is printed.

Example 2:
Input: articles
Output: a1 c1 e1 i1 l1 r1 s1 t1
Explanation: Count of every character of string is printed.

*/

import java.util.Scanner;

public class FrequencyCharacters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        printFreq(str);
    }

    private static void printFreq(String str)
    {
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                System.out.print((char)(i+'a'));
                System.out.print(freq[i] + " ");
            }
        }
    }
}
