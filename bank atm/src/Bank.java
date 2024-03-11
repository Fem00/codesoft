import javax.swing.*;

public class Bank {
    private  static double Balance=100000;
    public  Bank(double initialbalance){

        this.Balance = initialbalance;
    }

    public static double withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
           // System.out.println("Withdrawal successful. New balance: $" + Balance);
            JOptionPane.showMessageDialog(null,"Withdrawal successful. New balance : $ " +Balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
        return Balance;
    }
    public static double deposit(double amount) {

        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposit successful. New balance: $" + Balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return  Balance;
    }
    public static double getBalance() {

        return Balance;
    }
}


