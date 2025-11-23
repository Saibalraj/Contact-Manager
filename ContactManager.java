import java.util.*;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return name + " - " + phone;
    }
}

public class ContactManager {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: addContact(); break;
                case 2: viewContacts(); break;
                case 3: searchContact(); break;
                case 4: return;
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        contacts.add(new Contact(name, phone));
        System.out.println("Contact added!");
    }

    private static void viewContacts() {
        System.out.println("\nAll Contacts:");
        for (Contact c : contacts) System.out.println(c);
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine().toLowerCase();

        for (Contact c : contacts) {
            if (c.name.toLowerCase().contains(name)) {
                System.out.println("Found: " + c);
                return;
            }
        }
        System.out.println("No contact found.");
    }
}
