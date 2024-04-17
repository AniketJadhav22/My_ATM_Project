import java.util.Scanner;
     public class FinalAtm {
         public static void main(String[] args) {
             System.out.println("Welcome to Our ATM");
             System.out.println("Card Daldo");

             // input

             int pin = 2112;
             int totalbalance = 10000;
             int AccN = 12345;
             int mob = 10001;
             int generatedotp = 1111;
             System.out.println("Choose 1 for Deposit");
             System.out.println("Choose 2 for Withdraw");
             System.out.println("Choose 3 for Reset Pin");
             System.out.println("Choose 4 for Check Balance");
             System.out.println("Koi Yek Select Kardo:-");
             Scanner sc = new Scanner(System.in);
             int function = sc.nextInt();

             switch (function) {

                 //Deposit Money

                 case 1: {
                     System.out.println("Cash Deposit");
                     System.out.println("Enter the amount which have to be deposit");
                     int AtmDeposit = sc.nextInt();

                     System.out.println("Deposit succeed with existing balance");
                     totalbalance += AtmDeposit;
                     System.out.println(totalbalance);
                     System.out.println("Thank You!");
                 }

                 //Withdraw money

                 case 2: {
                     System.out.println("Cash withdraw");
                     System.out.println("Enter the pin: ");
                     int enteredPin = sc.nextInt();
                     if (enteredPin == 2222) {
                         System.out.println("Enter the amount: ");
                         int amount = sc.nextInt();
                         if (amount <= totalbalance) {
                             System.out.println("Cash deducted successfully");
                             totalbalance -= amount;
                         } else {
                             System.out.println("Insufficient funds");
                         }
                     } else {
                         System.out.println("Incorrect pin");
                     }
                     System.out.println("Balance in your account is: " + totalbalance);
                     System.out.println("Thank You!");
                 }

                 //Pin Reset

                 case 3: {
                     System.out.println("Reset pin");
                     System.out.println("Enter your account number: ");
                     int acc = sc.nextInt();
                     if (acc == AccN) {
                         System.out.println("Enter your mobile number: ");
                         int M = sc.nextInt();
                         if (M == mob) {
                             System.out.println("OTP is sent to your mobile number");
                             System.out.println("Enter the OTP: ");
                             int otp = sc.nextInt();
                             if (otp == generatedotp) {
                                 System.out.println("Enter the new pin: ");
                                 int newpin = sc.nextInt();
                                 pin = newpin;
                                 System.out.println("The new pin is: " + newpin);
                             } else {
                                 System.out.println("Incorrect OTP");
                             }
                         } else {
                             System.out.println("Mobile number is incorrect");
                         }
                     } else {
                         System.out.println("Account number is incorrect");
                     }
                     System.out.println("Thank You!");
                 }

                 //Check Balance

                 case 4: {
                     System.out.println("check balance");
                     System.out.println("total amount is");
                     System.out.println(totalbalance);
                     System.out.println("Thank You!");
                 }
             }
         }
     }
