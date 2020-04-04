public class Driver {
    public static void main(String[] args) {
        System.out.println("Account:");
        Account acc = new Account(1000000);
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("---- Deposit 200000 ----");
        acc.deposit(200000);
        System.out.println("Balance after: " + acc.getBalance());
        System.out.println("---- Withdraw 300000 ----");
        acc.withdraw(300000);
        System.out.println("Balance after: " + acc.getBalance());

        System.out.println();

        System.out.println("Customer:");
        Customer cust = new Customer("Davin", "Chandra");
        cust.setAccount(acc);
        System.out.println("First Name: " + cust.getFirstName());
        System.out.println("Last Name: " + cust.getLastName());
        System.out.println(cust.getAccount().toString());

        System.out.println();

        System.out.println("Bank:");
        Customer[] customers = new Customer[2];
        Bank bank = new Bank("Hello Bank", customers);
        System.out.println("Bank name: " + bank.getBankName());
        bank.addCustomer(cust, customers);
        bank.addCustomer("John", "Doe", customers);
        System.out.println("Number of customers: " + bank.getNumberOfCustomers());
        System.out.println("Customer index 0: " + bank.getCustomer(0));
        System.out.println("Customer index 1: " + bank.getCustomer(1));
    }
}
