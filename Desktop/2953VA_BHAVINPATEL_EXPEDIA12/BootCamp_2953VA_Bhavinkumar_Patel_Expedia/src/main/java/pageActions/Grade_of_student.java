package pageActions;

public class Grade_of_student {

	public static void main(String[] args) {
	int marks=77;
	
	if(marks>=90 && marks<=100)
	{
		System.out.println("Grade A");
	}
	else if (marks>=80 && marks<=89)
	{
		System.out.println("Grade B");
	}
	else if(marks>=70 && marks<=79)
	{
		System.out.println("Grade C");
	}
	else
	{
		System.out.println("Grade D");
	}
	}
}
