/*

Problem Statement: Given a character, Find the ASCII value of the character.

Examples:

Example 1:
Input: c = ‘A’
Output: 65
Explanation: ASCII value of A is 65

Example 2:
Input: c = ‘e’
Output: 101
Explanation: ASCII value of e is 101

*/

import java.util.Scanner;

public class CharacterASCII
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

        int ascii = ch ;

        System.out.print(ascii);

    }
}
