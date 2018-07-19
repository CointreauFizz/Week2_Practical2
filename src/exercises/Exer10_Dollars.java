package exercises;
import javax.swing.JOptionPane;

public class Exer10_Dollars {
        public static void main(String[] args)
        {
            int twenties;
            int tens;
            int fives;
            int ones;
            int Dollars;
            String DollarAmount ;
            DollarAmount = JOptionPane.showInputDialog(null, "Enter amount in dollars ",
                    JOptionPane.INFORMATION_MESSAGE);
            Dollars = Integer.parseInt(DollarAmount);
            twenties = Dollars / 20 ;
            tens = (Dollars - twenties * 20) / 10;
            fives = ((Dollars - twenties * 20) - tens * 10) / 5;
            ones = (((Dollars - twenties * 20) - tens * 10) - fives * 5);

            JOptionPane.showMessageDialog(null, + Dollars + " dollars can be split into \n"
                    + twenties + " - 20s \n"
                    + tens + " - 10s \n"
                    + fives + " - 5s \n"
                    + ones + " - 1s");
        }
    }