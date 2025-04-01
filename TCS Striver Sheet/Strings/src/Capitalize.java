/*

Problem Statement: Given a string, write a program to Capitalize the first and last character of each word of that string.

Examples:

Example 1:
Input: String str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: We get the result after capitalizing the first and last character of each word of a string

Example 2:
Input: String str = "Take u Forward is Awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: Characters T, F, A, are initially in uppercase , so they remain as they are in the result.

*/

import java.util.Scanner;

public class Capitalize
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = capitalizeChars(str);
        System.out.print(ans);
    }

    private static String capitalizeChars(String str)
    {
        str = " " + str + " ";
        StringBuilder ans = new StringBuilder();

        for(int i=1;i<str.length()-1;i++)
        {
            if(str.charAt(i-1)==' ' || str.charAt(i+1)==' ')
                ans = ans.append(Character.toUpperCase(str.charAt(i)));
            else
                ans = ans.append(str.charAt(i));
        }

        String res = ans.toString();
        return res.trim();
    }
}
