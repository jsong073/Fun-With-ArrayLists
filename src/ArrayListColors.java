import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListColors {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<String>();
        boolean hasQuit = false;
        String response = "";

        //Prompts user for 3 colors, adds them to the ArrayList
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a color (" + i + "/3): ");
            colors.add(input.nextLine());
        }

        System.out.println("Color at index 1: " + colors.get(1));

        //Prompts user to continue entering colors until they type "q" or "Q"
        while (hasQuit == false) {
            System.out.print("Enter another color or type \"q\" to quit: ");
            response = input.nextLine();
            if (response.equalsIgnoreCase("q")) {
                hasQuit = true;
            } else {
                colors.add(response);
            }
        }
        System.out.println(colors.toString());
    }
}
