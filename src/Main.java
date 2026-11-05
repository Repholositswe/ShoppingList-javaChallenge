import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] items = new String[5];

        System.out.println("How many items do you want to buy? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < count; i++ ) {
            System.out.println("Enter item " + (i + 1) + ":");
            items [i] = sc.nextLine();
        }
        System.out.println("\n---- SHOPPING LIST ----");for (int i = 0; i < count; i++) {

            System.out.println((i + 1) + ". " + items[i]);

        }

        System.out.println("Total items: " + count);

        System.out.println("\nWhat item would you like to search for?");

        String searchItem = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (items[i].equalsIgnoreCase(searchItem)) {

                found = true;
                break;

            }

        }
        if (found) {

            System.out.println(searchItem + " was found in your shopping list!");

        } else {

            System.out.println(searchItem + " was NOT found in your shopping list.");

        }

        sc.close();
    }}