package atm;

import pac1.BankAccount;

public class Atm {
    private int id;
    public Atm(int id){
        this.id = id;
    }

    public void withdraw(BankAccount account,double amount){
        boolean result = account.withdraw(amount);
        if (result){
            System.out.println("Successfully withdrawn "+amount+".");
        }
        else {
            System.out.println("ERROR!!!");
        }
    }
}
