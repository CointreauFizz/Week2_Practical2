package exercises;
import javax.swing.JOptionPane;

public class Exer12_TicketNumber {

    public static void main(String[] args)
    {
        String Ticket_Number ;
        String Number;
        int remainder;
        String Verification_Number;
        boolean result;
        Ticket_Number = JOptionPane.showInputDialog(null, "Enter ticket number",
                JOptionPane.INFORMATION_MESSAGE);
        Number = Ticket_Number.substring(0, 5) ;
        Verification_Number = Ticket_Number.substring(5, 6);
        remainder = Integer.parseInt(Number) % 7;
        result = Integer.toString(remainder).equals (Verification_Number);
        JOptionPane.showMessageDialog(null,"The result of your ticket number is \n" +
                "result = " + result);
    }
}
