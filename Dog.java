import java.util.Scanner;
public class Dog
{
	public String name;
	public String breed;
	public int age;

	public void writeOutput()
	{
		System.out.println("Name: " + name);
		name = keyboard.nextLine();
		System.out.println("Breed: " + breed);
		breed = keyboard.nextLine();
		System.out.println("Age in calendar years: " + age);
		age = keyboard.nextInt();
		getAgeInHumanYears();
		System.out.println("Age in human years: " + getAgeInHumanYears());
		System.out.println();
	}

	public void otherObject()
	{
		System.out.println("Name: " + name);
		name = keyboard.nextLine();
		System.out.println("Breed: " + breed);
		breed = keyboard.nextLine();
		System.out.println("Age in calendar years: " + age);
		age = keyboard.nextInt();
		getAgeInHumanYears();
		System.out.println("Age in human years: " + getAgeInHumanYears());
		System.out.println();
	}
		
	public int getAgeInHumanYears()
	{
		int humanYears = 0;
		if (age <= 2)
		{
			humanYears = age * 11;
		}
		else
		{
			humanYears = 22 + ((age-2) * 5);
		}
		return humanYears;
	}
	
	public boolean equalsDog()
	{
	return (this.name.equalsIgnoreCase(otherObject.name)) &&
	(this.breed == otherObject.breed) &&
	(this.age == otherObject.age);
	}

	public static void main (String []args)
	{
		Dog value = new Dog ();
		value.writeOutput();
		Dog value2 = new Dog();
		value2.otherObject();
		value.equalsDog(Value2);
	}
	
	

}