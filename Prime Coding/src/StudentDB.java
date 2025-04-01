/*

In a database there are N students, the fields of the table are Name, age, grade, Gender. Your task is to return the student's Name who are greater than 20 years old and calculate the average of grades using ascii values of female candidates.

Input : 3
        AAA  21  A  Female
        BBB  22  B  Male
        CCC  24  C  Female

Output : AAA BBB CCC
         66

*/


import java.util.*;

public class StudentDB
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Student> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            String name = in.next();
            int age = in.nextInt();
            char grade = in.next().charAt(0);
            String gender = in.next();

            list.add(new Student(name,age,grade,gender));
        }

        // Printing students older than 20
        for (Student student : list)
        {
            if (student.age > 20)
            {
                System.out.print(student.name + " ");
            }
        }

        // Computing grade average using ASCII values for female students
        int sum = 0, cnt = 0;
        for (Student student : list)
        {
            if (student.gender.equalsIgnoreCase("Female"))
            {
                sum += student.grade; // Grade is a char, automatically treated as ASCII
                cnt++;
            }
        }

        // Print the computed average (without rounding)
        System.out.print("\n" + (cnt > 0 ? (sum / cnt) : 0));
    }
}

class Student
{
    String name;
    int age;
    char grade;
    String gender;

    Student(String name,int age,char grade,String gender)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }
}
