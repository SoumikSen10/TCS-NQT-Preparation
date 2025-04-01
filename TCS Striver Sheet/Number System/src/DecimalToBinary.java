/*

Problem Statement: Convert decimal to binary number.

Examples:

Example 1:
Input: N = 15
Output: 1111
Explanation: 15 in binary is represented as "1111".

Example 2:
Input: 18
Output: 10010
Explanation: 18 in binary is represented as "10010".

*/

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        in.close();

        String ans = decimalToBinary(n);
        System.out.print(ans);
    }

    private static String decimalToBinary(double n) {
        StringBuilder ans = new StringBuilder();

        int integerPart = (int) n;
        double fracPart = n % 1;

        // Convert integer part to binary using append (avoids insert(0, …))
        StringBuilder integerBinary = new StringBuilder();
        if (integerPart == 0) {
            integerBinary.append("0");
        } else {
            while (integerPart > 0) {
                integerBinary.append(integerPart % 2);
                integerPart /= 2;
            }
            integerBinary.reverse(); // Reverse after loop instead of inserting at index 0
        }

        ans.append(integerBinary);

        // Convert fractional part to binary
        if (fracPart > 0) {
            ans.append(".");
            int precision = 10; // Limit binary fraction to 10 bits

            while (fracPart > 0 && precision-- > 0)
            {
                fracPart *= 2;
                int bit = (int) fracPart;  // Extract integer part (0 or 1)
                ans.append(bit);
                fracPart -= bit;  // Remove integer part
            }
        }

        return ans.toString();
    }
}
