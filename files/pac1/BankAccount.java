package pac1;

public class BankAccount {
    private int balance;
    public int number;

    public BankAccount(int number,int balance)
    {
        this.balance = balance;
        this.number = number;
    }

    protected boolean deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if (amount > 0 && balance >= amount)
        {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected double getBalance()
    {
        return this.balance;
    }

}
