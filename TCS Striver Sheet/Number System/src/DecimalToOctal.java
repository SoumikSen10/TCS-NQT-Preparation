/*

Problem Statement: Given a decimal number, convert it into Octal Number.

Examples:

Example 1:
Input:  17
Output: 21
Explanation: Octal Equivalent of 17 is 21

Example 2:
Input:  45
Output: 55
Explanation: Octal Equivalent of 45 is 55

*/


import java.util.Scanner;

    public class DecimalToOctal
    {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        in.close();

        String ans = decimalToOctal(n);
        System.out.print(ans);
    }

    private static String decimalToOctal(double n) {
        StringBuilder ans = new StringBuilder();

        int integerPart = (int) n;
        double fracPart = n % 1;

        // Convert integer part to octal using append (avoids insert(0, …))
        StringBuilder integerOctal = new StringBuilder();
        if (integerPart == 0)
        {
            integerOctal.append("0");
        }
        else
           {
            while (integerPart > 0)
            {
                integerOctal.append(integerPart % 8);
                integerPart /= 8;
            }
            integerOctal.reverse(); // Reverse after loop instead of inserting at index 0
        }

        ans.append(integerOctal);

        // Convert fractional part to octal
        if (fracPart > 0) {
            ans.append(".");
            int precision = 10; // Limit octal fraction to 10 bits

            while (fracPart > 0 && precision-- > 0)
            {
                fracPart *= 8;
                int bit = (int) fracPart;  // Extract integer part (0-7)
                ans.append(bit);
                fracPart -= bit;  // Remove integer part
            }
        }

        return ans.toString();
    }
}

