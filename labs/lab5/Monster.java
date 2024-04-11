import java.util.Random;
/**
 *  Title      : Monsters.java
 *  Description: This class defines Monsters.
 *  @author  Zhan Cheng
 *  @version 1.0
 */
public abstract class Monster {
    double spAttackProbability=0.2;
    String name;

    public Monster(String name) {
        this.name=name;
    }

    public final int attack()//this method is for attack generically//
    {
        Random random=new Random();
        int r= random.nextInt();
        int damage=0;
        if(r>0.2){
        damage=random.nextInt(4)+1;//random damage between 1 and 5//
        System.out.println(name+", of type "+this.getClass()+", attacks generically: "+damage+" points damage caused");}
        else {
            damage= (int) SpecialAttack();
            System.out.println(name+", of type "+this.getClass()+", attacks specially: "+damage+" points damage caused");
        }
        return damage;
    }
    public double SpecialAttack(){
        return 0;
    }
    public void move(int direction){//this method is for moving//
        switch(direction) {
            case 1:
                System.out.println(this.name + "is moving 1 step NORTH.");
                break;
            case 2:
                System.out.println(this.name + "is moving 1 step EAST.");
                break;
            case 3:
                System.out.println(this.name + "is moving 1 step SOUTH.");
                break;
            default:
                System.out.println(this.name + "is moving 1 step WEST.");
                break;
        }
    }
}
