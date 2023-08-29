package SOLID.SRP.After;

public class CustomerDB {
    public void storeCustomer(String customerName) {
        // store customer into a database, let's assume the operation has been doing successfully
        System.out.println("The Customer " + customerName + " Saved to the database");
    }

    public void printCustomerReport(String customerName) {
        // get the customer report from database by the customerName
        System.out.println("The Customer " + customerName + "'s report is..");
    }
}
