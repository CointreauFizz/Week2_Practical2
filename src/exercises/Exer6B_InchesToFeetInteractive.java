package exercises;
import javax.swing.JOptionPane;

public class Exer6B_InchesToFeetInteractive {
        public static void main(String[] args)
        {
            int InchToFeet = 12;
            String inches ;
            int Inch;
            inches = JOptionPane.showInputDialog(null, "Enter number of inches",
                    JOptionPane.INFORMATION_MESSAGE);
            Inch = Integer.parseInt(inches);
            JOptionPane.showMessageDialog(null,Inch + " inches corresponds to " +
                    (Inch / InchToFeet) + " feet and " + (Inch % InchToFeet) + " inches.");
        }
    }