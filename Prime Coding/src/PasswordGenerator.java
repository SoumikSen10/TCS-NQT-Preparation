/*

Write a program that generates a password adhering to the following conditions :

The password must consist of at least 8 characters.
It must contain at least one integer.
It must contain at least one special character from the set {'#','@'}.
It must contain at least one uppercase letter and one lowercase letter.
Each character in the password should be incremented by the number of times specified by the second input.

Your program should take two inputs:
1. A string representing the initial password.
2. An integer representing the number of times each character should be incremented.

Your program should then generate and output the modified password.

Example 1 :

Input1 : werV432@
Input2 : 2

Output : ygtX654#

*/

import java.util.Scanner;

public class PasswordGenerator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String password = in.next();
        int n = in.nextInt();

        String ans = compute(password,n);
        System.out.print(ans);

    }

    private static String compute(String password,int n)
    {
        StringBuilder ans = new StringBuilder();

        for (char ch : password.toCharArray())
        {
            if (ch >= '0' && ch <= '9')
            {
                // Shift number within 0-9
                int digit = (ch - '0' + n) % 10;
                ans.append((char) ('0' + digit));
            }
            else if (ch >= 'a' && ch <= 'z')
            {
                // Shift lowercase letter within a-z
                char newChar = (char) ('a' + (ch - 'a' + n) % 26);
                ans.append(newChar);
            }
            else if (ch >= 'A' && ch <= 'Z')
            {
                // Shift uppercase letter within A-Z
                char newChar = (char) ('A' + (ch - 'A' + n) % 26);
                ans.append(newChar);
            }
            else if (ch == '@')
            {
                ans.append('#');
            }
            else if (ch == '#')
            {
                ans.append('@');
            }
            else
            {
                // Keep any other characters unchanged
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
