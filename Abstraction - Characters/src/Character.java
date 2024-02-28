public abstract class Character {
    int id;
    String name;
    private int health;
    private int score;

    Character(int id, String name){
        this.health = 100;
        this.id = id;
        this.name = name;
        this.score = 0;
    }

    abstract void takeDamage(int amount);
    void defense(){
        this.health += 5;
    }

    void setHealth(int amount){
        this.health -= amount;
    }

    void makeScore(){
        this.score++;
    }
}
