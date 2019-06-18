public class Client {
    /**
     * This is a driver programm for Pizzashop Problems
     * 
     */

    /* Main method */
    public static void main(String args[]) {
        Pizzashop pizza1 = new Pizzashop();

        pizza1.chooseCrust("Cheese Burst");
        pizza1.chooseTopping("Paneer");
        pizza1.chooseSideOrder("Coke");
        pizza1.applyDiscount200FF();
        pizza1.getTotalAmount();

        Pizzashop pizza2 = new Pizzashop();

        pizza2.chooseCrust("Corn");
        pizza2.chooseTopping("Paneer");
        pizza2.chooseSideOrder("Coke");
        pizza2.applyDiscount200FF();
        pizza2.getTotalAmount();
    }

}