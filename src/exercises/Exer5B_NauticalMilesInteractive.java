package exercises;
import javax.swing.JOptionPane;

public class Exer5B_NauticalMilesInteractive {
        public static void main(String[] args)
        {
            double kilometers = 1.852;
            double miles = 1.150779;
            String NauticalMiles ;
            int nautical;
            NauticalMiles = JOptionPane.showInputDialog(null, "Enter number of miles",
                    JOptionPane.INFORMATION_MESSAGE);
            nautical = Integer.parseInt(NauticalMiles);
            JOptionPane.showMessageDialog(null,nautical + " nautical miles corresponds to " +
                    (nautical * kilometers) + " kilometers and " + (nautical * miles) + " miles");
        }

    }
