package models;

import java.io.Serializable;
import java.time.LocalDate;

public class Contact implements Serializable {
    int phoneNumber;
    String group;
    String name;
    boolean sex; // male:true; female: false
    String address;
    LocalDate dateOfBirth;
    String email;

    public Contact() {
    }

    public Contact(int phoneNumber, String group, String name, boolean sex, String address, LocalDate dateOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
//                ", dateOfBirth=" + dateOfBirth +
//                ", email='" + email + '\'' +
                '}';
    }
}
