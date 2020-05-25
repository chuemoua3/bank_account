public class Savings extends Account {
    // list properties specific to savings account
    private int safetyDepoBoxId, safetyDepoBoxKey;

    // constructor to initialize settings for savings properties
    public Savings(String name, String ssn, double deposit) {
        super(name, ssn, deposit);
        accountNum = "1" + accountNum;
        setSafetyDepoBox();
    }

    // list any methods specific to savings account
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepoBox() {
        safetyDepoBoxId = (int) ((Math.random() * 900) + 100);
        safetyDepoBoxKey = (int) ((Math.random() * 9000) + 1000);
    }

    public void showInfo() {
        System.out.println("Account Type: Savings Account");
        super.showInfo();
        System.out.println("Features:\n\tSafety Deposit Box ID: " + safetyDepoBoxId + "\n\tSafety Deposit Box Key: "
                + safetyDepoBoxKey);

    }
}