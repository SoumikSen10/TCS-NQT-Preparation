/*

Problem Statement: Write a program to count the number of words in a given string.

*/

import java.util.Scanner;

public class CountWords
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int ans = count(str);
        System.out.print(ans);
    }

    private static int count(String str)
    {
        int count = 0;
        boolean isWord = false;

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                if(!isWord) // new word starts
                {
                    count++;
                    isWord = true;
                }
            }
            else
            {
                isWord = false; // mark end of word
            }
        }

        return count;
    }
}
