import java.util.Scanner;

public class StudentRecord
{
	private int quiz1, quiz2, quiz3, midterm, final_,  total_quiz_grade;
	private double overall_score;
	private String final_letter_grade; 


	public void setQuizScores(int q1, int q2, int q3)
	{
		quiz1 = q1;
		quiz2 = q2;
		quiz3 = q3;
		total_quiz_grade = ((quiz1 + quiz2 + quiz3)*10)/3;
	}
	public void setMidtermScore(int midscore)
	{
		midterm = midscore;
	}
	public void setFinalScore(int fscore)
	{
		final_ = fscore;
	}

	public void getLetterGrade()
	{
		overall_score = ((midterm*.35)+ (final_*.40) + (total_quiz_grade*.25));
		if(overall_score >= 90)
		{
			final_letter_grade = "A";
		}
		else if(overall_score >= 80 && overall_score < 90)
		{
			final_letter_grade = "B";
		}
		else if(overall_score >= 70 && overall_score < 80)
		{
			final_letter_grade = "C";
		}
		else if(overall_score >= 60 && overall_score < 70)
		{
			final_letter_grade = "D";
		}
		else if(overall_score >= 0 && overall_score < 60)
		{
			final_letter_grade = "F";
		}
		else
		{
			System.out.println("Error: Invalid input");
		}
		

	}
	public void recordOutput()
	{
		System.out.println("Quiz 1: "+quiz1);
		System.out.println("Quiz 2: "+quiz2);
		System.out.println("Quiz 3: "+quiz3);
		System.out.println("Midterm: "+midterm);
		System.out.println("Final: "+final_);
		System.out.printf("Numeric Grade: %.2f%n",overall_score);
		System.out.println("Letter Grade: "+final_letter_grade);

	}
	
	public boolean equals(StudentRecord otherScore)
	{
		if (overall_score == otherScore.overall_score)
		{
			return true;
		}
		else 
		{
			return false; 
		}
	}
	public String toString()
	{
		return final_letter_grade;

	}
}