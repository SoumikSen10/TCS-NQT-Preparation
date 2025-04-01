/*

Problem Statement: Write a  program to change the case (lower to upper and upper to lower cases) of each character of a given string.

Examples:

Example 1:
Input: String str = “javA”
Output: JAVa
Explanation:
 Changed the lower case characters to uppercase and vice versa.

Example 2:
Input: String str = “take u forward IS Awesome”
Output: TAKE U FORWARD is aWESOME
Explanation: Changed the lower case characters to uppercase and vice versa.

*/

import java.util.Scanner;

public class ChangeCases
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = update(str);
        System.out.print(ans);
    }

    private static String update(String str)
    {
        StringBuilder ans = new StringBuilder();

        for(char ch : str.toCharArray())
        {
            if(ch>='a' && ch<='z')
            {
                ch = (char)(ch - 32);
                ans.append(ch);
            }
            else if(ch>='A' && ch<='Z')
            {
                ch = (char)(ch + 32);
                ans.append(ch);
            }
            else
                ans.append(ch);
        }

        return ans.toString();

    }
}
