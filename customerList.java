import java.lang.*;
import java.io.*;
import java.io.File.*;
import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.StringTokenizer;
import java.io.PipedWriter;

public class customerList {
    //instance variables
    private Node head; //this is the reference variable to the first node of linked list
    private Node tail;
    int list_size;

    //name: customerList()
    //behavior: build the list object
    //parameter: none
    //return: none
    public customerList() {
        head = null;
        tail = null;
        list_size = 0;
    }

    //name: getCustomerList
    //behavior: reads a textfile and fills the linked list with the records from the file
    //parameter: fileName - a textfile
    //returns: none
    public void getCustomerList(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                StringTokenizer st=new StringTokenizer(line);
                while(st.hasMoreTokens()) {
                    int id=Integer.parseInt(st.nextToken());
                    String fname=st.nextToken();
                    String lname=st.nextToken();
                    float bal=Float.parseFloat(st.nextToken());
                    customerRecord newRecord=new customerRecord();
                    newRecord.setCustomerNumber(id);
                    newRecord.setFirstName(fname);
                    newRecord.setLastName(lname);
                    newRecord.setBalance(bal);
                    Node newNode=new Node(newRecord);
                    if(head==null) {
                        head=newNode;
                        tail=newNode;
                        list_size++;
                    }
                    else {
                        tail.setNext(newNode);
                        tail=newNode;
                        list_size++;
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    //name: getCustomerRecord
    //behavior: returns the object corresponding to the customer with
    //          customer number. If the customer number is not in the array
    //          return null
    //parameter: customerNumber - customer's number
    //Return: returns the object corresponding to the customer with
    //        customer number. If the customer number is not in the array
    //        return null
    public customerRecord getCustomerRecord(int customerNumber) {
        Node current = head;
        customerRecord element = null;
        while(current!=null){
            element = current.getElement();
            if(element.getCustomerNumber()==customerNumber){
                return current.getElement();
            }
            current = current.getNext();
        }
        return null;
    }

    //name: enterCustomerRecord
    //behavior: inserts the customer record at the head of a singly linked list
    //parameter: new_record
    //return: none
    public void enterCustomerRecord(customerRecord new_record) {
        Node newNode = new Node(new_record);
        if (head == null) {//check whether list is empty
            head = newNode;
            tail = newNode;
            list_size++;
        } else {
            tail.setNext(newNode);//make newNode point to the first node
            tail = newNode;//make variable head point to the newNode
            list_size++;
        }
    }

    //name: removeFirstCustomerRecord
    //behavior: delete the first customer record from the linked list
    //parameter: new_record
    //return: none
    public void removeFirstCustomerRecord() {
        if (head == null) {
            System.out.println("Cannot remove due to no element indicated in the linked list");
        } else {
           head = head.getNext();
           list_size--;
        }
    }

    //name: getTotalCustomerNumber
    //behavior: counts the number of customer’s in a singly linked list
    //parameter: none
    //return: the number of customer’s in a singly linked list
    public int getTotalCustomerNumber() {
        return list_size;
    }

    //name: saveCustomerList
    //behavior: Save the information stored in the linked list to the file called filename
    //parameter: fileName
    //return: none
    public void saveCustomerList(String fileName) {
        File file = new File(fileName);
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println("Name\t\tAvg Lab Marks");
            Node current = head;
            while (current != null) {
                customerRecord element = current.getElement();
                writer.println(element);
                current = current.getNext();
            }
            writer.close();
        } catch (Exception e) {
        }
    }

    //name: removeCustomerRecord
    //behavior: – Delete the given customer record corresponding to the customer
    //            number from the linked list.
    //            If the customer number does not exist, please show the error message.
    //parameter: customerNumber
    //return: none
    public void removeCustomerRecord(int customerNumber) {
        Node cur = head;
        Node prev = null;
        customerRecord element = null;
        element = cur.getElement();

        //use for loop to find the node
        while (cur != null && element.getCustomerNumber() == customerNumber) {
            prev = cur;
            cur = cur.getNext();
            if (cur == null)
                return; //target was not found
            if (prev == null)
                head = head.getNext();//target is in the first node
            else
                //altering the previous node so that it
                //"bypasses" the deleted node
                prev.setNext(cur.getNext());
        }
    }
}








