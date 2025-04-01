/*

Problem Statement: Given an Octal Number, convert it into Binary Number.

Examples:

Example 1:
Input: 345
Output: 011100101
Explanation: Binary equivalent of given Octal expressionis 011100101

Example 2:
Input: 170
Output: 001111000
Explanation: Binary equivalent of given Octal expression is 001111000

*/

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = in.next();
        in.close();

        String binary = octalToBinary(octal);
        System.out.println("Binary equivalent: " + binary);
    }

    private static String octalToBinary(String octal) {
        StringBuilder binary = new StringBuilder();

        String[] parts = octal.split("\\.");
        String integerPart = parts[0];
        String fracPart = (parts.length > 1) ? parts[1] : "";

        // Convert integer part
        for (char digit : integerPart.toCharArray()) {
            binary.append(octalToBinaryDigit(digit));
        }

        // Remove leading zeros from integer part
        while (binary.length() > 1 && binary.charAt(0) == '0') {
            binary.deleteCharAt(0);
        }

        // Convert fractional part
        if (!fracPart.isEmpty()) {
            binary.append(".");
            for (char digit : fracPart.toCharArray()) {
                binary.append(octalToBinaryDigit(digit));
            }
        }

        return binary.toString();
    }

    private static String octalToBinaryDigit(char octalDigit) {
        int octalVal = octalDigit - '0'; // Convert char to integer (efficient way)
        return String.format("%03d", Integer.parseInt(Integer.toBinaryString(octalVal)));
    }
}


