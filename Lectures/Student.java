public class Student 
{
    private double grade;
    private String name;

    public Student()
    {

    }

    public Student(double grade, String name)
    {
        this.grade = grade;
        this.name = name;
    }

    public void setGrade(double studentGrade)
    {
        this.grade = studentGrade;
    }

    public double getGrade()
    {
        return this.grade;
    }

    public void setName(String studentName)
    {
        this.name = studentName;
    }

    public String getName()
    {
        return this.name;
    }

    public double compareGrades(Student other)
    {
        double gradeDiff = this.grade - other.grade;

        if (gradeDiff > 0)
        {
            System.out.println("This studnet is doing better");
        }
        else if (gradeDiff < 0)
        {
            System.out.println("Other studnet is doing better");
        }
        else 
        {
            System.out.println("The students are doing the same");
        }

        return gradeDiff;
    }

    public String toString()
    {
        String studentData = this.name + ": " + this.grade;
        return studentData;
    }
}
