/*

Problem Statement: Check if the number is a Harshad(or Niven) number or not.

Examples:

Example 1:
Input: 378
Output: Yes it is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

Example 2:
Input: 379
Output: No
 it is not a Harshad number.
Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.

*/

import java.util.Scanner;

public class HarshadNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(checkHarshad(n))
            System.out.print("Yes it is a Harshad number");
        else
            System.out.print("No it is not a Harshad number");
    }

    private static boolean checkHarshad(int n)
    {
        int s = 0,x = n;

        while(n!=0)
        {
            int d = n%10;
            s = s+d;
            n = n/10;
        }

        return x%s == 0;
    }
}
