import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;

    public Account(String name, double balance){
        this.ownerName = name;
        this.balance = balance;
    }

    public void setOwnerName(String name){
        this.ownerName = name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void add(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    public void withdraw(double amount){
        int pass = 1234;
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 digit password");
        while(counter < 3){
            int userPass = scan.nextInt();
            counter++;
            if(userPass == pass){
                if(amount > 0 && balance - amount >= 0) {
                    balance = balance - amount;
                    System.out.println(balance);
                    return;
                }
            }
            else {
                if(counter == 3){
                    System.out.println("You have been blocked. Please try again 24h later.");
                }else
                    System.out.println("Please try again");
            }
        }
    }

    public double getBalance(){
        return balance;
    }
}
