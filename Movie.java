import java.util.Scanner;
public class Movie
{
	String movieName;
	int rating;
	int average;
	
	Scanner keyboard = new Scanner(System.in);
	public void addRating()
	{
	System.out.println("Input a rating for your movie.");
	movieName = keyboard.nextLine();
	System.out.println("From 1(Terrible) - 5(Great)");
	rating = keyboard.nextInt();
	
	if(rating > 0)
	{
		int addValue;
		int addValue = 0;
		addValue = addValue + 1;
	}
	else
	{
		System.out.println("Sadness.");
	}
	}
	
	public void getAverage()
	{
	int average;
	int numberOfRatings;
	int rating;
	System.out.println("How many people have given that rating?");
	numberOfRatings = keyboard.nextInt();
	System.out.println("What is your rating?");
	rating = keyboard.nextInt();
	System.out.println("What are other people's rating.");
	int ratings = keyboard.next.Int();
	average = rating/numberOfRatings;
	
	}
	
	public static void main(String [] args)
	{
		Movie value = Movie();
		value.addRating();
		value.getAverage();
		System.out.println(movieName + " " + getAverage);
	}
}
