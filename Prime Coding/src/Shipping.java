/*

You are tasked with writing a program to calculate the total shipping cost based on the weight of the package and the distance it needs to travel. The shipping cost is determined by the following criteria:

1. Base money : $5.00
2. Cost per kilogram : $2.00
3. Cost per 10 kilometers : $0.5

Example 1 :

Input :
10(w)
100(D)

Output :
$30.00

*/

import java.util.Scanner;

public class Shipping
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        int distance = in.nextInt();

        double ans = compute(weight,distance);
        System.out.printf("%.2f",ans);
    }

    private static double compute(int weight, int distance)
    {
        double ans = 0.0;

        ans = 5 + (weight * 2.0) + (distance/10.0)*0.5;

        return ans;
    }
}
