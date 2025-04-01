/*

Remove duplicate from the string array.

Input :
watermelon apple orange banana orange lemon apple

Output :
apple banana lemon orange watermelon
OR
watermelon orange lemon banana apple

*/
import java.util.*;
import java.util.Scanner;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] arr = str.split("\\s+");


        // Use LinkedHashSet to remove duplicates while preserving original order
        Set<String> ans = new LinkedHashSet<>(Arrays.asList(arr));

        // Convert Set to List for sorting
        List<String> res = new ArrayList<>(ans);
        System.out.println(String.join(" ", res));

        Collections.sort(res);
        System.out.println(String.join(" ", res));

        Collections.reverse(res);
        System.out.println(String.join(" ", res));

    }
}
