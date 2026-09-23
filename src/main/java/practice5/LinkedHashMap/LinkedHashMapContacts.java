package practice5.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapContacts {
    private static LinkedHashMap<String, Integer> contacts = new LinkedHashMap<>();

    public static void findContact(String name){
        if(contacts.containsKey(name)){
            System.out.println(contacts.get(name));
        }else {
            System.out.println("Контакт не найден");
        }
    }

    public static void addContact(String contactName, int phone){
        contacts.put(contactName, phone);
    }

    public static void main(String[] args) {
        addContact("Ivan", 11111);
        addContact("Ruslan", 22222);
        addContact("Victor", 33333);
        addContact("Petr", 44444);

        findContact("Victor");
        findContact("Pivo");
    }
}
