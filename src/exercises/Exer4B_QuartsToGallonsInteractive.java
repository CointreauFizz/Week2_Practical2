package exercises;

import javax.swing.JOptionPane;

class Exer4B_QuartsToGallonsInteractive {
    public static void main(String[] args)
    {
        int QUARTS_IN_GALLON = 4;
        String QUARTS_FOR_PAINT_JOB;
        int quartsNeeded;
        int gallonsNeeded;
        int extraQuartsNeeded;

        QUARTS_FOR_PAINT_JOB = JOptionPane.showInputDialog(null, "Enter number of quarts needed"
                +  "for painting job", JOptionPane.INFORMATION_MESSAGE);
        quartsNeeded = Integer.parseInt(QUARTS_FOR_PAINT_JOB);
        JOptionPane.showMessageDialog(null,"A painting job that needs " + quartsNeeded +
                " quarts requires " + (quartsNeeded / QUARTS_IN_GALLON) + " gallons plus " + (quartsNeeded % QUARTS_IN_GALLON) +
                " quarts.");
    }
}


