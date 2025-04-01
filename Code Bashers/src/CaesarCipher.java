/*

The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.

For example, with a shift of 1, P would be replaced by Q, Q would become R, and so on.

To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.

Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.

As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.

For Example, if a given plain text contains any digit with values 5 and key = 2, then 5 will be replaced by 7.

Input 1 : AdfTu34   key = 1

Output 1 : BegUv45

Input 2: yZ89   key = 2

Output 2: aB01

*/

import java.util.Scanner;

public class CaesarCipher
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int key = in.nextInt();

        String res = encrypt(text,key);
        System.out.println(res);
    }

    private static String encrypt(String text, int key)
    {
        String ans = "";
        for(int i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);
            if(ch>='A' && ch<='Z')
              ans+=(char)('A'+(ch-'A'+key)%26);
            else if(ch>='a' && ch<='z')
                ans+=(char)('a'+(ch-'a'+key)%26);
            else if(ch>='0' && ch<='9')
                ans+=(char)('0'+(ch-'0'+key)%10);
            else
                ans+=ch;
        }
        return ans.toString();
    }

}
