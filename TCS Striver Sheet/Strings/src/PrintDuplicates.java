/*

Problem Statement: Given a string of characters from a to z. Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.

Examples:

Example 1:
Input:
 str= "sinstriiintng"
Output:
i - 4
n - 3
s - 2
t - 2
Explanation:
In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice. 'r' and 'g' occur only one time and hence are not considered.

Example 2:
Input:
 str= "abcdefg"
Output:
< -- No Output -- >
Explanation:

In the above example, every character occurs only once(no duplicates), therefore nothing to print.

*/

import java.util.Scanner;

public class PrintDuplicates
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printDuplicates(str);
    }

    private static void printDuplicates(String str)
    {
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i]>1)
                System.out.println((char)(i+'a') + " - " + freq[i]);
        }

    }
}
