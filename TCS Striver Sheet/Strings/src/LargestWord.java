/*

Problem: Given a String, find the largest word in the string.

Examples:

Example 1:
Input: string s=”Google Doc”
Output: “Google”

Explanation: Google is the largest word in the given string.

Example 2:
Input: string s=”Microsoft Teams”
Output: “Microsoft”
Explanation: Microsoft is the largest word in the given string

*/

import java.util.Scanner;

public class LargestWord
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = findMax(str);
        System.out.print(ans);
    }

    private static String findMax(String str)
    {
        String words[] = str.split("\\s+"); // \\s+ matches one or more spaces (handles multiple spaces correctly).
        int maxi=Integer.MIN_VALUE;
        String maxWord="";

        for(String word : words)
        {
            if(word.length()>maxi)
            {
                maxi = word.length();
                maxWord = word;
            }
        }

        return maxWord;
    }
}
