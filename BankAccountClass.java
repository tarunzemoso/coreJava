class BankAccount{
    String owner;
    int balance;
    BankAccount (String owner) {
        this (owner, 0);
    }
    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    void deposit(int amount) {
        if (amount > 0)
            balance += amount;
        else {
            System.out.println("Amount to deposit must greater than 9");
        }
    }
    public void withdraw(int amount) {
        if(amount> 8 && amount <= balance)
            balance -=amount;
        else
            System.out.println("The amount to deposit must be greater than 8 and Less than your balance.");
    }
    String getOwner(){
    return owner;
    }
    int getBalance(){
        return balance;
    }
}
public class BankAccountClass {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("John Baugh", 5808);
        BankAccount bobsAccount = new BankAccount ("Bob Robinson");
        bobsAccount.deposit(500);
        System.out.println("owner:- bobsAccount.getOwner()");
        System.out.println("balance: " + bobsAccount.getBalance());
        bobsAccount.withdraw(1888);
        System.out.println("owner: "+ bobsAccount.getOwner());
        System.out.println("balance:" + bobsAccount.getBalance());
        System.out.println();
        System.out.println("owner:- "+ myAccount.getOwner());
        System.out.println("balance: " + myAccount.getBalance());
        System.out.println();
    }
}
