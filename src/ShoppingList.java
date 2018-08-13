import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{
    private ArrayList<String> itemNames = new ArrayList<>();

    public static void main(String[] args)
    {
        System.out.println("~*~*~*~Welcome to the My Shopping List APP!!!~*~*~*~");


        ShoppingList shoppingList = new ShoppingList();
        shoppingList.run();

    }

    private void run()
    {
        boolean exit = false;
        String itemName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one of the following commands:");
        System.out.println("Add <item name>");
        System.out.println("Print");
        System.out.println("Remove <position #>");
        System.out.println("Clear");
        System.out.println("Exit");


        do
        {

            System.out.println("Please enter a command: ");

            itemName = scanner.nextLine();
            String[] words = itemName.split(" ");
            String command = words[0];
            command = command.toUpperCase();


            switch (command)
            {
                case "ADD":
                    String itemAdded = words[1];
                    itemNames.add(itemAdded);
                    break;
                case "PRINT":
                    int index = 0;
                    for (String groceries : itemNames)
                        System.out.println("Position number: " + index++ + " : " + groceries);
                    break;
                case "REMOVE":
                    String groceries = words[1];
                    int numberToRemove = Integer.parseInt(groceries);
                    itemNames.remove(numberToRemove);
                    break;
                case "CLEAR":
                    itemNames.clear();
                    break;
                case "EXIT":
                    System.out.println("Thank you for using the My Shopping List App!");
                    exit = true;
                    break;
                default:
                    System.err.println("Invalid option selected, please try again.");


            }


        } while (!exit);


    }


}
