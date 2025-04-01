/*

Given two strings where first string may contain wild card characters and second string is a normal string. Write a function that returns true if the two strings match. The following are allowed wild card characters in first string.

* --> Matches with 0 or more instances of any character or set of characters.
? --> Matches with any one character.

For example, “g*ks” matches with “geeks” match. And string “ge?ks*” matches with “geeksforgeeks” (note ‘*’ at the end of first string). But “g*k” doesn’t match with “gee” as character ‘k’ is not present in second string.

*/

import java.util.Scanner;

public class WildcardStrMatch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        boolean ans = matchWildCard(s,t);
        System.out.print(ans);
    }

    private static boolean matchWildCard(String s, String t)
    {
        int m = s.length();
        int n = t.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        // Handle wildcard '*' matches with empty string
        for (int i = 1; i <= m; i++) {
            if (s.charAt(i - 1) == '*' && dp[i - 1][0]) {
                dp[i][0] = true;
            }
        }

        // Build DP table
        for (int i = 1; i <= m; i++) {
            for (int j=1; j <= n; j++) {
                if (s.charAt(i-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                } else if (s.charAt(i-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = dp[i-1][j-1] && (s.charAt(i-1) == t.charAt(j-1));
                }
            }
        }
        return dp[m][n];
    }
}

/*

Approach Explanation for Wildcard Pattern Matching
Problem Understanding
Given two strings s (with wildcards * and ?) and t (normal string), determine if s matches t:

* matches 0 or more of any character(s).

? matches exactly one character.

Examples:

s = "g*ks", t = "geeks" → True (* matches "ee").

s = "ge?ks*", t = "geeksforgeeks" → True (? matches "e", * matches "forgeeks").

s = "g*k", t = "gee" → False (no "k" in t).

Dynamic Programming (DP) Approach
We use a DP table dp[i][j] to track if the first i characters of s match the first j characters of t.

Key Steps:
Initialize the DP Table:

dp[0][0] = true: Empty strings match.

For s with leading *, set dp[i][0] = true if all preceding characters in s are *.

Fill the DP Table:
For each i (char in s) and j (char in t):

Case 1: s[i-1] == '*':

Match 0 characters: Use dp[i-1][j] (ignore *).

Match 1+ characters: Use dp[i][j-1] (extend *).

dp[i][j] = dp[i-1][j] || dp[i][j-1].

Case 2: s[i-1] == '?':

Match exactly one character: dp[i][j] = dp[i-1][j-1].

Case 3: Normal character:

Check equality and previous state: dp[i][j] = (s[i-1] == t[j-1]) && dp[i-1][j-1].

Example Walkthrough
Example: s = "g*ks", t = "geeks"
We build a 5x6 DP table (indices 0 to 4 for s, 0 to 5 for t).

Base Case:

dp[0][0] = true (empty strings match).

First Row (t is empty):

Only dp[0][0] is true; others are false since s isn’t all *.

Fill the Table:

Row 1 (s[0] = 'g'):

dp[1][1] = (g == g) && dp[0][0] → true.

Row 2 (s[1] = '*'):

For each j, propagate true values by allowing * to match 0 or more characters.

Row 3 (s[2] = 'k'):

Only j=4 (after matching "ee" via *) checks k == k.

Row 4 (s[3] = 's'):

j=5 (last character) checks s == s.

Final result: dp[4][5] = true.

Complexity Analysis
Time Complexity: O(m·n)
Filling an (m+1) x (n+1) DP table, where m and n are lengths of s and t.

Space Complexity: O(m·n)
Can be optimized to O(n) using a 1D array (see optimizations below).

Edge Cases
s is all *: Matches any t.

t is empty: Only matches if s is also empty or all *.

Leading/Trailing *: Handled by propagating matches in DP.

? in s with shorter t: Automatically fails (e.g., s = "a?b", t = "ac").

*/