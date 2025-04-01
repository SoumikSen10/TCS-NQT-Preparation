/*

Problem Statement: Given two strings, write a program to remove characters from the first string which are present in the second string.

Examples:

Example 1:
Input: String str1 = “abcdef”
       String str2 = “cefz”
Output: abd
Explanation: The common characters in both strings are c, e, f.
So after removing these characters from string 1 we get string resulting string as abd.


Example 2:
Input: String str1 = “xyzpw”
       String str2 = “lmno”
Output: xyzpw
Explanation: As there is no common character in both the strings, string 1 remains unchanged.

*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveCharsFrom1In2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        String ans = compute(str1,str2);
        System.out.print(ans);
    }

    private static String compute(String s, String t)
    {
        String ans = "";

        Set<Character> set = new HashSet<>();
        for(char ch : t.toCharArray())
        {
            set.add(ch);
        }

        for(char ch : s.toCharArray())
        {
            if(!set.contains(ch))
                ans = ans + ch;
        }

        return ans;

    }
}
