/*

There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

Example 1:

Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

*/

import java.util.Arrays;
import java.util.Scanner;

public class UniquePaths
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int ans = findPaths(m,n);
        System.out.print(ans);
    }

    private static int findPaths(int m, int n)
    {
        int[] dp = new int[n]; // 1D array for the previous row
        Arrays.fill(dp,1); // first row is always 1

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[j] = dp[j] + dp[j-1]; //updating current cell
            }
        }

        return dp[n-1]; //returning last cell value containing ans

    }

}
