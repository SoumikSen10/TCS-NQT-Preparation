/*

Given an integer n, return true if it is an armstrong number otherwise return false.

Input :
[153,371,108]

Output :
[153, 371]

*/

import java.util.*;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        List<Integer> list = new ArrayList<>();

        String s = str.replace("[", "").replace("]", "");

        String[] elements = s.split(",");

        for(String el : elements)
        {
            el = el.trim();
            int n = Integer.parseInt(el);
            if(armstrong(n,el.length()))
                list.add(n);
        }

        if(!list.isEmpty())
            System.out.print(list);
        else
            System.out.print("No armstrong numbers present");

    }

    private static boolean armstrong(int n,int cnt)
    {
        int s=0,x=n;
        while(n!=0)
        {
            int d = n%10;
            s = s + (int)Math.pow(d,cnt);
            n = n/10;
        }

        return s==x;
    }
}
