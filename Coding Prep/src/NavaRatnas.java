import java.util.Scanner;

/*

Our hoary culture had several great persons since time immemorial and king vikramaditya's nava ratnas(nine gems) belongs to this ilk.

Among these, Varahamihira was an astrologer of emninence and his book Brihat Jataak is recokened as the ultimate authority in astrology.

He was once talking with Amarasimha, another gem among the nava ratnas and the author of Sanskrit thesaurus, Amarakosha.

Amarasimha wanted to know the final position of a person, who starts from the origin 0,0 and travels per following scheme.

- He first turns and travels 10 units of distance
- His second turn is upward for 20 units
- Third turn is to the left for 30 units
- Fourth turn is the downward for 40 units
- Fifth turn is to the right(again) for 50 units

... And this he travels, everytime increasing the travel distance by 10 units.


Case 1

Input : 3
Expected Output : -20 20

Case 2

Input : 4
Expected Output : -20 -20

Case 3

Input : 5
Expected Output : 30 -20

Case 4

Input : 7
Expected Output : 90 50

*/

public class NavaRatnas
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        calculate(n);
    }

    private static void calculate(int n)
    {
        int x = 0, y = 0;

        int distance = 10;
        char c = 'R';

        while(n>0)
        {
            switch(c)
            {
                case 'R':
                    x = x + distance;
                    distance = distance + 10;
                    c = 'U';
                    break;
                case 'U':
                    y = y + distance;
                    distance = distance + 10;
                    c = 'L';
                    break;
                case 'L':
                     x = x - distance;
                     distance = distance + 10;
                     c = 'D';
                     break;
                case 'D':
                    y = y - distance;
                    distance = distance + 10;
                    c = 'A';
                    break;
                case 'A':
                    x = x + distance;
                    distance = distance + 10;
                    c = 'R';
                    break;
            }
            n --;
        }

        System.out.printf("%d %d",x,y);

    }

}
