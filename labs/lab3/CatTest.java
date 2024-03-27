import java.awt.*;

/**
 * Title      : CatTest.java
 * Description: This class contains the test class for Cat.
 * Copyright  : Copyright (c) 2006 - 2024
 * @author  Laurissa Tokarchuk
 * @version 1.0
 * @author  Paula Fonseca
 * @version 1.4
 */
public class CatTest {
    public static void main(String[] args) {
        Cat myCat = new Cat("Napoleon","short",true,Color.ORANGE,300);
        System.out.println("Print out the name: "+myCat.getName()+" and the speed: "+myCat.getSpeed());
        myCat.sleep(5);
        int numMetres = myCat.run(10, true);
        System.out.println("I have run " + numMetres + " metres.");
        Cat cat1=new Cat("Tom", "short", true, Color.BLACK, 500);
        cat1.run(10,false);
        Cat cat2=new Cat("Moggy", "long", false, Color.WHITE,400);
        cat2.run(5,true);
    }
}