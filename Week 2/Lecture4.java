public class Lecture4 
{
    public static void main (String[] args)
    {
        Student studentX = new Student(0,null);
        studentX.setGrade(99.2);
        studentX.setName("Sam");
        System.out.println(studentX.getName() + "'s grade: " + studentX.getGrade());

        Student studentY = new Student(83.8, "Becca");
        System.out.println(studentY.getName() + "'s grade: " + studentY.getGrade());

        double gradeDifference = studentX.compareGrades(studentY);

        System.out.println("The difference in grades is " + gradeDifference);

        studentX.setGrade(55.3);

        gradeDifference = studentX.compareGrades(studentY);

        System.out.println("The difference in grades is " + gradeDifference);
    }
}
