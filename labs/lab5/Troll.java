/**
 *  Title      : Troll.java
 *  Description: This class defines Troll.
 *  @author  Zhan Cheng
 *  @version 1.0
 */
public class Troll extends Monster{
    public double SpecialAttack(){
        System.out.println("Hit with a stick.");
        return  Math.random()*15+1;
    }
    public Troll(String name, double spAttackProbability){
        super(name);
        this.spAttackProbability=spAttackProbability;
    }
    public Troll(String name){//write a constructor//
        super(name);
        if(name.equals("Saul")||name.equals("Salomon"))//modify the name//
        {
            name="Detritus";
            System.out.println("You cannot name it Saul or Salomon");
        }

    }
}
