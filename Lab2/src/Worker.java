public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    void displayInfo(){
        System.out.printf("Name: %s \nSocial Security Number: %d\n", name, socialSecurityNumber);
    }

    void displaySalary(){
        float salary;
        salary = wage * workingHours;
        System.out.printf("Salary: %f", salary);
    }

    float getSalary(){
        float salary;
        salary = wage * workingHours;
        return salary;
    }
}
