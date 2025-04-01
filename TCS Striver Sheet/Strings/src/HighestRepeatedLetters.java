/*

Problem Statement: Write a program to find a word in a given string that has the highest number of repeated letters.
If not found, return -1.

Examples:

Example 1:
Input: string=”abcdefghij google microsoft”
Output: google
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words

Example 2:
Input: string = “cameron blue”
Output: -1
Explanation: No word has more than 1 letter.

*/

import java.util.Scanner;

public class HighestRepeatedLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String ans = findHighestRepeated(str);

         System.out.print(ans);
    }

    private static String findHighestRepeated(String str)
    {
        String maxRepeated = "-1";
        int maxCount=1;

        String words[] = str.split("\\s+");

        for(String word : words)
        {
            int repeatCount = repeatCount(word);
            if(repeatCount>maxCount)
            {
                maxCount = repeatCount;
                maxRepeated = word;
            }
        }
        return maxRepeated;
    }

    private static int repeatCount(String word)
    {
        int[] freq = new int[256]; // Frequency array for ASCII characters
        int maxCount = 1; // Minimum frequency of any letter is 1

        for(char ch : word.toCharArray())
        {
            freq[ch]++;
        }

        for(int count : freq)
        {
            if(count > maxCount)
            {
                maxCount = count;
            }
        }

        return (maxCount > 1) ? maxCount : -1 ; // // Return -1 if no letter repeats
    }
}
