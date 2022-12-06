package ie.atu.ie.atu;
import java.util.Scanner;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;


    public Customer() {

    }

    public Customer(String name, String address, String number, String customerNumber, boolean mailingList) {
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
}



