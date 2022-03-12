Q2. Write a program called GradesAverage, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the grades of each of the students and saves them in an int array called grades. Your program shall check that the grade is between 0 and 100. A sample session is as follow:

output:

Enter the number of students: 3 Enter the grade for student 1: 55 Enter the grade for student 2: 108 Invalid grade, try again...
Enter the grade for student 2: 56 Enter the grade for student 3: 57 The average is: 56.0

[1:58 PM, 3/10/2022] Abirami Harman: public class GradesAverage 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of students:" );
		int numStudents = sc.nextInt();
		int i, j, sum=0, grades=0;
		for (i=0; i<numStudents; i++)
		{
			//sum = sum+grades;
			System.out.println("Enter the grade for student"+(i+1)+":" );
			grades = sc.nextInt();
			if(grades<=100)
			{
				sum= sum+grades;
			}
			else
			{
				System.out.println("Invalid grade, try again...");
				i--;
			}
		}
		//System.out.println("Sum is :" +sum);
		int average = sum / numStudents;
		System.out.println("Average is :" +average);
	}
}