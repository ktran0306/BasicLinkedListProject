//A driver class that contains only a main method:
import java.util.Locale;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.lang.*;

public class Assignment4 {
    public static void main(String[] args) throws IOException {
        BufferedReader scan2 =new BufferedReader(new InputStreamReader(System.in));
        //Create customerList object
        customerList cL = new customerList();
        //prompt the user to enter a file name
        System.out.print("Input File Name: ");
        String inputFileName = scan2.readLine();
        cL.getCustomerList(inputFileName);

        while (true) {
            System.out.println(
                    "------------------------------------------------------\n" +
                            "|  a   -   add customer    \n" +
                            "|  f   -   find customer   \n" +
                            "|  d   -   delete first customer \n" +
                            "|  r   -   remove customer  \n" +
                            "|  n   -   number of customers \n" +
                            "|  q   -   quit            \n" +
                            "------------------------------------------------------");
            System.out.print("Enter command: ");
            String command = scan2.readLine();
            if (command.equalsIgnoreCase("a")) {
                customerRecord record = new customerRecord();
                System.out.print("Enter customer number: ");
                int n = Integer.parseInt(scan2.readLine());
                System.out.print("Enter customer's first name: ");
                String f = scan2.readLine();
                System.out.print("Enter customer's last name: ");
                String l = scan2.readLine();
                System.out.print("Enter customer's balance: ");
                double d = Double.parseDouble(scan2.readLine());
                record.setCustomerNumber(n);
                record.setFirstName(f);
                record.setLastName(l);
                record.setBalance(d);
                cL.enterCustomerRecord(record);
            } else if (command.equalsIgnoreCase("f")) {
                System.out.print("Enter the customer key: ");
                int keyNumber = Integer.parseInt(scan2.readLine());
                customerRecord cr = cL.getCustomerRecord(keyNumber);
                if (cr != null) {
                    System.out.println(cr.toString());
                } else {
                    System.out.println("No customer found");
                }
            }else if (command.equalsIgnoreCase("d")){
                cL.removeFirstCustomerRecord();
                System.out.println("First customer deleted");
            }else if(command.equalsIgnoreCase("r")){
                System.out.print("Enter the customer key: ");
                int keyNumber = Integer.parseInt(scan2.readLine());
                cL.removeCustomerRecord(keyNumber);
                System.out.println("Customer deleted");
            }else if(command.equalsIgnoreCase("n")){
                System.out.println("Total Customer Number: " + cL.getTotalCustomerNumber());
            }else if(command.equalsIgnoreCase("q")){
                cL.saveCustomerList(inputFileName);
                break;
            }else{
                System.out.print("Invalid command");
            }
        }
        scan2.close();
    }
}
