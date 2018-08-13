import java.util.Scanner;

public class Calculator
{

    private int value = 0;

    public static void main(String[] args)
    {
        System.out.println("Welcome to my calculator");

        Calculator myCalculator = new Calculator();
        myCalculator.run();
    }

    private void run()
    {

        Scanner in = new Scanner(System.in);

        boolean exit = false;

        do
        {
            System.out.println("Please enter a command");
            String commandLine = in.nextLine();

            String[] words = commandLine.split(" ");

            String command = words[0];
            command = command.toUpperCase();
            System.out.println("The command is " + command);

            switch (command)
            {
                case "ADD":
                    String enteredNumber = words[1];
                    int numberToAdd = Integer.parseInt(enteredNumber);
                    add (numberToAdd);
                    break;
                case "SUBTRACT":
                    String enteredNumberTwo = words[1];
                    int numberToSubtract = Integer.parseInt(enteredNumberTwo);
                    subtract (numberToSubtract);
                    break;
                case "EXIT":
                    System.out.println("Bye!");
                    exit = true;
                    break;
            }

            System.out.println("The new value is " + value);

        } while (!exit);


    }
    private void add(int number)
    {
        value = value + number;
    }
    private void subtract (int number)
    {
        value = value - number;
    }
}
