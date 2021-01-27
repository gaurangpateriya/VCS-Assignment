import java.util.Scanner;

public class Main {

    static void printMenu() {
        System.out.println("\nChoose an option to continue");
        System.out.println("1. Add a node");
        System.out.println("2. Delete a node");
        System.out.println("3. Display");
        System.out.println("4. Quit");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("WELCOME TO WORLD OF LINKED LIST");
        printMenu();
        while ((option = sc.nextInt()) != 0) {
            if (option == 1) {
                System.out.print("Enter the data of node: ");
                int data = sc.nextInt();
                list.add(data);
            } else if (option == 2) {
                int data = sc.nextInt();
                System.out.print("Enter the data to delete: ");

                list.remove(data);
            } else if (option == 3) {
                list.display();
            } else if (option == 4) {
                System.out.println("Thank you for using our service.");
                break;
            } else {
                System.out.println("Chhose a valid option from the menu.");

            }
            printMenu();
        }
    }
}
