package storage;

import models.Contact;

import java.util.LinkedList;

public interface ContactData {
    LinkedList<Contact> readFile(String path);

    void writeFile(String path, LinkedList<Contact> savedList);
}
