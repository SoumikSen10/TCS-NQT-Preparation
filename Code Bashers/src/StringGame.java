/*

Jack and Jill are playing a string game. Jack has given gill 2 strings A & B.

Jill has to derive string C from A, by deleting elements from string A, such that string C does not contain any elements of string B.

Jill needs help to do this task, she wants you to write a program.

Given string A and B as input derive string C.

Examples :

Input 1 :
Tiger
Ti

Output :
ger

Input 2 :
processed
esd

Output :
proc

*/

import java.util.*;

public class StringGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();

        String C = compute(A,B);
        System.out.print(C);
    }

    private static String compute(String A, String B)
    {
        Set<Character> characters = new HashSet<>();

        for(char ch : B.toCharArray())
        {
            characters.add(ch);
        }

        StringBuilder C = new StringBuilder();

        for(char ch : A.toCharArray())
        {
            if(!characters.contains(ch))
                C.append(ch);
        }

        return C.toString();
    }
}
