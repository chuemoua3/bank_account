public class Checking extends Account {
    // list the properties specific to a checking account
    private long debitNum;
    private int debitPin;

    // constructor to initialize checking account properties
    public Checking(String name, String ssn, double deposit) {
        super(name, ssn, deposit);
        accountNum = "2" + accountNum;
        setDebitCard();

    }

    // list any methods specific to the checking account
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    private void setDebitCard() {
        debitNum = (long) (Math.random() * Math.pow(10, 16));
        debitPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        System.out.println("Account Type: Checking Account");
        super.showInfo();
        System.out.println("Features: \n\tDebit Card Number: " + debitNum + "\n\tDebit Card Pin: " + debitPin);
    }
}