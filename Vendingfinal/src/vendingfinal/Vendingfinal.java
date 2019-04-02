
package vendingfinal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Vendingfinal {

    //This is the variable to use for quantity inputet by user to buy 
    int starting_stock = crispsObject.getQuantity() + marsObject.getQuantity() + colaObject.getQuantity() + eugeniaObject.getQuantity() + waterObject.getQuantity();
    static int input_qty;
    //This is the variable for total money colected
    static double moneyCollected;


    //This is used to calculate the money inserted into machine/Credit
    public static int totalMoneyIn(int fivep, int tenp, int twentyp, int fiftyp, int onepound) {
        return ((5 * fivep) + (10 * tenp) + (20 * twentyp) + (50 * fiftyp) + (100 * onepound));
    }

    //Decimal is to only show 2 decimals when printing some value
    static DecimalFormat fmt = new DecimalFormat("#,###.##");
    //Here are the Coins objects
    static Coins fivepObject = new Coins("£ 5p", 5, 20);
    static Coins tenpObject = new Coins("£ 10p", 10, 20);
    static Coins twentypObject = new Coins("£ 20p", 20, 20);
    static Coins fiftypObject = new Coins("£ 50p", 50, 20);
    static Coins onepoundObject = new Coins("£ 1", 100, 10);

    //Items from Vending machine
    static Items marsObject = new Items("Mars Bar", 70, 10);
    static Items colaObject = new Items("Coca Cola", 100, 10);
    static Items eugeniaObject = new Items("Eugenia", 50, 10);
    static Items waterObject = new Items("Water", 85, 10);
    static Items crispsObject = new Items("Crisps", 75, 10);
    // this is the scanner for user input
    static Scanner input = new Scanner(System.in);
    //Initial total item quantity in the machine
    static int initial_total_qty = marsObject.getQuantity() + colaObject.getQuantity() + eugeniaObject.getQuantity() + waterObject.getQuantity() + crispsObject.getQuantity();

    public static void main(String[] args) {
        //there are 2 loops so when i use break to start from the begining
        while (true) {
            while (true) {

                //This will show the option menu , Prices and quantity
                System.out.println(" ___________________________________________ ");
                System.out.println("|*******************Product*****************");
                System.out.println("|Option   Item           Price         Qty");
                System.out.println("|  1      Crisps         £0.75          " + crispsObject.getQuantity());
                System.out.println("|  2      Mars Bar       £0.70          " + marsObject.getQuantity());
                System.out.println("|  3      Coca Cola      £1             " + colaObject.getQuantity());
                System.out.println("|  4      Eugenia        £0.50          " + eugeniaObject.getQuantity());
                System.out.println("|  5      Water          £0.85          " + waterObject.getQuantity());
                System.out.println("|___________________________________________");

                //Input the option for item
                
                System.out.println("Hi! Which item do you like to buy?");
                String itemName = input.next();
                if (itemName.equalsIgnoreCase("1")) {
                } else if (itemName.equalsIgnoreCase("2")) {
                } else if (itemName.equalsIgnoreCase("3")) {
                } else if (itemName.equalsIgnoreCase("4")) {
                } else if (itemName.equalsIgnoreCase("5")) {
                } else if (itemName.equalsIgnoreCase("10976")) {
                    System.out.println("Enter your password: ");
                    int password = input.nextInt();
                    if(password ==1234){
                    reporting();
                    break;}else{System.out.println("Wrong password");
                    break;}
                } else {
                    System.out.println("Wrong selection!!!");
                    break;
                }
                //Inserting qty and check if available

                System.out.println("Insert Qty you want to buy");
                input_qty = input.nextInt();
                if (itemName.equalsIgnoreCase("1") && input_qty > crispsObject.getQuantity()) {
                    System.out.println("There is not enough stock");
                    break;
                } else if (itemName.equalsIgnoreCase("2") && input_qty > marsObject.getQuantity()) {
                    System.out.println("There is not enough stock");
                    break;
                } else if (itemName.equalsIgnoreCase("3") && input_qty > colaObject.getQuantity()) {
                    System.out.println("There is not enough stock");
                    break;
                } else if (itemName.equalsIgnoreCase("4") && input_qty > eugeniaObject.getQuantity()) {
                    System.out.println("There is not enough stock");
                    break;
                } else if (itemName.equalsIgnoreCase("5") && input_qty > waterObject.getQuantity()) {
                    System.out.println("There is not enough stock");
                    break;
                }

                //This prints coins options
                System.out.println(" ______________________________________ ");
                System.out.println("|Coins    £5p   £10p   £20p   £50p   £1|");
                System.out.println("|Option    1     2      3      4      5|");
                System.out.println("|______________________________________|");
                System.out.println("Enter your coins:");
                //Adding coins code
                int sc;
                int fivep = 0;
                int tenp = 0;
                int twentyp = 0;
                int fiftyp = 0;
                int onepound = 0;
                OUTER:
                while (true) {
                    if (input.hasNextInt()) {
                        sc = input.nextInt();
                        switch (sc) {
                            case 1:
                                {
                                    fivep++;
                                    fivepObject.increaseQuantity();
                                    int credit = totalMoneyIn(fivep, tenp, twentyp, fiftyp, onepound);
                                    System.out.println("Credit:  £" + fmt.format((double) credit / 100));
                                    System.out.println("Insert more coins or press option 9 to compleate transaction");
                                    input.nextLine();
                                    break;
                                }
                            case 2:
                                {
                                    tenp++;
                                    tenpObject.increaseQuantity();
                                    int credit = totalMoneyIn(fivep, tenp, twentyp, fiftyp, onepound);
                                    System.out.println("Credit:  £" + fmt.format((double) credit / 100));
                                    System.out.println("Insert more coins or press option 9 to compleate transaction");
                                    input.nextLine();
                                    break;
                                }
                            case 3:
                                {
                                    twentyp++;
                                    twentypObject.increaseQuantity();
                                    int credit = totalMoneyIn(fivep, tenp, twentyp, fiftyp, onepound);
                                    System.out.println("Credit:  £" + fmt.format((double) credit / 100));
                                    System.out.println("Insert more coins or press option 9 to compleate transaction");
                                    input.nextLine();
                                    break;
                                }
                            case 4:
                                {
                                    fiftyp++;
                                    fiftypObject.increaseQuantity();
                                    int credit = totalMoneyIn(fivep, tenp, twentyp, fiftyp, onepound);
                                    System.out.println("Credit:  £" + fmt.format((double) credit / 100));
                                    System.out.println("Insert more coins or press option 9 to compleate transaction");
                                    input.nextLine();
                                    break;
                                }
                            case 5:
                                {
                                    onepound++;
                                    onepoundObject.increaseQuantity();
                                    int credit = totalMoneyIn(fivep, tenp, twentyp, fiftyp, onepound);
                                    System.out.println("Credit:  £" + fmt.format((double) credit / 100));
                                    System.out.println("Insert more coins or press option 9 to compleate transaction");
                                    break;
                                }
                            case 9:
                                break OUTER;
                            default:
                                System.out.println("Wrong coin inserted, please insert another coin");
                                break;
                        }
                    }
                }

                int amount = totalMoneyIn(fivep, tenp, twentyp, fiftyp, onepound);
                System.out.println("Credit: £" + fmt.format((double) amount / 100));
                //Buy Item
                if (itemName.equalsIgnoreCase("5")) {
                    buyItem(waterObject, amount);
                    break;
                } else if (itemName.equalsIgnoreCase("2")) {
                    buyItem(marsObject, amount);
                    break;
                } else if (itemName.equalsIgnoreCase("1")) {
                    buyItem(crispsObject, amount);
                    break;
                } else if (itemName.equalsIgnoreCase("4")) {
                    buyItem(eugeniaObject, amount);
                    break;
                } else if (itemName.equalsIgnoreCase("3")) {
                    buyItem(colaObject, amount);
                    break;
                } else {
                    System.out.println("Wrong selection!!!");
                }
                System.out.println();

            }
        }
    }
    //Buy Item method and change

    public static int buyItem(Items item, int amount) {

        int change = 0;
        if (amount >= item.getPrice() * input_qty) {
            item.decreaseQuantity();
            change = amount - input_qty * item.getPrice();
            moneyCollected += item.getPrice() * input_qty;
            System.out.println("Enjoy your: " + item.getName());

        } else {
            System.out.println("Sorry. Not enough money!!!! The price for " + input_qty + " " + item.getName() + " is £" + fmt.format((double) (input_qty * item.getPrice()) / 100));
            change = amount;

        }
        //this is used for calculating and giving change
        int five = 0;
        int ten = 0;
        int twenty = 0;
        int fifty = 0;
        int pounds = 0;
        System.out.println("Your change is: £" + fmt.format((double) change / 100));
        while (onepoundObject.getQty() > 0) {
            if (change >= 100) {
                onepoundObject.decreaseQuantity();
                pounds++;
                change -= 100;
            } else {
                break;
            }
        }
        while (fiftypObject.getQty() > 0) {
            if (change >= 50) {
                fiftypObject.decreaseQuantity();
                fifty++;
                change -= 50;
            } else {
                break;
            }
        }
        while (twentypObject.getQty() > 0) {
            if (change >= 20) {
                twentypObject.decreaseQuantity();
                twenty++;
                change -= 20;
            } else {
                break;
            }
        }
        while (tenpObject.getQty() > 0) {
            if (change >= 10) {

                tenpObject.decreaseQuantity();
                ten++;
                change -= 10;

            } else {
                break;
            }
        }
        while (fivepObject.getQty() > 0) {
            if (change >= 5) {
                fivepObject.decreaseQuantity();
                five++;
                change -= 5;
            } else {
                break;
            }

        }
        //This is a print of change for every coin 
        System.out.println("Pounds: " + pounds + ", 50p: " + fifty + ", 20p: " + twenty + ", 10p: " + ten + ", 5p: " + five);

        return change;
    }

    //This is the report for administrator
    public static void reporting() {
        System.out.println(" __________________________________________ ");
        System.out.println("|Total collected money: £" + fmt.format(moneyCollected / 100));
        int actual_qty = marsObject.getQuantity() + colaObject.getQuantity() 
         + eugeniaObject.getQuantity() + waterObject.getQuantity() + crispsObject.getQuantity();
        System.out.println("|Profit/Loss: £" + fmt.format(((moneyCollected - (initial_total_qty - actual_qty) * 45) / 100)));
        System.out.println("|*******Items left in machine*******");
        System.out.println("|Remaining Crisps: " + crispsObject.getQuantity());
        System.out.println("|Remaining Mars Bar: " + marsObject.getQuantity());
        System.out.println("|Remaining Coca Cola: " + colaObject.getQuantity());
        System.out.println("|Remaining Eugenia: " + eugeniaObject.getQuantity());
        System.out.println("|Remaining Water: " + waterObject.getQuantity());
        System.out.println("|**********Money in machine**********");
        System.out.println("|             £  1: " + onepoundObject.getQty());
        System.out.println("|             £50p: " + fiftypObject.getQty());
        System.out.println("|             £20p: " + twentypObject.getQty());
        System.out.println("|             £10p: " + tenpObject.getQty());
        System.out.println("|             £ 5p: " + fivepObject.getQty());
        System.out.println("|___________________________________________ ");
    }
}
