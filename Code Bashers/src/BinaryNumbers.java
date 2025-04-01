/*

Given two binary numbers (in 0 and 1) in the form of string. Find out whether there is a possibility whether these numbers can become equal by rearranging their respective 0s and 1s.

For ex : 101 and 011 can be arranged within themselves to become either 101 or 011.

Example 1 :
3 --> length of input string
101 --> input string 1
011 --> input string 2

Output 1:
Yes

*/

import java.util.Scanner;

public class BinaryNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String n1 = in.next();
        String n2 = in.next();

        if(check(n1,n2,n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    private static boolean check(String s1,String s2, int n)
    {
        if(s1.length()!=n || s2.length()!=n)
            return false;

        int cnt0=0,cnt1=0;

        for(char ch : s1.toCharArray())
        {
            if(ch=='0')
                cnt0++;
            else if(ch=='1')
                cnt1++;
        }

        for(char ch : s2.toCharArray())
        {
            if(ch=='0')
                cnt0--;
            else if(ch=='1')
                cnt1--;
        }

        return (cnt0==0 && cnt1==0) ;
    }

}
