/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Brandon McDonald (replace with your name)
 * @version 09/20/21       (replace with today's date)
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

       /*double pesosSpent = 7210.25;            // Mexican Pesos spent
        *double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        *double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        *double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        */
       //Brazil
        double realSpent = 6047.63;  //Brazilian Real Spent
        double realExchangeRate = 5.238429; //1 USD = 5.238429 real
        double dollarsSpentInBrazil = 0.0; // US dollars spent in brazil
        double dollarsAfterBrazil = 0.0;  // US dollars remaining after Brazil
        //South Korea
        double wonSpent = 1970969.28;  //Korean Won Spent
        double wonExchangeRate = 1171.801; //1 USD = 1171.801 won
        double dollarsSpentInKorea = 0.0; // US dollars spent in korea
        double dollarsAfterKorea = 0.0;  // US dollars remaining after korea
        //United Kingdom
        double poundSpent = 1808.97;  //Korean Won Spent
        double poundExchangeRate = 0.723179; //1 USD = 1171.801 won
        double dollarsSpentInUK = 0.0; // US dollars spent in UK
        double dollarsAfterUK = 0.0;  // US dollars remaining after UK
       
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        dollarsSpentInBrazil = (realSpent/realExchangeRate);
        dollarsSpentInKorea = (wonSpent/wonExchangeRate);
        dollarsSpentInUK = (poundSpent/poundExchangeRate);
        dollarsAfterBrazil = (startingUsDollars-dollarsSpentInBrazil);
        dollarsAfterKorea = (dollarsAfterBrazil-dollarsSpentInKorea);
        dollarsAfterUK = (dollarsAfterKorea-dollarsSpentInUK);
        //Displaying information
        System.out.println("\nStarting USD: \t\t" + startingUsDollars);
        //Brazil       
        System.out.println("\nBrazil:\n  Real Spent: \t\t"+ realSpent + "\n  USD Equivalent: \t"
        + dollarsSpentInBrazil + "\n  USD Remaining: \t" + dollarsAfterBrazil);
        //Korea
        System.out.println("\nKorea:\n  Won Spent: \t\t"+ wonSpent + "\n  USD Equivalent: \t"
        + dollarsSpentInKorea + "\n  USD Remaining: \t" + dollarsAfterKorea);
        //UK
        System.out.println("\nUK:\n  Won Spent: \t\t"+ poundSpent + "\n  USD Equivalent: \t"
        + dollarsSpentInUK + "\n  USD Remaining: \t" + dollarsAfterUK);
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //line break
        System.out.println("\nRemaining USD: \t\t" + dollarsAfterUK + "\n");

                // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  	//cost per item of first souvenir
		int budget1 = 100;   	//budget for first item
		int totalItems1 = 0; 	//how many items can be purchased
		int fundsRemaining1 = 0;  //how much of the budget is left
                //Calcs
                totalItems1 = (int) (budget1/costItem1);
                fundsRemaining1 = (budget1%costItem1);
		//Display Info
                System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left
                //Calcs
                totalItems2 = (int) (budget2/costItem2);
                fundsRemaining2 = (budget2%costItem2);
                //Display Info
		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
