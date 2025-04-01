/*

Given a maximum of four digit to the base 17 (10-A,11-B,12-C,13-D,14-E,15-F,16-G) as input, output its decimal value.

Case 1

Input - 1A
Expected Output - 27

Case 2

Input - 23GF
Expected Output - 10980

Logic :

'2' -> 2 x 17^3 = 2 x 4913 = 9826
'3' -> 3 x 17^2 = 3 x 289 = 867
'G' -> 16 x 17^1 = 16 x 17 = 272
'F' -> 15 x 17^0 = 15

Total = 9826 + 867 + 272 + 15 = 10980

*/


import java.util.Scanner;

public class SweetSeventeen
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int power = 0, decimal = 0;

        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            int digit = 0;

            if(ch>='0' && ch<='9')
            {
                digit = ch-'0';
            }

            else
            {
                digit = ch-'A'+10;
            }

            decimal = decimal + digit * (int)Math.pow(17,power);

            power++;

        }

        System.out.println(decimal);

    }
}
