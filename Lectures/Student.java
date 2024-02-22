import java.util.*;

public class Student 
{
    private String name;
    private ArrayList<Double> scores;
    private double grade;

    public Student()
    {
        this.name = null;
        this.grade = 0.0;
        this.scores = new ArrayList<Double>();
    }

    public Student(String name, ArrayList<Double> scores, double grade)
    {
        if (grade > 100 || grade < 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.name = name;
            this.scores = scores;
            this.grade = grade;
        }
    }

    public double calculateGrade()
    {
        double total = 0.0;
        for (int i = 0; i < scores.size(); i++)
        {
            total += scores.get(i);
        }
        return total/scores.size();
    }

    public int compareGrade(Student other)
    {
        return (int) (this.grade - other.grade);
    }
}
//     private double grade;
//     private String name;

//     public Student()
//     {

//     }

//     public Student(double grade, String name)
//     {
//         this.grade = grade;
//         this.name = name;
//     }

//     public void setGrade(double studentGrade)
//     {
//         this.grade = studentGrade;
//     }

//     public double getGrade()
//     {
//         return this.grade;
//     }

//     public void setName(String studentName)
//     {
//         this.name = studentName;
//     }

//     public String getName()
//     {
//         return this.name;
//     }

//     public double compareGrades(Student other)
//     {
//         double gradeDiff = this.grade - other.grade;

//         if (gradeDiff > 0)
//         {
//             System.out.println("This studnet is doing better");
//         }
//         else if (gradeDiff < 0)
//         {
//             System.out.println("Other studnet is doing better");
//         }
//         else 
//         {
//             System.out.println("The students are doing the same");
//         }

//         return gradeDiff;
//     }

//     public String toString()
//     {
//         String studentData = this.name + ": " + this.grade;
//         return studentData;
//     }
// }
