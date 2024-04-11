import java.util.Random;
/**
 *  Title      : Dragon.java
 *  Description: This class defines Dragon.
 *  @author  Zhan Cheng
 *  @version 1.0
 */
public class Dragon extends Monster {
    public Dragon(String name) {
        super(name);
    }
    public Dragon(String name, double spAttackProbability){
        super(name);
        this.spAttackProbability=spAttackProbability;
    }
    public double SpecialAttack(){
        System.out.println("Breath fire.");
        return  Math.random()*15+1;
    }
    public double fireAttack()//this method provides the breathing fire which will cause damage between 1 and 50//
    {
        Random random=new Random();
        double firedamage= random.nextInt(51);
        double scratchingdamage=0.7*super.attack();
        double damage=firedamage+scratchingdamage;
        System.out.println(name+", of type "+this.getClass()+", attacks breathing fire: "+damage+" points damage caused");
        return damage;
    }
}
