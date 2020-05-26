public abstract class Account implements IBaseRate {
    // list common properties for savings and checking accounts
    private String name, ssn;
    private double balance;
    protected String accountNum;
    protected double rate;
    private static int index = 10000;

    // constructor to set base properties and initialize the account
    public Account(String name, String ssn, double deposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = deposit;

        // set account number
        index++;
        this.accountNum = setAccountNum();
        setRate();
    }

    // list common methods
    public abstract void setRate();

    private String setAccountNum() {
        String lastTwoSsn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueId = index;
        int rand = (int) ((Math.random() * 900) + 100);

        return lastTwoSsn + uniqueId + rand;
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance += accruedInterest;
        System.out.println("Accrued interest: " + accruedInterest);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing: $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing: $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void showInfo() {
        System.out.printf("Name: %s\nAccount Number: %s\nBalance: $%.2f\nRate: %.2f%%\n", name, accountNum, balance, rate);
    }
}