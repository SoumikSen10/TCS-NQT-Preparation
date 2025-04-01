/*

Problem Statement: Convert a binary number to an octal number

Examples:

Example 1:.
Input: N = 1100110
Output: 146
Explanation: 1100110 when converted to octal number is “146”.

Example 2:
Input: 11111
Output: 37
Explanation: 11111 when converted to octal number is “37”.

*/

import java.util.Scanner;

public class BinaryToOctal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String binary = in.next();

        String octal = binaryToOctal(binary);
        System.out.print(octal);
    }

    private static String binaryToOctal(String binary)
    {
        String[] arr = binary.split("\\.");

        String intPart = arr[0];
        String fracPart = (arr.length>1) ? arr[1] : "";

        String x = convertIntOctal(intPart);
        String y = convertFracOctal(fracPart);

        return fracPart.isEmpty() ? x : x + "." + y;
        // Keep decimal point only if fraction exists

    }

    private static String convertIntOctal(String num)
    {
        int n = num.length();

        // Pad left with zeros to make length a multiple of 3
        while(n%3!=0)
        {
            num = "0" + num;
            n++;  // ✅ Update length after padding
        }

        StringBuilder octal = new StringBuilder();

        for(int i=0;i<num.length();i+=3)
        {
            String triplet = num.substring(i,i+3);
            octal.append(binaryToOctalHelper(triplet));
        }

        return octal.toString();

    }

    private static String convertFracOctal(String num)
    {
        if (num.isEmpty())
            return "";

        int n = num.length();

        // Pad left with zeros to make length a multiple of 3
        while(n%3!=0)
        {
            num =  num + "0";
            n++;
        }

        StringBuilder octal = new StringBuilder();

        for(int i=0;i<num.length();i+=3)
        {
            String triplet = num.substring(i,i+3);
            octal.append(binaryToOctalHelper(triplet));
        }

        return octal.toString();
    }

    private static char binaryToOctalHelper(String triplet)
    {
        int decimalValue = Integer.parseInt(triplet,2);
        return (char)('0'+decimalValue);
    }

}
