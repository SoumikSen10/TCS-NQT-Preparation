/*

Problem Statement: Concatenate one string to another. Write a program to concatenate one string's contents to another. Concatenation means to join two (or more) strings and form a combined string having the characters of both ( or all) strings in the same order as they were before in separate strings.

*/

import java.util.Scanner;

public class ConcatenateTwoStrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        System.out.print(str1+str2);
    }

}
