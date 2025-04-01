/*

Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.

Examples:

Example 1:
Input: N = 102003
Output: 112113
Explanation: The 2nd,4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

Example 2:
Input:  204
Output: 214
Explanation: The 2nd position from left contain 0. The resultant integer has replaced the 0 in that position with 1.

*/

import java.util.Scanner;

public class ReplaceZeroesWithOnes
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //int ans = compute(Integer.toString(n));
        int ans = compute(n);
        System.out.print(ans);
    }

    private static int compute(int n) {
        if (n == 0) return 1;  // Edge case: If input is 0, return 1

        int result = 0, place = 1;

        while (n > 0)
        {
            int digit = n % 10;  // Extract last digit

            if (digit == 0)
                digit = 1;  // Replace 0 with 1

            result = result + (digit * place);  // Build new number
            place = place * 10;  // Move to next place value
            n = n/10;  // Remove last digit
        }

        return result;
    }

//    private static int compute(String s)
//    {
//        StringBuilder ans = new StringBuilder();  // ✅ Use StringBuilder for efficiency
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '0')
//                ans.append('1');   // ✅ Faster than string concatenation
//            else
//                ans.append(s.charAt(i));
//        }
//        return Integer.parseInt(ans.toString());
//    }
}
