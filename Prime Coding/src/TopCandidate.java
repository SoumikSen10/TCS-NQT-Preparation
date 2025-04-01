/*

Top candidate need to be printed from the given input.

Input :
3 4 90 John 85 Bob 92 Alice 110 Aditya

Explanation: k = 3, n = 4 (k top students needed and n is number of students given input)

Output :
Aditya : 110
Alice : 100
John : 90

*/

import java.util.*;

public class TopCandidate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String words[] = str.split("\\s+");

        Map<String,Integer> data = new HashMap();

        int limit = Integer.parseInt(words[0]);
        int n = Integer.parseInt(words[1]);

        for(int i=2;i< words.length;i+=2)
        {
            int marks = Integer.parseInt(words[i]);  // First, parse marks
            String name = words[i + 1];              // Then, take the name
            data.put(name, marks);
        }

        // Sort by values (marks) in descending order
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(data.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        int cnt=0;
        for(Map.Entry<String, Integer> entry : sortedList)
        {
            if(cnt == limit)
                break;
            System.out.println(entry.getKey()+" : "+entry.getValue());
            cnt++;
        }

    }

}
