/*

Problem Statement:

Remove brackets from an algebraic expression

Write a program to remove brackets from an algebraic expression

Given an algebraic expression, we need to simplify the expression and remove the brackets.

Examples:

Example 1:
Input: “a+((b-c)+d)”
Output: “a+b-c+d”
Explanation: Removed all the brackets in the algebric expression.

Example 2:
Input: “(((a-b))+c)”
Output: “a-b+c”
Explanation: Removed all the brackets in the algebric expression.

*/

import java.util.Scanner;

public class RemoveBrackets
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();

        String ans = operate(exp);
        System.out.print(ans);

    }

    private static String operate(String str)
    {
        String ans = "";
        int n = str.length();

        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);

            if(ch!='(' && ch!=')')
                ans = ans + ch;
        }

        return ans;
    }
}
