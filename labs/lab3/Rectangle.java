

public class Rectangle {
    private int l;
    private int w;
    public static int CalArea(Rectangle rec)
    {
        return rec.l*rec.w;
    }
    public static void main(String[] args) {
    Rectangle rec1=new Rectangle();
    Rectangle rec2=new Rectangle();
    rec1.l=8;
    rec1.w=6;
    rec2.l=7;
    rec2.w=7;
    int a1=CalArea(rec1);
    int a2=CalArea(rec2);
    System.out.println("The area of rectangle1 is "+a1+" and the area of the rectangle2 is "+a2);
    }
}
