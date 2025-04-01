/*

Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.

*/

import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if(palinCheck(s))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
    }

    private static boolean palinCheck(String s)
    {
        int start = 0 ,end = s.length()-1;

        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }
}
