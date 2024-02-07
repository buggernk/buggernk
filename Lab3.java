
public class Lab3 {
    public static void main(String[] args) {
        float fahrenheitt = 0f, fahrenheit = 98.6f, centigrade, centigradee, centigradeee;
        centigradee = (5f / 9f) * (fahrenheit - 32f);
        System.out.println("Using no loops.");
        System.out.println(fahrenheit + " fahrenheit is " + centigradee + " centigrade.\n");

        System.out.println("Using for loop.");
        for (fahrenheit = 0.0f; fahrenheit <= 40.0f; fahrenheit += 5.0f) {
            centigrade = (5f / 9f) * (fahrenheit - 32f);
            System.out.println(fahrenheit + " fahrenheit is " + centigrade + " centigrade.");
        }

        System.out.println("\nUsing while loop.");
        while (fahrenheitt <= 40.0f) {
            centigradeee = (5f / 9f) * (fahrenheitt - 32f);
            System.out.println(fahrenheitt + " fahrenheit is " + centigradeee + " centigrade.");
            fahrenheitt += 5f;
        }
    }
}