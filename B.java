public class B {
    protected int data;

    public B(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new String("Value of data B is: " + Integer.toString(data));
    }
}