/*

Problem Statement: Given an Octal Number, convert it into a Decimal Number.

Examples:

Example 1:
Input: 345
Output: 229
Explanation: Decimal equivalent of given Octal expression is 229

Example 2:
Input: 170
Output: 121
Explanation: Decimal equivalent of given Octal expression is 121

*/

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        in.close();

        double ans = octalToDeciOptimal(n);
        // double ans = octalToDeci(n); // Alternative method
        System.out.println(ans);
    }

    // ✅ Basic method for octal to decimal conversion
    private static double octalToDeci(String n) {
        String[] arr = n.split("\\."); // Split integer and fractional parts

        String first = arr[0]; // Integer part
        String second = (arr.length > 1) ? arr[1] : ""; // Fractional part

        double decimal = 0;
        int power = 0;

        // Convert integer part
        for (int i = first.length() - 1; i >= 0; i--) {
            decimal += (first.charAt(i) - '0') * Math.pow(8, power);
            power++;
        }

        // Convert fractional part
        power = -1;
        for (int i = 0; i < second.length(); i++) {
            decimal += (second.charAt(i) - '0') * Math.pow(8, power);
            power--;
        }

        return decimal;
    }

    // ✅ Optimized version
    private static double octalToDeciOptimal(String n) {
        boolean isFraction = false;
        int cnt = 0, fracDivisor = 8;
        double intPart = 0.0, fracPart = 0.0;

        for (char ch : n.toCharArray()) {
            if (ch == '.') {
                isFraction = true;
                continue;
            }
            if (!isFraction) cnt++; // Count only integer part digits
        }

        // ✅ Extract integer and fractional parts correctly
        String intString = (isFraction) ? n.substring(0, cnt) : n;
        String fractString = (isFraction) ? n.substring(cnt + 1) : "";

        // ✅ Convert integer part
        intPart = Integer.parseInt(intString, 8);

        // ✅ Convert fractional part
        for (int i = 0; i < fractString.length(); i++) {
            fracPart += (fractString.charAt(i) - '0') / (double) fracDivisor;
            fracDivisor *= 8;
        }

        return intPart + fracPart;
    }
}

