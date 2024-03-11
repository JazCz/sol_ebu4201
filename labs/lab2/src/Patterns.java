public class Patterns {
    public void printPattern1(int n){
        for(int i = 1; i<= n; i++)
        {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void printPattern2(int n){
        for(int i = n; i>=1; i--)
        {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns pt=new Patterns();
        pt.printPattern1(Integer.parseInt(args[0]));
        pt.printPattern2(Integer.parseInt(args[0]));
    }
}
