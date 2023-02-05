import java.util.ArrayList;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    ArrayList<Car> garage = new ArrayList<Car>();

    public Person(String firstName, String lastName, int age, String job){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    public void showInfo(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(job);
    }

    public void addCarToGarage(Car c1){
        garage.add(c1);
    }

    public void showCarsInGarage(){
        if(garage.isEmpty()){
            System.out.println("Garage is Empty");
            return;
        }
        else{
            for(int i = 0; i < garage.size(); i++){
                System.out.println(this.firstName + "s Garage \n" + "Color: "+ garage.get(i).getColor() + " Model: " + garage.get(i).getModel());
            }
        }
    }

}
