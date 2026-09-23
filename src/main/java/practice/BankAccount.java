package practice;


public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int deposit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int withdraw(int amount){
        balance = balance - amount;
        return balance;
    }

    public void printBalance(){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ivan", 1000);
        bankAccount.deposit(500);
        bankAccount.withdraw(8000);
        bankAccount.printBalance();
    }

}
