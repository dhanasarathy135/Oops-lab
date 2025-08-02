import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;

    Contact(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class ContactManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = sc.nextLine();
                    contacts.add(new Contact(name));
                    System.out.println("Contact added.");
                    break;

                case 2:
                    System.out.println("Contact List:");
                    for (int i = 0; i < contacts.size(); i++) {
                        System.out.println((i + 1) + ". " + contacts.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter contact number to update: ");
                    int updateIndex = sc.nextInt() - 1;
                    sc.nextLine();
                    if (updateIndex >= 0 && updateIndex < contacts.size()) {
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        contacts.set(updateIndex, new Contact(newName));
                        System.out.println("Contact updated.");
                    } else {
                        System.out.println("Invalid contact number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter contact number to delete: ");
                    int deleteIndex = sc.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < contacts.size()) {
                        contacts.remove
