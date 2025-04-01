/*

Example 1:
Input: 3/4 + 1/7
Output: 25/28
Explanation: Since 3/4 + 1/7 = 25/28

Example 2:
Input: 5/2 +1/2
Output: 3/1
Explanation: Since 5/2 + 1/2 = 3/1

*/

import java.util.Scanner;

public class AddTwoFractions
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int den1 = in.nextInt();
        int num2 = in.nextInt();
        int den2 = in.nextInt();
        int num3,den3;

        int lcm = find_lcm(den1,den2);

        den3 = lcm;

        num3 = num1 * (den3/den1) + num2 * (den3/den2);

        int[] result = simplify(num3,den3);
        num3 = result[0];
        den3 = result[1];

        System.out.print(num3+"/"+den3);

    }

    private static int[] simplify(int num3, int den3)
    {
        int gcd = find_gcd(num3,den3);
        return new int[]{ num3 / gcd, den3 / gcd };
    }

    private static int find_lcm(int a, int b)
    {
        return (a * b)/find_gcd(a,b);
    }

    private static int find_gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return find_gcd(b,a%b);
    }
}
