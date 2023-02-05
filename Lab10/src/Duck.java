public class Duck extends Animal implements  Movable, Swimmable, Flyable{
    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void Move() {
        System.out.println("Duck moves");
    }
}
