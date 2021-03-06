package views;

import controllers.ContactManager;
import controllers.DataInput;
import models.Contact;
import storage.ContactFromBinaryFile;

import java.util.LinkedList;
import java.util.Scanner;

public class Client {
    public static LinkedList<Contact> contactsList = ContactManager.contactsList;

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Contact contact;
        Contact contactTarget;
        ContactFromBinaryFile contactFromBinaryFile = new ContactFromBinaryFile();
        DataInput dataInput = new DataInput();
        final int MENU_CHOICE = -1;
        int choice = MENU_CHOICE;
        while (choice != 0) {
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng:");
            Scanner inputChoice = new Scanner(System.in);
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    contactManager.displayContactList();
                    break;
                case 2:
                    contact = contactManager.setNewContactInfo();
                    contactManager.addNewContact(contact);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Enter number that you want to erase:");
                    int numberTarget = dataInput.getNumberInputFromUser();
                    contactTarget = contactManager.getContactByNumber(numberTarget);
                    contactManager.deleteContact(contactTarget);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Data will be erased. Yes or No?");
                    System.out.println("Yes: 1; No: 0. Enter the corresponding number:");
                    int numberInput = dataInput.getYesNoFromUser();
                    if (numberInput == 1) {
                        contactFromBinaryFile.readFile(ContactManager.getPathContact());
                    }
                    break;
                case 7:
                    contactFromBinaryFile.writeFile(ContactManager.getPathContact(), contactsList);
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
