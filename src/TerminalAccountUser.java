import java.util.Scanner;
public class TerminalAccountUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TerminalAccount account = new TerminalAccount();

        // Model of brazilian accounts: agency, account number, full name.
        System.out.println("Cadastro de serviços: Banco Digital");
        System.out.println("Insira o seu primeiro nome");
        account.getFirstName(scan.next()); // Capturing user first name(String) via Scanner.

        System.out.println("Insira o seu último nome");
        account.getLastName(scan.next()); // Capturing user last name(String) via Scanner.

        System.out.println("Insira o número da sua agência");
        account.getAgency(scan.next()); // Capturing agency(String) number with Scanner.

        System.out.println("Insira o número da sua conta");
        account.catchAccount(scan.nextInt()); // Capturing agency number(int) via Scanner.
        account.getBalance(458.75); // Injecting account balance(double).

        System.out.println("Olá ".concat(account.firstName).concat(" ").concat(account.lastName).concat(", obrigado por cadastrar sua conta para uso do banco digital, sua agência é ".concat(account.accountAgency).concat(" conta de número: ".concat(String.valueOf(account.accountNumber)).concat(". O Sr(a), possui R$ ".concat(String.valueOf(account.accountBalance)).concat(" de saldo para uso dos nossos serviços.")))));
        // Showing informations of variables captured via Scanner in TerminalAccount.
    }
}
