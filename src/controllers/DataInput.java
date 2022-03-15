package controllers;

import java.time.LocalDate;
import java.util.Scanner;

public class DataInput {
    public DataInput() {
    }

    public int getNumberInputFromUser() {
        Scanner inputNumber = new Scanner(System.in);
        int numberInput;
        numberInput = inputNumber.nextInt();
        return numberInput;
    }

    public String getGroupInputFromUser() {
        Scanner inputGroup = new Scanner(System.in);
        String groupInput;
        groupInput = inputGroup.nextLine();
        return groupInput;
    }

    public String getNameInputFromUser() {
        Scanner inputName = new Scanner(System.in);
        String nameInput;
        nameInput = inputName.nextLine();
        return nameInput;
    }

    public boolean getSexInputFromUser() {
        Scanner inputSex = new Scanner(System.in);
        int male = inputSex.nextInt();
        boolean sexInput;
        if (male == 0) {
            sexInput = true;
        } else {
            sexInput = false;
        }
        return sexInput;
    }

    public String getAddressFromUser() {
        Scanner inputAddress = new Scanner(System.in);
        String addressInput;
        addressInput = inputAddress.nextLine();
        return addressInput;
    }

    public LocalDate getDoBFromUser() {
        System.out.println("Enter day of birth:");
        Scanner inputDay = new Scanner(System.in);
        int day = inputDay.nextInt();
        System.out.println("Enter month of birth:");
        Scanner inputMonth = new Scanner(System.in);
        int month = inputMonth.nextInt();
        System.out.println("Enter year of birth");
        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();
        LocalDate doB;
        doB = LocalDate.of(year, month, day);
        return doB;
    }

    public String getEmailFromUser() {
        Scanner inputEmail = new Scanner(System.in);
        String emailInput;
        emailInput = inputEmail.nextLine();
        return emailInput;
    }

    public int getYesNoFromUser() {
        Scanner inputNumber = new Scanner(System.in);
        int numberInput;
        numberInput = inputNumber.nextInt();
        return numberInput;
    }
}
