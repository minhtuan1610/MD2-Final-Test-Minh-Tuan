package controllers;

import models.Contact;
import storage.ContactFromBinaryFile;

import java.time.LocalDate;
import java.util.LinkedList;

public class ContactManager {
    public static ContactFromBinaryFile contactFromBinaryFile = new ContactFromBinaryFile();
    private static String path_contact = ContactFromBinaryFile.SAVE_PATH_CONTACT;
    public static LinkedList<Contact> contactsList = contactFromBinaryFile.readFile(path_contact);
    DataInput dataInput = new DataInput();

    public ContactManager() {
    }

    public static String getPathContact() {
        return path_contact;
    }

    public void displayContactList() {
        for (Contact contactInfo : contactsList
        ) {
            System.out.println(contactInfo);
        }
    }

    public Contact setNewContactInfo() {
        System.out.println("Enter a phone number:");
        int number = dataInput.getNumberInputFromUser();
        System.out.println("Enter a group:");
        String group = dataInput.getGroupInputFromUser();
        System.out.println("Enter a full name:");
        String name = dataInput.getNameInputFromUser();
        System.out.println("Male: 0; Female: 1. Enter the corresponding number:");
        boolean sex = dataInput.getSexInputFromUser();
        System.out.println("Enter address:");
        String address = dataInput.getAddressFromUser();
        System.out.println("Enter date of birth");
        LocalDate dateOfBirth = dataInput.getDoBFromUser();
        System.out.println("Enter email:");
        String email = dataInput.getEmailFromUser();
        Contact newContact;
        newContact = new Contact(number, group, name, sex, address, dateOfBirth, email);
        return newContact;
    }

    public void addNewContact(Contact newContact) {
        contactsList.add(newContact);
    }

    public void deleteContact(Contact deletionContact) {
        contactsList.remove(deletionContact);
    }

    public void getNumberOfContact(int number) {

    }

    public void updateContact() {

    }
}
