/*

Problem Statement: Convert a binary number to a decimal number.

Examples:

Example 1:
Input: N = 1011
Output: 11
Explanation: 1011 when converted to decimal number is “11”.

Example 2:
Input: 100
Output: 4
Explanation: 100 when converted to decimal number is “4”.

*/

import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.next();

        double ans = binToDeciOptimal(n);
        //double ans = Integer.parseInt(n,2); //shortcut but only works for integer part not fractional part
        System.out.print(ans);
    }

    private static double binToDeci(String n)
    {
        String[] arr = n.split("\\."); // Fix: Escape dot properly

        String first = arr[0]; // Integer part
        String second = (arr.length > 1) ? arr[1] : ""; // Fractional part (if exists)

        double decimal = 0;
        int power = 0;

        // Convert integer part
        for (int i = first.length() - 1; i >= 0; i--) {
            decimal += (first.charAt(i) - '0') * Math.pow(2, power);
            power++;
        }

        // Convert fractional part
        power = -1;
        for (int i = 0; i < second.length(); i++) {
            decimal += (second.charAt(i) - '0') * Math.pow(2, power);
            power--;
        }

        return decimal;

    }

    private static double binToDeciOptimal(String n)
    {
        boolean isFraction = false;
        double intPart = 0.0;
        int cnt = 0, fracDivisor = 2;
        double fracPart = 0.0;
        double ans = 0.0;

        for (char ch : n.toCharArray()) {
            if (ch == '.') {
                isFraction = true;
                continue;
            }
            if (!isFraction)
                cnt++; // ✅ Count only integer part digits
        }

        // ✅ Corrected integer string extraction
        String intString = (isFraction) ? n.substring(0, cnt) : n; // Ensure '.' is excluded
        String fractString = (isFraction) ? n.substring(cnt + 1) : ""; // Get fractional part (if exists)

        intPart = Integer.parseInt(intString, 2); // ✅ No need for explicit (double) cast

        for (int i = 0; i < fractString.length(); i++) {
            fracPart += (fractString.charAt(i) - '0') / (double) fracDivisor;
            fracDivisor *= 2;
        }

        ans = intPart + fracPart;
        return ans;
    }

}
