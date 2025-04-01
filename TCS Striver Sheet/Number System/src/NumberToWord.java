/*

Problem Statement: Given a number, convert it into the form of words.

Note:- Consider maximum no. of digits in the number as 4.

Examples:

Example 1:
Input: 7824
Output: seven thousand eight hundred twenty four
Explanation: 7824 in words can be written as seven thousand eight hundred twenty four.

Example 2:
Input: 370
Output: three hundred seventy
Explanation: 370 in words can be written as three hundred seventy.

*/

import java.util.Scanner;

public class NumberToWord
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(convertToWord(n));
    }

    //process 1
    private static String convertToWord(int n)
    {
        if (n == 0) return "zero";

        String[] singleDigit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoDigits = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensMultiple = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String result = "";

        if (n / 1000 > 0)
        {
            result += singleDigit[n / 1000] + " thousand ";
            n %= 1000;
        }

        if (n / 100 > 0)
        {
            result += singleDigit[n / 100] + " hundred ";
            n %= 100;
        }

        if (n >= 10 && n < 20)
        {
            result += twoDigits[n - 10] + " ";
        }
        else
        {
            if (n / 10 > 1)
            {
                result += tensMultiple[n / 10] + " ";
            }
            if (n % 10 > 0)
            {
                result += singleDigit[n % 10] + " ";
            }
        }

        return result.trim();
    }

    //process 2
//    private static String convertToWord(int n)
//    {
//        if (n == 0) return "zero"; // Handle zero case
//
//        String ans = "";
//
//        String[] singleDigit = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//
//        String[] twoDigits = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
//
//        String[] tensMultiple = {"", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};  // Fixed empty strings
//
//        String[] tensPower = {"hundred","thousand"};
//
//        String str = Integer.toString(n);
//        int len = str.length();
//
//        for(int i = 0; i < str.length(); i++)
//        {
//            if(len > 2) // Handling hundreds and thousands
//            {
//                if(str.charAt(i) - '0' != 0)
//                {
//                    ans += singleDigit[str.charAt(i) - '0'] + " ";
//                    ans += tensPower[len - 3] + " "; // Mapping 'hundred' or 'thousand'
//                }
//                len--;
//            }
//            else // Handling two-digit numbers
//            {
//                if(str.charAt(i) - '0' == 1) // Special case for 10-19
//                {
//                    ans += twoDigits[str.charAt(i + 1) - '0'] + " ";
//                    return ans.trim();
//                }
//                else if(str.charAt(i) - '0' != 0) // Handling 20, 30, ..., 90
//                {
//                    ans += tensMultiple[str.charAt(i) - '0'] + " ";
//                    if (i + 1 < str.length() && str.charAt(i + 1) - '0' != 0) // Fix for cases like 20 (not "twenty zero")
//                        ans += singleDigit[str.charAt(i + 1) - '0'];
//                    return ans.trim();
//                }
//            }
//        }
//
//        return ans.trim();
//    }

}

// Process 1
/*

Final Algorithm (Step-by-Step)
Check for 0:

If n == 0, return "zero".
Extract Thousands Place (1000s):

If n / 1000 > 0, get the corresponding word and append "thousand".
Reduce n = n % 1000.
Extract Hundreds Place (100s):

If n / 100 > 0, get the word and append "hundred".
Reduce n = n % 100.
Handle Special Case (10-19):

If n >= 10 and n < 20, use twoDigits[n - 10].
Extract Tens Place (20-90):

If n / 10 > 1, use tensMultiple[n / 10].
Extract Ones Place (1-9):

If n % 10 > 0, use singleDigit[n % 10].
Trim the final string and return the result.

*/

// Process 2
/*

Case 1:  When a single digit is present

Case 2: When two digits are present

Subcases for 2 digits will be

-> having tens place as 1

-> having tens place as any other number other than 1 and 0

Case 3: When three digits are present

Just add hundred to hundredth place number, the further process will remain same as 2 digit number

Case 4: When 4 digits are present

Just add thousand to thousand place and further process will remain same as 3 digit number.

*/