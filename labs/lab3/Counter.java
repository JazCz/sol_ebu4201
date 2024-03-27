/**
 *Title: Counter.java
 * Description: lab3
 * @author Zhan Cheng
 */
public class Counter {
    private int count;
    private int max;

    /**This is the constructor of the Class,
     * which set count to 0 and max to 10.
     */
    public Counter(){
        count=0;
        max=10;
    }

    /** These methods provide gets and sets for each
     * private parameter in the class.
     */
    public int getCount(){
        return count;
    }
    public int getMax(){
        return max;
    }
    public void setCount(int n)
    {
        this.count=n;
    }
    public void setMax(int n)
    {
        this.max=n;
    }

    /** This method adds 2 to the count, and set count to 0,
     * when it reaches the value of max.
     */
    public void increase()
    {
        count+=2;
        if(count==max)
            count=0;
    }

    /** This method is overridden from the previous one, and
     * add n to the count.
     * @param n The number that adds to count.
     */
    public void increase(int n)
    {
        count+=n;
    }

    /**This method decreases count by 1 when the value of count
     * is positive.
     */
    public void decrease(){
        if(count>0)
            count-=1;
    }

    /** This method is overridden from the previous one, and
     * decreases count by n.
     * @param n The number that the count will decrease.
     */
    public void decrease(int n)
    {
        count-=n;
    }

    /** This method will double the value of count.
     */
    public void doubler()
    {
        count*=2;
    }

    /** This method will reset the value of count,
     * and print the information.
     */
    public void reset()
    {
        count=0;
        System.out.println("Counter Reset!");
    }

    /** This method will print the current value of count and max
     * @return null.
     */
    public String toString(){
        System.out.println("The current value of count is "+count+" and the value of max is "+max);
        return null;
    }

}
