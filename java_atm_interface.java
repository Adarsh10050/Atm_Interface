import  java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 5688;         // let firstly PIN in 5688
    public void checkPin(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN : ");
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN){
            menu();
        }
        else{
            System.out.println("Please enter valid PIN.");
        }
    }

    public void menu(){
        System.out.println("Please enter your choice : ");
        System.out.println("1. Check A/C balance.");
        System.out.println("2. Deposit amount.");
        System.out.println("3. Withdraw amount.");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            CheckBalance();
        }
        else if (opt == 2) {
            DepositeBalance();
        }
        else if (opt == 3) {
            WithdrawBalance();
        }
        else if (opt == 4) {
            return;
        }
        else {
            System.out.println("Please enter valid choice.");
            menu();
        }
    }

    public void CheckBalance(){
        System.out.println("Balance " + Balance);
        menu();
    }

    public void WithdrawBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount for withdrawl : ");
        float amount = sc.nextFloat();

        if (amount > Balance){
            System.out.println("Insufficient balance.");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Money withdraw successful.");
        }
        menu();
    }

    public void DepositeBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount for deposite : ");
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Total balance : " + Balance);
        menu();
    }
}


public class code_soft_task_3 {
    public static void main(String[] args){

        ATM obj = new ATM();
        obj.checkPin();

    }
}
