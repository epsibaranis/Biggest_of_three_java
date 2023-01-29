package BiggestOfThree;

public class BiggestOfThree {
    private int x,y,z,b;
    public void set() {
    	x=5;
    	y=7;
    	z=3;
    }
    public void find() {
    	b=z>(x>y?x:y)?z:(x>y?x:y);
    }
    public void display() {
    	System.out.println(b);
    }
}
