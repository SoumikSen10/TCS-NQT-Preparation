/*

Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike, he took precisely n steps. For every step he took, he noted if it was an uphill U, or a downhill D, step Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude. We define the following terms :

. A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step-down to sea level.

. A valley is a sequence of consecutive steps below sea level, starting with a step-down from sea level and ending with a step-up to sea level.


Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

For example,

If Gary's path is s = [DDUUUUDD] he first enters a valley 2 units deep. Then he climbs out and up onto a mountain 2 units high. Finally, he returns to sea level and ends his hike.

Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.

countingValleys has the following parameter(s):

. n : the number of steps Gary takes
. s : a string describing his path

Examples

Input Values :

n = 8
s = DDUUUUDD

Output Values : 1

*/

import java.util.Scanner;

public class AvidHiker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int x = countValleys(n,s);
        System.out.println(x);

    }

    private static int countValleys(int n, String s)
    {
        int res=0,count=0;
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(res == 0 && ch == 'D') //checking valley condition
                count++;
            if(ch == 'D')
                res = res - 1;
            else if(ch == 'U')
                res = res + 1;
        }

        return count;
    }

}
