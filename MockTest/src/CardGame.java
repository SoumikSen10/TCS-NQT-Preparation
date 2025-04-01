/*

You are participating in a unique card game where several cards are arranged in a row. Each card has a certain number of points written on it. Your goal is to collect exactly K cards in such a way that your total score is maximized.

However, there’s a catch! You can only pick cards from either the beginning or the end of the row in each step. Once a card is picked, it is removed, and you continue picking until you have exactly K cards.

Your task is to determine the maximum score you can achieve by strategically picking cards.

Input Format:
The first line contains an integer N, the number of cards.
The second line contains N space-separated integers representing the points on each card.
The third line contains an integer K, the number of cards you must pick.

Output Format:
Print the maximum score that can be achieved by picking exactly K cards optimally.

Example :

Input :
7
1 2 3 4 5 6 1
3

Output :
12

*/

import java.util.Scanner;

public class CardGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int k = in.nextInt();

        int ans = compute(arr,n,k);
        System.out.print(ans);
    }

    private static int compute(int[] arr,int n,int k)
    {
        int leftSum = 0;

        for(int i=0;i<k;i++)
        {
            leftSum = leftSum + arr[i];
        }

        int maxScore = leftSum;
        int rightSum = 0;

        for(int i=0;i<k;i++)
        {
            leftSum = leftSum - arr[k-i-1]; // Remove last element from left sum
            rightSum = rightSum + arr[n-i-1]; // Add last element from right sum

            maxScore = Math.max(maxScore,leftSum+rightSum);
        }

        return maxScore;
    }
}

/*

Initialize leftSum with the sum of the first K elements

This represents the case where we take all K cards from the left.
Gradually swap elements from the left with elements from the right

For each swap, update the sum dynamically.
Track the maximum sum encountered.
Time Complexity:

The first loop runs in O(K), and the second loop also runs in O(K).
Overall Complexity = O(K) → Efficient for large inputs.

7
1 2 3 4 5 6 1
3

Steps:
First K elements sum: 1 + 2 + 3 = 6
Try replacing from right:
Remove 3, add 1 → 1 + 2 + 1 = 4
Remove 2, add 6 → 1 + 6 + 1 = 8
Remove 1, add 5 → 6 + 5 + 1 = 12 (max found)

Output
12

*/