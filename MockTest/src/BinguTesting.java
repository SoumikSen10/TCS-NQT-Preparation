/*

Bingu was testing all the strings he had at his place and found that most of them were prone to a vicious attack by Banju, his arch-enemy. Bingu decided to encrypt all the strings he had by the following method:

Every substring of identical letters is replaced by a single instance of that letter followed by the number of occurrences of that letter.
The resulting string is then further encrypted by reversing it.


Example:

Input:
s = "aabc"

Output:
1c1b2a

Explanation:
Step 1: "aabc" → "a2b1c1"
Step 2: Reverse the obtained string : "a2b1c1" → "1c1b2a"


*/

import java.util.*;

public class BinguTesting
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String ans = compute(s);
        System.out.print(ans);
    }

    private static String compute(String s)
    {
        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for(int i=1;i<=s.length();i++)
        {
            if(i==s.length() || s.charAt(i)!=s.charAt(i-1))
            {
                encoded.append(s.charAt(i-1)).append(count);
                count = 1; //Reseting count
            }
            else
            {
                count++;
            }
        }

        return encoded.reverse().toString();

    }
}
