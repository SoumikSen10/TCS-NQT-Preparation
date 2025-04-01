/*

Problem Statement:  Write a program to sort characters (numbers and punctuation symbols are not included) in a given string.

Examples:

Example 1:
Input: String str = “zxcbg”
Output: bcgxz
Explanation: After sorting we get string as bcgxz

Example 2:
Input: String str = “edcba”
Output: abcde
Explanation: After sorting we get string as abcde

*/

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String ans = sort(str);
        System.out.print(ans);
    }

    private static String sort(String str)
    {
        char characters[] = str.toCharArray();

        Arrays.sort(characters);

        String ans = new String(characters);

        return ans;
    }
}
