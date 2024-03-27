public class CounterTest {
    public static void main(String[] args) {
        Counter cnt=new Counter();//create an object of Counter//
        cnt.setMax(10);
        cnt.setCount(0);
        cnt.increase();
        cnt.increase(2);
        cnt.toString();
        cnt.decrease();
        cnt.decrease(4);
        cnt.toString();
        cnt.doubler();
        cnt.reset();
        cnt.toString();
    }
}
