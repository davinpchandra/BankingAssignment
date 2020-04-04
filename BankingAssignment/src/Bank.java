public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Bank(String bankName, Customer[] customers) {
        this.bankName = bankName;
        this.customers = customers;
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(String firstname, String lastname, Customer[] customers) {
        this.numberOfCustomers++;
        customers[this.numberOfCustomers - 1] = new Customer(firstname, lastname);
    }

    public void addCustomer(Customer customer, Customer[] customers) {
        this.numberOfCustomers++;
        customers[this.numberOfCustomers - 1] = customer;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}
