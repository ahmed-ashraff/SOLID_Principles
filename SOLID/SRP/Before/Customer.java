package SOLID.SRP.Before;

public class Customer {
    private String customerName;

    public void storeCustomer(String customerName) {
        // store customer into a database, let's assume the operation has been doing successfully
        System.out.println("The Customer " + customerName + " Saved to the database");
    }

    public void printCustomerReport(String customerName) {
        // get the customer report from database by the customerName
        System.out.println("The Customer " + customerName + "'s report is..");
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
