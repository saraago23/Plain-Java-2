package objektetSeanca11b;

public class Main {
    public static void main(String[] args) {
        BankAccount user1= new BankAccount(995.23);

        System.out.println("Balanca aktuale eshte: " + user1.getBalanca());
        user1.deposit(220.5);
        System.out.println("Balanca aktuale eshte: " + user1.getBalanca());
        user1.withdraw(500);
        System.out.println("Balanca juaj eshte: " + user1.getBalanca());
    }
}
