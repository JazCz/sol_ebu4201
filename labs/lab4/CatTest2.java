import java.awt.*;

public class CatTest2 {
    public static void main(String[] args) {
        Cat[] c=new Cat[6];//create a array for 6 Cat//
        for (int i = 0; i < c.length; i++) {
            c[i]=new Cat("X","short",true,Color.pink,300);
        }//set parameters of each cat//
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].toString());
        }//print the information//
    }
}
