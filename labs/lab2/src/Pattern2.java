public class Pattern2 {
    public static void main(String[] args) {
        int num= Integer.parseInt(args[0]);
        for(int i=num;i>=1;i--)
        {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
