package exercises;
import javax.swing.JOptionPane;

public class Exer9B_ChiliToGoProfit {
        public static void main(String[] args)
        {
            int AdultPrice = 7;
            int ChildPrice = 4;
            double AdultProductionCost = 4.35;
            double ChildProductionCost = 3.10;
            int AdultNumber;
            int ChildNumber;
            int AdultTotal;
            int ChildTotal;
            double AdultProfit;
            double ChildProfit;
            String NumberOfAdults ;
            String NumberOfChildren ;
            NumberOfAdults = JOptionPane.showInputDialog(null, "Enter number of adult meals",
                    JOptionPane.INFORMATION_MESSAGE);
            AdultNumber = Integer.parseInt(NumberOfAdults);
            AdultTotal = AdultNumber * AdultPrice;
            AdultProfit = (AdultTotal) - (AdultNumber * AdultProductionCost);
            NumberOfChildren = JOptionPane.showInputDialog(null, "Enter number of child meals",
                    JOptionPane.INFORMATION_MESSAGE);
            ChildNumber = Integer.parseInt(NumberOfChildren);
            ChildTotal = ChildNumber * ChildPrice;
            ChildProfit = ChildTotal - (ChildNumber * ChildProductionCost);
            JOptionPane.showMessageDialog(null,"The Order was " + AdultNumber + " Adult meals at" +
                    " total of $" + (AdultTotal) + " which gives a profit of $" + String.format("%.2f", AdultProfit)
                    + "\n and " + ChildNumber + " Children meals at" +
                    " total of $" + (ChildTotal) + " which gives a profit of $" + String.format("%.2f", ChildProfit)
                    + "\n The Total Price was $" + (AdultTotal + ChildTotal) +
                    " and the total profit is $" + String.format("%.2f", (AdultProfit + ChildProfit)));
        }
    }




