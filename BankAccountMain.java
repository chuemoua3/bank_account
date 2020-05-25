import java.util.LinkedList;
import java.util.List;

public class BankAccountMain {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();

        // read a csv file and create new accounts from it
        String file = "NewBankAccounts.csv";
        List<String[]> newAccounts = CSV.read(file);

        for (String[] element : newAccounts) {
            String name = element[0];
            String ssn = element[1];
            String accountType = element[2];
            double initDeposit = Double.parseDouble(element[3]);

            if (accountType.equalsIgnoreCase("Savings")) {
                accounts.add(new Savings(name, ssn, initDeposit));
            } else if (accountType.equalsIgnoreCase("Checking")) {
                accounts.add(new Checking(name, ssn, initDeposit));
            } else {
                System.out.println("Error reading account type.");
            }
        }
        for (Account element : accounts) {
            System.out.println("\n************");
            element.showInfo();
        }
    }
}