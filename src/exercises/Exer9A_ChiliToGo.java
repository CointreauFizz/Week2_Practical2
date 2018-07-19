package exercises;
import javax.swing.JOptionPane;

public class Exer9A_ChiliToGo {
        public static void main(String[] args)
        {
            int AdultPrice = 7;
            int ChildPrice = 4;
            int AdultNumber;
            int ChildNumber;
            String NumberOfAdults ;
            String NumberOfChildren ;
            NumberOfAdults = JOptionPane.showInputDialog(null, "Enter number of adult meals",
                    JOptionPane.INFORMATION_MESSAGE);
            AdultNumber = Integer.parseInt(NumberOfAdults);
            NumberOfChildren = JOptionPane.showInputDialog(null, "Enter number of child meals",
                    JOptionPane.INFORMATION_MESSAGE);
            ChildNumber = Integer.parseInt(NumberOfChildren);
            JOptionPane.showMessageDialog(null,"You ordered " + AdultNumber + " Adult meals at " +
                    " total of $" + (AdultNumber * AdultPrice) + "\n And you ordered " + ChildNumber + " Child meals at " +
                    " total of $" + (ChildNumber * ChildPrice) + "\n Your Total Price is $" + ((AdultNumber * AdultPrice) +
                    (ChildNumber * ChildPrice)));
        }
    }
