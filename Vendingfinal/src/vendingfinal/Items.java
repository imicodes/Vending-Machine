
package vendingfinal;



/**
 *
 * @author Mircea
 */
public class Items {

    String name;// this is where to store the food item name
    int price;
    int quantity;

    public Items(String n, int pr, int quant) {
        name = n;
        price = pr;
        quantity = quant;
    }

    public void decreaseQuantity() {
        quantity = quantity - Vendingfinal.input_qty;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        if(quantity>0){
            quantity=quantity;}
        else{System.out.println("Out of stock");}
        return quantity;
    }

}
