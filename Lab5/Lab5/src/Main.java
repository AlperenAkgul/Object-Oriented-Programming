public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alperen", "Akgul", 20, "Student");
        Car c1 = new Car(p1, "Red", "Ferrari");

        c1.getOwner().showInfo();
        Person p2 = new Person("Can", "Koyuncu", 20, "Student");
        c1.changeOwner(p2);
        c1.getOwner().showInfo();

        p1.showCarsInGarage();
        p1.addCarToGarage(c1);
        Car c2 = new Car(p1, "Lamborghini", "Yellow");
        p2.addCarToGarage(c2);
        p2.showCarsInGarage();
        p1.showCarsInGarage();

    }
}