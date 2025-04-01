/*

Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.

Examples:

Example 1:
Input: string str = "take12% *&u ^$#forward"
Output: takeuforward
Explanation:
Characters 1,2,%,*,&,^,$,# along with whitespaces are
removed but the order of remaining alphabets is preserved.

Example 2:
Input: String str = "1.Python & 2.Java"
Output: PythonJava
Explanation:
Characters 1.&2. along with whitespaces are removed
but the order of remaining alphabets is preserved.

*/

import java.util.Scanner;

public class RemoveCharsExceptAlpha
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = compute(str);

        System.out.print(ans);
    }

    private static String compute(String str)
    {
        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                ans = ans + ch;
        }

        return ans;
    }
}
