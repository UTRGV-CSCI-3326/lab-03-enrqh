public class BankAccount{
    public static void main (String[] args){

        float bankAccount = 2175.37f;
        bankAccount -= 302.50; // Withdraw
        bankAccount += 50.03; // Deposit
        bankAccount -= bankAccount/2; // Withdraws half of current balance
        bankAccount += 20; // Deposit
        bankAccount --; // Withdraw $1
        bankAccount += bankAccount; // Deposit that doubles current balance 
        bankAccount ++; // Deposit $1

        System.out.printf("%.2f", bankAccount); // Outputs float rounded to hundreth place



    }   
}
