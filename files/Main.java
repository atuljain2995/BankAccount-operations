import atm.Atm;
import pac1.BankAccount;
import pac1.BankTeller;

public class Main {
    public static void main(String [] args){
        BankAccount a = new BankAccount(9829,13000);
        BankAccount b = new BankAccount(1000,8620);
        BankTeller lucky = new BankTeller();
        lucky.deposit(a,150.00);
        Atm jhotwara = new Atm(9999);
        jhotwara.withdraw(a,5000);
        lucky.transfer(a,b,1000);//transfer from a to b, certain amount.
    }
}
