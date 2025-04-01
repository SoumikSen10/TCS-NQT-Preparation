/*

Problem Statement: Check if the given year is a leap year or not.

Examples:

Example 1:
Input: 1996
Output: Yes
Explanation: Since 1996 is a leap year answer is “Yes”.

Example 2:
Input: 2000
Output: Yes

Explanation: Since 2000 is a leap year answer is “Yes”.

*/

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yr = in.nextInt();

        boolean res = checkLeapYear(yr);

        if(res)
         System.out.print("Yes");
        else
            System.out.print("No");
    }
    private static boolean checkLeapYear(int yr)
    {
        if(yr%400==0)
            return true;
        else if(yr%4==0 && yr%100!=0)
            return true;
        return false;
    }
}
