public class DragonCharacter extends Character implements FireAttackBehaivour, AttackBehaivour{
    DragonCharacter(int id, String name){
        super(id, name);
    }

    @Override
    public void attackTo(Character character) {

        character.setHealth(20);
    }

    @Override
    void takeDamage(int amount) {
        this.setHealth(amount);
    }

    @Override
    public void fireAttackTo(Character other) {
        other.setHealth(50);
    }
}
