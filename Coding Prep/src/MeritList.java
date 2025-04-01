/*

John is mathematics teacher in one of the classes of Dale's school. The class has N students. Today is their yearly exam. And John is very strict on the answers. As per John, no one is allowed to cheat. He will find it out from the final marks of two adjacent students.

The marks of N students are mentioned in M[], with index 1 to N. All of the students are seated one behind the other based on their roll numbers, which is from 1 to N. If any two adjacent (one behind the other) students have same marks, then it will be considered as cheating, and the latter student will be removed from the merit list. The student sitting behind is considered as cheater.

At the next level is the process of re-evaluation, which is performed by another department. The re-evaluation can impact marks of K students. The re-evaluation will update their marks and then again, the 3 final merit list will be declared.

The re-evaluation will be in the format of X Y. Here 'X' is the index of the student whose marks needs to be changed from the original value to Y. Each re-evaluation is independent, and the merit list is updated after each re-evaluation.

After each re-evaluation the merit list is updated, where the cheater is filtered out if there is any. Your task is to find the maximum number of students that were part of the merit list after each re-evaluation. Only the final merit list is visible to all students.


Input :

Number of students N = 5
Respective marks M = [1,1,2,5,2]

After re-evaluation there were 2 (K=2) students whose marks are updated.

X[1] = 3(Y)
X[4] = 2(Y)

[3,1,2,5,2] -> size(5)
[3,1,2,2,2] --> Cheated --> [3,1,2] -> size(3)

Output :

For first re-evaluations answer is 5
For second re-evaluations answer is 3

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeritList
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // no. of students
        int k = in.nextInt(); // no. of re-evaluations

        List<Integer> marks = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int m = in.nextInt();
            marks.add(m);
        }

        int x,y;

        for(int i=1;i<=k;i++)
        {
           x = in.nextInt() - 1; //enter matrix position to update
           y = in.nextInt(); //re-evaluated marks

           marks.set(x,y); //updated list

            System.out.print("For "+i+"th re-evaluation answer is "+ evaluate(marks));
        }

    }

    private static int evaluate(List<Integer> marks)
    {
        List<Integer> filteredList = new ArrayList<>();

        filteredList.add(marks.get(0)); // First student is always part of the merit list

        for (int i = 1; i < marks.size(); i++)
        {
            if (!marks.get(i).equals(marks.get(i - 1)))
            {
                filteredList.add(marks.get(i));
            }
        }

        return filteredList.size();
    }


}
