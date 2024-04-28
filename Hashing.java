import java.util.HashMap;

public class PhoneHashTable {
    private HashMap<String, String> phoneTable;

    public PhoneHashTable() {
        phoneTable = new HashMap<>();
    }

    // Add a phone number to the hash table
    public void addPhoneNumber(String name, String phoneNumber) {
        phoneTable.put(name, phoneNumber);
    }

    // Retrieve a phone number from the hash table
    public String getPhoneNumber(String name) {
        return phoneTable.get(name);
    }

    // Remove a phone number from the hash table
    public void removePhoneNumber(String name) {
        phoneTable.remove(name);
    }

    // Check if the hash table contains a phone number for a given name
    public boolean containsName(String name) {
        return phoneTable.containsKey(name);
    }

    // Print all phone numbers in the hash table
    public void printPhoneNumbers() {
        for (String name : phoneTable.keySet()) {
            System.out.println("Name: " + name + ", Phone Number: " + phoneTable.get(name));
        }
    }

    public static void main(String[] args) {
        PhoneHashTable phoneHashTable = new PhoneHashTable();
        phoneHashTable.addPhoneNumber("John", "123-456-7890");
        phoneHashTable.addPhoneNumber("Jane", "987-654-3210");

        // Print all phone numbers
        phoneHashTable.printPhoneNumbers();

        // Retrieve phone number by name
        String johnNumber = phoneHashTable.getPhoneNumber("John");
        System.out.println("John's Phone Number: " + johnNumber);

        // Remove a phone number
        phoneHashTable.removePhoneNumber("Jane");

        // Check if a name exists in the hash table
        boolean containsJane = phoneHashTable.containsName("Jane");
        System.out.println("Contains Jane? " + containsJane);
    }
}
