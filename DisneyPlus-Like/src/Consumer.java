public class Consumer {
    int id;
    int birthYear;
    int salary;
    String firstName;
    String lastName;

    Consumer(int id, int birthYear, int salary, String firstName, String lastName){
        this.id = id;
        this.birthYear = birthYear;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Consumer(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Consumer(){

    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
