import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.name = "George";
        w1.socialSecurityNumber = 241512421;
        w1.wage = 20;
        w1.workingHours = 8;
        w1.displayInfo();
        w1.displaySalary();

        Scanner scan = new Scanner(System.in);
        Worker w2 = new Worker();
        w2.name = scan.next();
        w2.socialSecurityNumber = scan.nextInt();
        w2.wage = scan.nextFloat();
        w2.workingHours = scan.nextInt();
        w2.displayInfo();
        w2.displaySalary();
    }
}