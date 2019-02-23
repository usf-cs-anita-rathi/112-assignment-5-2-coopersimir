import java.util.Scanner;
public class StudentRecordDemo
{
	public static void main(String[]args)
	{
		StudentRecord student1;
		student1 = new StudentRecord();
		student1.setQuizScores(10, 7, 9);
		student1.setMidtermScore(85);
		student1.setFinalScore(90);
		student1.getLetterGrade(); //computes numeric score and determines letter grade
		student1.recordOutput(); //displays student's record
	}
}