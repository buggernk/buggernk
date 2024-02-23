/* Nafisur Khan CUNY I.D. #24181622
 * Lab professor Shu Yuan Wu on Tuesdays and Thursdays at 3:50-4:40pm. Lab section 34902.
 */

import javax.swing.*;

public class Project0 {
    public static void main(String[] args) {

        String sentance;
        int capE = 0, lowE = 0;

        while (true) { /* As long as this while loop is true the program will continue to run. */
            sentance = JOptionPane.showInputDialog(null, "Enter a sentance:"); /*
                                                                                * This line asks the user for input by
                                                                                * popping out a single window using
                                                                                * JOptionPane.showInputDialog.
                                                                                */
            if (sentance.equals("STOP")) /* The program terminates when the user types the word "STOP". */
                System.exit(0);

            for (int i = 0; i < sentance.length(); i++) { /*
                                                           * For loop is as long as the sentance, and this will help the
                                                           * .charAT method to go through each character in the sentance
                                                           * and every time add one to it until.
                                                           */
                if (sentance.charAt(i) == 'e') /*
                                                * The if statement will look for the character 'e' throughout the
                                                * sentance using the .charAT method.
                                                */
                    lowE++; /*
                             * If an upper case 'e' is present in the sentance the capE will
                             * increment by 1.
                             */
                else if (sentance.charAt(i) == 'E') /*
                                                     * The if statement will look for the character 'E' throughout the
                                                     * sentance using the .charAT method.
                                                     */
                    capE++; /*
                             * If an upper case 'e' is present in the sentance the capE will
                             * increment by 1.
                             */
            }
            JOptionPane.showMessageDialog(null,
                    "Number of upper case e's " + capE + "\nNumber of lower case e's " + lowE); /*
                                                                                                 * Shows the results of
                                                                                                 * how many upper case
                                                                                                 * e's and lowwer case
                                                                                                 * e's are pressent in
                                                                                                 * the sentance.
                                                                                                 */
            capE = 0;
            lowE = 0; /* Returns the values of the capE and lowE to 0. */
        } /* End of while loop. */

    } /* Main. */
} /* Class Procect0. */