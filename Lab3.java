/*This lab uses for no loops, for loops, and while loops to convert fahrenheit to centigrade.*/
public class Lab3 {
    public static void main(String[] args) {
        float fahrenheitt = 0f, fahrenheit = 98.6f, centigrade, centigradee, centigradeee; /*
                                                                                            * Iniating the variables to
                                                                                            * be later used for the
                                                                                            * different calculations in
                                                                                            * the loops.
                                                                                            */
        centigradee = (5f / 9f) * (fahrenheit - 32f); /* Does the convertion of fahrenheit to centigrade. */
        System.out.println("Using no loops.");
        System.out.println(fahrenheit + " fahrenheit is " + centigradee + " centigrade.\n"); /*
                                                                                              * Prints out the results
                                                                                              * of the convertion
                                                                                              * without loops.
                                                                                              */

        System.out.println("Using for loop.");
        for (fahrenheit = 0.0f; fahrenheit <= 40.0f; fahrenheit += 5.0f) { /*
                                                                            * Implimants a for loop to convert
                                                                            * fahrenheit to centigrade in 5 steps.
                                                                            */
            centigrade = (5f / 9f) * (fahrenheit - 32f);
            System.out.println(fahrenheit + " fahrenheit is " + centigrade + " centigrade."); /*
                                                                                               * Prints out the results
                                                                                               * of the convertion using
                                                                                               * a for loop.
                                                                                               */
        }

        System.out.println("\nUsing while loop.");
        while (fahrenheitt <= 40.0f) { /* Implimants a while loop to convert fahrenheit to centigrade in 5 steps. */
            centigradeee = (5f / 9f) * (fahrenheitt - 32f);
            System.out.println(fahrenheitt + " fahrenheit is " + centigradeee + " centigrade."); /*
                                                                                                  * Prints out the
                                                                                                  * results of the
                                                                                                  * convertion using a
                                                                                                  * while loop.
                                                                                                  */
            fahrenheitt += 5f; /*
                                * Increments the fahrenheit by 5 points, "f" after 5 is signifies that it is a
                                * flot number.
                                */
        }
    }
}