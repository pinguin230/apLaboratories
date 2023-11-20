package CoffeeVan.src.main.java;

import command.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Command loadCommand = new LoadCommand();
        Command searchCommand = new SearchCommand();
        Command sortCommand = new SortCommand();

        while (true) {
            System.out.println("1. Load Coffee");
            System.out.println("2. Search Coffee");
            System.out.println("3. Sort Coffee");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loadCommand.execute();
                    break;
                case 2:
                    searchCommand.execute();
                    break;
                case 3:
                    sortCommand.execute();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
