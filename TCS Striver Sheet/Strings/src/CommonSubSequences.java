/*

Given two string S and T. The task is to count the number of the common subsequence in S and T.

Examples:

Input : S = “ajblqcpdz”, T = “aefcnbtdi”
Output : 11
Common subsequences are : { “a”, “b”, “c”, “d”, “ab”, “bd”, “ad”, “ac”, “cd”, “abd”, “acd” }


Input : S = “a”, T = “ab”
Output : 1



*/

import java.util.*;

public class CommonSubSequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String T = in.next();

        // Generate all possible subsequences using recursion
        HashSet<String> subseqS = new HashSet<>();
        HashSet<String> subseqT = new HashSet<>();

        generateSubsequences(S, 0, "", subseqS);
        generateSubsequences(T, 0, "", subseqT);

        // Find common subsequences
        subseqS.retainAll(subseqT);

        // Print results
        System.out.println("Common Subsequences: " + subseqS);
        System.out.println("Count: " + subseqS.size());

        in.close();
    }

    // Recursive function to generate all subsequences
    private static void generateSubsequences(String str, int index, String current, HashSet<String> subsequences) {
        if (index == str.length())
        {
            if (!current.isEmpty())
            {
                // Exclude empty subsequence
                subsequences.add(current);
            }
            return;
        }

        // Include the current character
        generateSubsequences(str, index + 1, current + str.charAt(index), subsequences);

        // Exclude the current character
        generateSubsequences(str, index + 1, current, subsequences);
    }
}

