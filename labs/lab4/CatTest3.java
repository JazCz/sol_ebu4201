import java.awt.*;
import java.util.ArrayList;

public class CatTest3 {
    public static void main(String[] args) {
        ArrayList<Cat> lc=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Cat c=new Cat("X","short",true,Color.pink,300);
            lc.add(c);
        }//create Cat and add it to arraylist//
        System.out.println(lc.get(4).toString());//print the index 4 of the arraylist//
        System.out.println(lc.size());//print the size of the arraylist//
        lc.remove(3);//remove the third element//
        for (int i = 0; i < lc.size(); i++) {
            System.out.println(lc.get(i).toString());//print each element of the arraylist//
        }
    }
}
