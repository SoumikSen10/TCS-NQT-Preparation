/*

Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

Examples:

Example 1:
Input: string str=”Take u forward is Awesome”
Output:
Vowels: 10
Consonants: 11
White spaces: 4


Example 2:
Input: string str=”India won the cricket match”
Output:
Vowels: 8
Consonants: 15
White spaces: 4

*/

import java.util.Scanner;

public class CountVowelConsonant
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        compute(str);
    }

    private static void compute(String str)
    {
        str = str.toLowerCase();

        int vowels = 0, consonants = 0, spaces = 0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if(ch == ' ')
                spaces++;
            else if(ch >= 'a' && ch <= 'z')
                consonants++;
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.print("White spaces : " + spaces);
    }
}
