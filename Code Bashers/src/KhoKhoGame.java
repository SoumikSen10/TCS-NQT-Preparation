/*

Alice and friends are playing game kho-kho. Alice is actually a mediator and rest of the friends are seated on N chairs one each.

Alice starts by providing a paper with single digit number to the friend that is present on number1.

Let's denote friends by F, where F will be of size N.

F[1].....F[n] represents friends seated respectively.

After receiving paper with a digit. F[1] will enact and try to tell F[2] without speaking. Similarly F[2] will communicate to next person F[3].

This continues until the last person F[n] understands the digit.

Finally the last person will write the digit on seperate page and give to alice. Alice will compare both the digits. If digits are same then alice will give t-shirt to each friend. However, if the digits do not match she will ask digits from each friend and give t-shirt to that friend who understood the correct digit.

Find how many friends did not understand the correct digit.

Example 1 :

Input 1 : 3
Input 2 : 4,4,4

Output : 0

Example 2 :

Input 1 : 5
Input 2 : 1,3,4,1,2

Output : 3

*/

import java.util.Scanner;

public class KhoKhoGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int ans = compute(arr,n);
        System.out.print(ans);

    }

    private static int compute(int[] arr, int n)
    {
        if(arr[0] == arr[n-1])
            return 0;

        int cnt = 0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[0])
                cnt++;
        }

        return cnt;
    }
}
