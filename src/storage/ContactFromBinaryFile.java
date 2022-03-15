package storage;

import models.Contact;

import java.io.*;
import java.util.LinkedList;

public class ContactFromBinaryFile implements ContactData {
    public static final String SAVE_PATH_CONTACT = "src/storage/contact.dat";

    @Override
    public LinkedList<Contact> readFile(String path) {
        //  Mục đích đọc file để lấy ra mảng dữ liệu đã được lưu từ trước để thao tác, nếu không lấy được thì sẽ tạo
        //  ra một mảng mới để thao tác.
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object result = null;
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return new LinkedList<>(); //   Không có file, cần một mảng để thao tác trên nó => phải return ra mảng mới
        }
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            System.err.println("Cannot read file (number error 1)");
            return new LinkedList<>();
        }
        try {
            result = ois.readObject(); //   Trả ra đối tượng có kiểu dữ liệu là Object.
        } catch (IOException e) {
            System.err.println("Cannot read file (number error 2");
            return new LinkedList<>();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found exception");
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                System.err.println("Cannot close file");
            }
        }
        return (LinkedList<Contact>) result; // Ép kiểu để có kiểu dữ liệu là LinkedList
    }

    @Override
    public void writeFile(String path, LinkedList<Contact> savedList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find the file, will create new file"); //    Khi nhảy vào this catch, dòng 69
            // không được thực hiện, fos = null. Nếu tiếp tục thực hiện các khối lệnh bên dưới mà sử dụng fos -> sẽ
            // gây ra lỗi null pointer (Lỗi thực hiện thao tác trên null) -> cần phải return.
            writeFile(path, savedList); //    Vẫn muốn thực hiện ghi file -> phải gọi lại ghi file.
            return;
        }
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            System.err.println("Something wrong, cannot write file (number error 1)");
            return;
        }
        try {
            oos.writeObject(savedList);
        } catch (IOException e) {
            System.err.println("Something wrong, cannot write file (number error 2)");
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                System.err.println("Something wrong, cannot write file (number error 3)");
            }
        }
    }
}
