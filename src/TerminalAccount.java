public class TerminalAccount {
    int accountNumber;
    String firstName;
    String lastName;
    String accountAgency;
    double accountBalance;

    public void getFirstName(String newFirstName) { // Capturing first name via TerminalAccount Scanner.
        firstName = newFirstName;
    }

    public void getLastName(String newLastName) { // Capturing last name via TerminalAccount Scanner.
        lastName = newLastName;
    }

    public void catchAccount(int number) { // Capturing account number via TerminalAccount Scanner.
        accountNumber = number;
    }

    public void getAgency(String agency) { // Capturing account agency via TerminalAccount Scanner.
        accountAgency = agency;
    }

    public void getBalance(double balance) { // Balance injected (458.750)
        accountBalance = balance;
    }
}
