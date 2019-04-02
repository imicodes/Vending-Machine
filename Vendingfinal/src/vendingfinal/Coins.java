
package vendingfinal;


public class Coins {

    String name;
    double value;
    int qty;

    public Coins(String n, double v, int q) {
        name = n;
        value = v;
        qty = q;
    }

    public void decreaseQuantity() {
        qty = qty - 1;
    }
    public void increaseQuantity() {
        qty = qty + 1;
    }
    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getQty() {
        return qty;
    }
}
