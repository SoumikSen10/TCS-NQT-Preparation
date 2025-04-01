/*

Distinct Pathways

Distinct Pathways You are presented with a square grid of size N x N, where each cell is either obstructed (0) or accessible (1). A rat begins its journey from the top-left cell of the grid (0, 0) and aims to reach the bottom-right cell (N-1, N-1). The rat has the ability to move in four directions: upwards (U), downwards (D), leftwards (L), and rightwards ®. Your task is to write a program that identifies all the unique paths from the starting cell to the destination cell that the rat can traverse. The rat should only travel through accessible cells and should not revisit any cell.

Input Format: • The first line contains an integer, N, indicating the dimensions of the grid. • The following N lines each contain N integers, describing the rows of the grid where 1 signifies an accessible cell and 0 denotes an obstructed cell.

Output Format: • Print all the unique paths from the top-left to the bottom-right cell of the grid. Each path should be represented as a string of characters (U, D, L, R). Each path should be separated by a space.

Example 1

Input:
4

1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1

Output:
DRDDRR

Example 2 (Multiple Paths)
Input:
4

1 0 0 0
1 1 1 1
0 1 0 1
1 1 1 1

Output:
DRDDRR DRRRDD



*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int mat[][] = new int[N][N];

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j] = in.nextInt();
            }
        }

        List<String> paths = findPath(mat,N);

        if (paths.isEmpty())
        {
            System.out.println("-1"); // No path available
        }
        else
        {
            for (String path : paths)
            {
                System.out.print(path + " ");
            }
        }
    }

    private static List<String> findPath(int[][] mat, int n)
    {
        List<String> paths = new ArrayList<>();

        // If start or end is blocked, return empty list
        if (mat[0][0] == 0 || mat[n-1][n-1] == 0) {
            return paths;
        }

        backtrack(0,0,"",mat,n,paths);
        return paths;
    }

    private static void backtrack(int x,int y,String path, int[][]mat, int n,List<String> paths)
    {
        if(x==n-1 && y==n-1)
        {
            paths.add(path);
            return;
        }

        // If out of bounds or blocked, return
        if(x<0 || x>=n || y<0 || y>=n || mat[x][y]==0)
            return;

        mat[x][y] = 0; //marking as visited

        if (x + 1 < n && mat[x + 1][y] == 1)
            backtrack(x+1,y,path+"D",mat,n,paths);

        if (x - 1 >= 0 && mat[x - 1][y] == 1)
            backtrack(x-1,y,path+"U",mat,n,paths);

        if (y + 1 < n && mat[x][y + 1] == 1)
            backtrack(x,y+1,path+"R",mat,n,paths);

        if (y - 1 >= 0 && mat[x][y - 1] == 1)
            backtrack(x,y-1,path+"L",mat,n,paths);

        mat[x][y] = 1; // Reset cell for other paths
    }
}
