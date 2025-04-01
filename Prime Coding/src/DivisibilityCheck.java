/*

The organization has data warehouse, there will be given a three-digit number. Check whether number is divisible by 9 or not.

Input : 236
O/P   : Number 236 is not divisible by 9.

Input : 162
O/P   : Number 162 is divisible by 9.

*/
import java.util.Scanner;

public class DivisibilityCheck
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

       if(n>=100 && n<=999)
        if(n%9 == 0)
            System.out.print("Number "+n+" is divisible by 9.");
        else
            System.out.print("Number "+n+" is not divisible by 9.");

    }
}
