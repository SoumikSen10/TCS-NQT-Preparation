/*

Find the minimum number of coins required to form any value between 1 to N, both inclusive. Cumulative value of coins should not exceed N. Coin denominations are 1 Rupee, 2 Rupee and 5 Rupee. Let's understand the problem using the following example.

Consider the value of N is 13, then the minimum number of coins required to formulate any value between 1 and 13, is 6. One 5 rupee, three 2 rupee and two 1 rupee coins are required to realize any value between 1 and 13. Hence this is the answer.

However, if one takes two 5 rupee coins, one 2 rupee coin and two 1 rupee coin, then too all values between 1 and 13 are achieved. But since the cumulative value of all coins equals 14, i.e. exceeds 13, this is not the answer.

Input Format:
A single integer value.

Output Format:
Four space seperated integer values.
1st - Total number of coins
2nd - number of 5 rupee coins
3rd - number of 2 rupee coins
4th - number of 1 rupee coins

Constraints
0 < n < 100

Refer the sample output for formatting

Sample Input :
13

Sample Output :
6 1 3 2

*/


import java.util.Scanner;

public class CoinDistribution
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int fives = 0, twos = 0, ones = 0, count = 0;

         fives = (n-4)/5; //no. of five rupee coins

         if(((n-5*fives)%2)==0)
             ones = 2;
         else
             ones = 1;

         twos = (n-5*fives-ones)/2;

         count = fives + twos + ones;
        System.out.println(count + " " + fives + " " + twos + " " + ones);

    }
}
