//Brandon McDonld
// 9-10-21
// Purpose: Display a table of information relating to retail sales.

public class Retail_Sales
{
   public static void main(String[] args)
 {
    //Ascii Art
    System.out.println("                   (                              (");
    System.out.println("  *   )   )        )\\ )                           )\\ )   (");
    System.out.println("` )  /(( /(   (   (()/(    (     )               (()/(  ))\\ ");
    System.out.println(" ( )(_))\\()) ))\\   /(_))  ))\\   (    `  )         /(_))/((_)");
    System.out.println("(_(_()|(_)\\ /((_) (_))_  /((_)  )\\  '/(/(         |   |   |");
    System.out.println("|_   _| |(_|_))    |   \\(_))( _((_))((_)_\\        | | | | |");
    System.out.println("  | | | ' \\/ -_)   | |) | || | '  \\() '_ \\)       | | | | |");
    System.out.println("  |_| |_||_\\___|   |___/ \\_,_|_|_|_|| .__/        | | | | | ");
    System.out.println("                                    |_|           |_______| ");
    //asigning values
    int cost1 = 75;
    double cost2 = 0.10;
    double cost3 = 3.20;
    double cost4 = 0.5;
    double cost5 = 0.01;
    int cost6 = 2;
    int cost7 = 7;
    int cost8 = 30;
    
    int amount1 = 107;
    int amount2 = 406;
    int amount3 = 959;
    int amount4 = 790;
    int amount5 = 650;
    int amount6 = 219;
    int amount7 = 966;
    int amount8 = 210;
  
    System.out.println("\nItem Name\tCost\tAmount Sold\tTotal Earned");
    System.out.println("\nCellphone\t$"+ cost1 +"\t"+amount1 + "\t\t$"+ (cost1*amount1));
    System.out.println("\nEmpty Can\t$"+ cost2 +"\t"+amount2 + "\t\t$"+ (cost2*amount2));
    System.out.println("\nNail Polish\t$"+ cost3 +"\t"+amount3 + "\t\t$"+ (cost3*amount3));
    System.out.println("\nSports Car d\t$"+ cost4 +"\t"+amount4 + "\t\t$"+ (cost4*amount4));
    System.out.println("\nUsed Bandaid\t$"+ cost5 +"\t"+amount5 + "\t\t$"+ (cost5*amount5));
    System.out.println("\nToilet Paper\t$"+ cost6 +"\t"+amount6 + "\t\t$"+ (cost6*amount6));
    System.out.println("\nCucumber\t$"+ cost7 +"\t"+amount7 + "\t\t$"+ (cost7*amount7));
    System.out.println("\nUsed Rope\t$"+ cost8 +"\t"+amount8 + "\t\t$"+ (cost8*amount8));
    System.out.println("\n----------------------------------------------------------");
    
    double totalmoney = (cost1*amount1)+ (cost2*amount2)+ (cost3*amount3)+ (cost4*amount4)
    + (cost5*amount5)+ (cost6*amount6)+ (cost7*amount7)+(cost8*amount8); //get total money value
    
    System.out.println("\nTOTALS\t\t\t"+ (amount1+amount2+amount3+amount4+amount5+amount6
    +amount7+amount7) +"\t\t$" + totalmoney); 
                                                            //display total
    
    System.out.println("\nTotal Collected : $" + totalmoney);
    
    totalmoney = totalmoney/1000;
    int totalChopped = (int)totalmoney;
    
    System.out.print("\nI collected about " + totalChopped + " Thousand Dollars"); 
    
    
    
    
    
   
 }
}