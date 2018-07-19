package exercises;
import javax.swing.JOptionPane;

public class Exer7_Initials {

        public static void main(String[] args)
        {
            char Initial_FirstName;
            char Initial_MiddleName;
            char Initial_Surname;
            String FirstName;
            String MiddleName;
            String Surname;
            FirstName = JOptionPane.showInputDialog(null, "Enter first name",
                    JOptionPane.INFORMATION_MESSAGE);
            MiddleName = JOptionPane.showInputDialog(null, "Enter Middle name",
                    JOptionPane.INFORMATION_MESSAGE);
            Surname = JOptionPane.showInputDialog(null, "Enter Surname",
                    JOptionPane.INFORMATION_MESSAGE);

            Initial_FirstName = FirstName.substring(0, 1).toUpperCase().charAt(0);
            Initial_MiddleName = MiddleName.substring(0, 1).toUpperCase().charAt(0);
            Initial_Surname = Surname.substring(0, 1).toUpperCase().charAt(0);

            JOptionPane.showMessageDialog(null, "Your Initials are " +
                    Initial_FirstName + "." + Initial_MiddleName + "." + Initial_Surname + ".");
        }
    }