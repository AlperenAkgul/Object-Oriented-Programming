import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.socialSecurityNumber = 186426;
        worker1.workingHours = 8;
        worker1.name = "Alperen";
        worker1.wage = 12;

        worker1.displayInfo();
        worker1.displaySalary();

        float result;
        result = worker1.getSalary();

        System.out.printf("%n %f", result);

        Worker worker2 = new Worker();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter Worker Name: ");
        worker2.name = scan.nextLine();

        System.out.println("\nEnter Worker Wage: ");
        worker2.wage = scan.nextFloat();

        System.out.println("\nEnter Worker Working Hours: ");
        worker2.workingHours = scan.nextInt();

        System.out.println("\nEnter Worker Social Security Number: ");
        worker2.socialSecurityNumber = scan.nextInt();

        worker2.displayInfo();
        worker2.displaySalary();



    }
}