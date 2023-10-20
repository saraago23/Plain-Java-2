package objektetSeanca11b;

public class BankAccount {
    private double balanca;

    BankAccount(double balanca) {
        this.balanca = balanca;

    }

    double deposit(double shuma) {
        return balanca+=shuma;
    }

    void withdraw(double shuma) {
        if (shuma > balanca) {
            System.err.println("Ka ndodhur nje gabim");
        }
        balanca= balanca-shuma;


    }

    double getBalanca(){
        return this.balanca;
    }

}
