/*
 * Optimized Pythagorean Triplets Problem using Factorization
 *
 * Problem Statement:
 * Write a Java program to find all Pythagorean triplets (a, b, c)
 * where a² + b² = c² using an optimized **factorization method**.
 * The program should efficiently check for triplets up to a given number **N**
 * using precomputed squares and HashSet lookup.
 *
 * Constraints:
 * - (a, b, c) should be positive integers.
 * - a ≤ b ≤ c.
 * - c ≤ N (where N is the user-defined limit).
 *
 * Example Output for N = 50:
 * (3, 4, 5)
 * (5, 12, 13)
 * (6, 8, 10)
 * (7, 24, 25)
 * (8, 15, 17)
 * (9, 12, 15)
 * ...
 *
 * Requirements:
 * 1. **Precompute squares** up to N² for faster lookup.
 * 2. **Iterate through hypotenuse (c)** instead of all values.
 * 3. **Use HashSet for quick lookups** to verify valid triplets.
 * 4. **Avoid brute force** (i.e., avoid checking all (a, b, c) combinations).
 */


import java.util.HashSet;

public class PythagoreanTriplets {

    public static void findTripletsWithFactorization(int N) {
        HashSet<Integer> squares = new HashSet<>();

        // Store squares up to N²
        for (int i = 1; i <= N; i++) {
            squares.add(i * i);
        }

        // Iterate through possible c values
        for (int c = 1; c <= N; c++)
        {
            int c2 = c * c;

            // Find factor pairs (x², y²) such that x² + y² = c²
            for (int a = 1; a * a < c2; a++)
            {
                int b2 = c2 - a * a; // Compute b²

                // If b² is a perfect square and exists in precomputed squares
                if (squares.contains(b2)) {
                    int b = (int) Math.sqrt(b2);
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 50;  // Set range
        findTripletsWithFactorization(N);
    }
}
