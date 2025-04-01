/*

Given a maximum of 100-digit numbers as input, find the difference between the sum of odd and even position digits

Case 1

Input - 4567
Expected output - 2

Case 2

Input - 5476
Expected output - 2

Case 3

Input - 9834698765123
Expected output - 1

*/

import java.util.Scanner;

public class OddlyEven
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.next();

        String str = n;
        int even = 0, odd = 0;

        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
              even = even + str.charAt(i)-'0';
            else
              odd = odd + str.charAt(i)-'0';
        }

        System.out.println(Math.abs(even - odd));
    }
}
