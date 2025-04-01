/*

Task 1 - Print the collatz sequence upto ending with 1 the sequence should be in the following way
-> if the number is even:
F(n) = n//2
-> if the number is odd:
F(n) = 3*n+1
This sequence should end until the last element of sequence is 1

Task 2 - For the given integer from [1,n] it should calculate the sequence of each k value i.e., 1<=k<=n.
Calculate the maximum length of sequence list of each k value and return the maximum length of the sequence list of the k value and the k value itself

Task 3 - For the given integer from [1,n] it should calculate the sequence of each k value i.e, 1<=k<=n.
Calculate the maximum value of each sequence within the sequence list of each k value and return the maximum value of the sequence list of the k value and those k value itself.

Input : 5
Output :
[5,16,8,4,2,1]
8,3
16,3

Input : 0
Output : Error!

Input : xyza
Output : Error!

Input : 13
Output : Error!

Input : 5.5
Output : Error!

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollatzSequence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.next();

        try
        {
            int num = Integer.parseInt(n);  // ✅ Converts full input
            if (num <= 0)
            {
                System.out.print("Error!");
                return;
            }

            List<Integer> sequence = generateSequence(num);
            int[] task2 = max_length_of_sequence_and_k(num);
            int[] task3 = max_sequence_value_and_k(num);

            System.out.println(sequence);
            System.out.println(task2[0]+ " "+task2[1]);
            System.out.print(task3[0]+ " "+task3[1]);

        }
        catch (NumberFormatException e)
        {
            System.out.print("Error!");
        }

    }

    //-> if the number is even:
    //F(n) = n//2
    //-> if the number is odd:
    //F(n) = 3*n+1
    //This sequence should end until the last element of sequence is 1
    private static List<Integer> generateSequence(int n)
    {
        List<Integer> ans = new ArrayList<>();
        ans.add(n);
        while(n!=1)
        {
            if(n%2!=0)
                n = 3*n+1;
            else
                n = n/2;

            ans.add(n);
        }

        return ans;

    }

    //For the given integer from [1,n] it should calculate the sequence of each k value i.e., 1<=k<=n.
    //Calculate the maximum length of sequence list of each k value and return the maximum length of the sequence list of the k value and the k value itself

    private static int[] max_sequence_value_and_k(int n)
    {
        int max_k=0,max_val=0;

        for(int i=1;i<=n;i++)
        {
            List<Integer> sequence = generateSequence(i);
            int max_val_k = max(sequence);
            if(max_val_k > max_val)
            {
                max_val = max_val_k;
                max_k = i;
            }
        }
        return new int[]{max_val,max_k};
    }

    //For the given integer from [1,n] it should calculate the sequence of each k value i.e, 1<=k<=n.
    //Calculate the maximum value of each sequence within the sequence list of each k value and return the maximum value of the sequence list of the k value and those k value itself.

    private static int[] max_length_of_sequence_and_k(int n)
    {
       int maxLen = Integer.MIN_VALUE, kValue = 0;

       for(int i=1;i<=n;i++)
       {
           List<Integer> sequence = generateSequence(i);
           int currLen = sequence.size();
           if(currLen>maxLen)
           {
               maxLen = currLen;
               kValue = i;
           }
       }

       return new int[]{maxLen,kValue};
    }

    private static int max(List<Integer> sequence)
    {
        int maxi = Integer.MIN_VALUE;
        for(int el : sequence)
        {
            maxi = Math.max(maxi,el);
        }

        return maxi;
    }

}
