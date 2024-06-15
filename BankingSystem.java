public class BankingSystem{
    public static void main(String[] args){
        BankAccount ba = new BankAccount(
            1001, "Albert", 10
        );
        System.out.println(ba.getBalance());
        ba.deposit(100);
        System.out.println(ba.getBalance());
        ba.withdraw(5);
        System.out.println(ba.getBalance());
        ba.withdraw(1000);
        System.out.println(ba.getBalance());
    }
}
// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the
// account number, account holder name, and account balance. 
// Provide public methods to allow clients to deposit and withdraw funds, 
// as well as access the account balance. 
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name
class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    BankAccount(int accountNumber, 
            String accountHolderName, 
            double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double money){
        this.balance += money;
    }
    public void withdraw(double money){
        if(balance - money < 0){
            System.out.println("You are poor");
        }else{
            this.balance -= money;
            System.out.println("Withdrawn");
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
}
