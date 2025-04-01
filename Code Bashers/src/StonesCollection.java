/*

Alisha is very fond of collecting stones that contain different metals. She wanted to keep track of all the stones she collected, where each stone consists of different metals. To do this, she created code words for each stone, where every character represents a different metal individually.

Now that she has collected many stones, it has become difficult for her to keep track of the metals present in them. Help Alisha by writing a program that counts how many times each metal (character) from the given metal string appears in the stone string.

Input:
A string stone (representing the stone composition).
A string metal (where each character represents a metal).
Output:
For each character in the metal string, count the number of times it appears in the stone string.

Example 1:

Input:
stone = "abacabad"
metal = "abc"

Output:
a: 4
b: 2
c: 1

Example 2:

Input:
stone = "xyzxyz"
metal = "xz"

Output:
x: 2
z: 2

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StonesCollection
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String stone = in.next();
        String metal = in.next();

        stoneCollect(stone,metal);

    }

    private static void stoneCollect(String stone,String metal)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<stone.length();i++)
        {
            char ch=stone.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<metal.length();i++)
        {
            char ch = metal.charAt(i);
            if(map.containsKey(ch))
                System.out.println(ch+" : "+map.get(ch));
        }

    }

}
