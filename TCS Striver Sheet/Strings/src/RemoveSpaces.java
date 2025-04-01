/*

Problem Statement: Given a string, write a program to remove all the whitespaces from the string.

Examples:

Example 1:
Input: str = “Take you forward”
Output: Takeyouforward
Explanation: After removing all the whitespaces Takeyouforward is the result

Example 2:
Input: str = “How are you doing”
Output: Howareyoudoing
Explanation: After removing all the whitespaces Howareyoudoing is the result

*/

import java.util.Scanner;

public class RemoveSpaces
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = removeSpaces(str);

        System.out.print(ans);
    }

    private static String removeSpaces(String str)
    {
        str = str.trim();
        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch!=' ')
                ans = ans + ch;
        }

        return ans;
    }
}
