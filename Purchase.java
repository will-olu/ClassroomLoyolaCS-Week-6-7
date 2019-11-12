import java.util.Scanner;

public class Purchase
{
    private String name;
    private int groupCount;//Part of price, like the 2 in 2 for $1.99.
    private double groupPrice;
                      //Part of price, like the $1.99 in 2 for $1.99.
    private int numberBought;//Total number being purchased.

    public void setName(String newName)
    {
        name = newName;
    }

    /**
     Sets price to groupCount pieces for $costForCount. E.g., 2 for $1.99.
    */

    public void setPrice(int count, double costForCount)
    {
        if ((count <= 0) || (costForCount <= 0))
        {
            System.out.println("Error: Bad parameter in setPrice.");
            System.exit(0);
        }
        else
        {
            groupCount = count;
            groupPrice = costForCount;
        }
    }

    public void setNumberBought(int number)
    {
        if (number <= 0)
        {
            System.out.println("Error: Bad parameter in setNumberBought.");
            System.exit(0);
        }
        else
            numberBought = number;
    }

    /**
     Gets price and number being purchased from Keyboard.
    */
    public void readInput()
    {
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Enter name of item you are purchasing on a separate line:");
        name = Keyboard.nextLine(); // Keyboard is a special class that only reads from the keyboard
        System.out.println("Enter price of item on one or two lines.");
        System.out.println("For example, 3 for $2.99 is entered as either");
        System.out.println("3");
        System.out.println("2.99");
        System.out.println("or: 3 2.99");
        System.out.println("Enter price of item on one or two lines, now:");
        groupCount = Keyboard.nextInt();
        groupPrice = Keyboard.nextDouble();

        while ((groupCount <= 0) || (groupPrice <= 0))
        {
            //Try again:

            System.out.println(
                   "Both numbers must be positive. Try again.");
            System.out.println("Enter price of item on one or two lines as shown above:");
            groupCount = Keyboard.nextInt();
            groupPrice = Keyboard.nextDouble();
        }

        System.out.println("Enter number of items purchased:");
        numberBought = Keyboard.nextInt();

        while (numberBought <= 0)
        {
            //Try again:

            System.out.println(
                       "Number must be positive. Try again.");
            System.out.println("Enter number of items purchased:");
            numberBought = Keyboard.nextInt();
        }
    }

    /**
     Outputs price and number being purchased to screen.
    */
    public void writeOutput()
    {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groupCount
                                 + " for $" + groupPrice);
    }

    public String getName()
    {
        return name;
    }

    public double getTotalCost()
    {
        return ((groupPrice/groupCount)*numberBought);
    }

    public double getUnitCost()
    {
        return (groupPrice/groupCount);
    }

    public int getNumberBought()
    {
        return numberBought;
    }
	
	private static Purchase getInfo(String name)
	{
		Purchase item = new Purchase();
		System.out.println("This set of input requests is for " + name);
		item.readInput();
		return item;
	}	
	
	private static Purchase createItem(
		String name, int groupCount, double groupPrice)
	{
		Purchase item = new Purchase();
		item.setName(name);
		item.setPrice(groupCount, groupPrice);
		return item;
	}
	
	private static double printAndReturnTotal(Purchase item)
	{
		System.out.println(item.getNumberBought() + " " + item.getName() + 
							" at $" + item.getUnitCost() +
							" each cost $" + item.getTotalCost());
		return item.getTotalCost();
	}
	
	private static double printAndReturnTotal(
		Purchase item, int numberBought)
	{
		item.setNumberBought(numberBought);
		System.out.println(item.getNumberBought() + " " + item.getName() + 
							" at $" + item.getUnitCost() +
							" each cost $" + item.getTotalCost());
		return item.getTotalCost();
	}
	
	public static void main(String[] args)
	{
		// original version - with literal prices and # bought
		/*
		
		Purchase oranges = createItem("oranges", 10, 2.99);
		Purchase eggs = createItem("eggs", 12, 1.69);
		Purchase apples = createItem("apples", 3, 1.00);
		Purchase watermelons = createItem("watermelons", 1, 4.39);
		Purchase bagels = createItem("bagels", 6, 3.50);
		
		double totalCost = 0;
		
		totalCost += printAndReturnTotal(oranges, 2*12);
		totalCost += printAndReturnTotal(eggs, 3*12);
		totalCost += printAndReturnTotal(apples, 20);
		totalCost += printAndReturnTotal(watermelons, 2);
		totalCost += printAndReturnTotal(bagels, 1*12);
		
		System.out.println("total cost: $" + totalCost);
		
		*/
		
		// updated version - reading information from the user
		Purchase oranges = getInfo("oranges");
		Purchase eggs = getInfo("eggs");
		Purchase apples = getInfo("apples");
		Purchase watermelons = getInfo("watermelons");
		Purchase bagels = getInfo("bagels");
		
		double totalCost = 0;
		
		totalCost += printAndReturnTotal(oranges);
		totalCost += printAndReturnTotal(eggs);
		totalCost += printAndReturnTotal(apples);
		totalCost += printAndReturnTotal(watermelons);
		totalCost += 
		
		(bagels);
		
		System.out.println("total cost: $" + totalCost);
	}		
}

//total cost = $25
//24 oranges $0.299 each $7.18
//36 eggs at $0.141 each $5.07
//20 apples $0.333 each cost $6.67
//2 watermelons $4.39 each $8.78
//12 bagels at $0.583 each cost $7.00
//Total cost: $34.69
