/*

Given a nxn matrix and an integer x, find the position of x in the matrix if it is present. Otherwise , print "Element not found". Every row and column of the matrix is sorted in increasing order. The designed algorithm should bave linear time complexity.

Input 1 : mat[4][4] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}}, x=29

Output 1 : Found at {2,1}

Explanation : Element at {2,1} is 29.

Input 2 : mat[4][4] = {{10,20,30,40},{15,25,35,45},{27,29,37,48}}, x=100

Output 2 : Element not found

Explanation : Element 100 doesnot exist in the matrix
*/

import java.util.Scanner;

public class SearchMatrix
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        int mat[][] = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }

        int x = in.nextInt();

        //optimal approach of searching
        int i = 0, j = c - 1;

        while (i < r && j >= 0)
        {
            if (mat[i][j] == x)
            {
                System.out.println("Found at {" + i + "," + j + "}");
                return;
            }
            else if (mat[i][j] > x)
            {
                j--;  // Move left
            }
            else
            {
                i++;  // Move down
            }
        }

        System.out.println("Element not found");
    }
}
