public class customerRecord {
        //instances
        private int customerNumber; //a unique number assigned to each customer
        private String firstName; //the customer's first name
        private String lastName; //the customer's last name
        private double balance; //the customer's balance

        //Get/set methods

        ///////////////////////////////////////////////////////////////
        //Name: setCustomerNumber
        //Behavior: set the customer's number
        //Parameter: newNum - new Customer number
        //Returns: None
        ////////////////////////////////////////////////////////////////

        public void setCustomerNumber(int newNum){this.customerNumber = newNum;}

        ///////////////////////////////////////////////////////////////
        //Name: getCustomerNumber
        //Behavior: Get the customer's number
        //Parameter: None
        //Returns: Customer number
        ////////////////////////////////////////////////////////////////

        public int getCustomerNumber(){return customerNumber;}

        ///////////////////////////////////////////////////////////////
        //Name: setFirstName
        //Behavior: set the customer's first name
        //Parameter: newFirst - new customer's first name
        //Returns: None
        ////////////////////////////////////////////////////////////////

        public void setFirstName(String newFirst){this.firstName = newFirst;}

        ///////////////////////////////////////////////////////////////
        //Name: getFirstName
        //Behavior: get the customer's first name
        //Parameter: None
        //Returns: return the customer's first name
        ////////////////////////////////////////////////////////////////

        public String getFirstName(){return firstName;}

        ///////////////////////////////////////////////////////////////
        //Name: setLastName
        //Behavior: set the customer's last name
        //Parameter: newLast - new customer's last name
        //Returns: None
        ////////////////////////////////////////////////////////////////

        public void setLastName(String newLast){this.lastName = newLast;}

        ///////////////////////////////////////////////////////////////
        //Name: getLastName
        //Behavior: get the customer's last name
        //Parameter: None
        //Returns: return the customer's last name
        ////////////////////////////////////////////////////////////////

        public String getLastName(String lastName){return this.lastName;}

        ///////////////////////////////////////////////////////////////
        //Name: setBalance
        //Behavior: set the customer's balance
        //Parameter: newBalance - new customer's balance
        //Returns: None
        ////////////////////////////////////////////////////////////////

        public void setBalance(double newBalance){this.balance = newBalance;}

        ///////////////////////////////////////////////////////////////
        //Name: getBalance
        //Behavior: get the customer's balance
        //Parameter: None
        //Returns: return the customer's balance
        ////////////////////////////////////////////////////////////////

        public double getBalance(){return balance;}

        ///////////////////////////////////////////////////////////////
        //Name: toString
        //Behavior: print the account number, first, last, and balance in String format
        //Parameter: None
        //Returns: return the String of account number, first, last, and balance
        ////////////////////////////////////////////////////////////////

        public String toString(){
            return ""+ customerNumber + "\t" + firstName + " " + lastName + "\t" + balance;
        }
    }

