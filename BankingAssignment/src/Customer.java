public class Customer {
    private String firstname;
    private String lastname;
    private Account account;

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.account = new Account(0);
    }

    public Customer(String firstname, String lastname, Account account) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.account = account;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer [firstname = " + getFirstName() + ", lastname = " + getLastName() + ", account = " + getAccount().toString() + "]";
    }
}
