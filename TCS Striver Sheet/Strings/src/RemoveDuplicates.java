/*

Problem Statement: Given a String remove all the duplicate characters from the given String.

Examples:

Example 1:
Input: s = "bcabc"
Output: “bca"

Explanation: Duplicate Characters are removed
Example 2:
Input: s = "cbacdcbc"
Output: "cbad"
Explanation: Duplicate Characters are removed

*/

import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.print(update(s));

    }

    private static String update(String s)
    {
        String ans = "";

        boolean[] map = new boolean[26];

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map[ch-'a']==false)
            {
                ans = ans + ch;
                map[ch-'a']=true;
            }
        }
        return ans;
    }
}
