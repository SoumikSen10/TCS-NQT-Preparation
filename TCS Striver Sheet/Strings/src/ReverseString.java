/*

Problem Statement: Reverse a String. Write a program that reverses a given string (in-place).

*/

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = reverse(str.toCharArray());

        System.out.print(ans);

    }

    private static String reverse(char[] str)
    {
        int start = 0, end = str.length-1;

        while(start<end)
        {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

        return new String(str);
    }
}
