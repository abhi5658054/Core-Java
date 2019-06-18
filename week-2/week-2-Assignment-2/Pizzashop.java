public class Pizzashop {
    private int crustthinCrustCost = 50;
    private int crustCheeseBurstCost = 100;
    private int crustClassicPan = 50;
    private int toppingCornCost = 50;
    private int toppingChickenCost = 150;
    private int toppingPaneerCost = 100;
    private int toppingPineappleCost = 75;
    private int toppingPepperoniCost = 100;
    private int sidesCokeCost = 40;
    private int sidesFriesCost = 50;
    private int sidesWedgesCost = 50;
    private int sideNachosCost = 100;
    private int pizzaCost = 0;
    private int sideOrderCost = 0;
    private int totalCost = 0;

    public Pizzashop() {
        this.pizzaCost = 150;
        System.out.println("Your just order a pizza of worth " + this.pizzaCost + " Rs");
    }

    public void chooseCrust(String crust) {
        if (crust == "Thin Crust") {
            System.out.println("Adding the Crust to your pizza ");
            this.pizzaCost = this.pizzaCost + crustthinCrustCost;
        } else if (crust == "Cheese Burst") {
            System.out.println("Adding the Cheese Burst to your pizza ");
            this.pizzaCost = this.pizzaCost + crustCheeseBurstCost;
        } else if (crust == "Classics Pan") {
            System.out.println("Addinng the Classics Pan to your pizzza");
            this.pizzaCost = this.pizzaCost + crustClassicPan;
        }

    }

    public void chooseTopping(String topping) {

        if (topping == "Corn") {
            System.out.println(" Adding Corn topping to your pizzaa ");
            this.pizzaCost = this.pizzaCost + toppingCornCost;

        } else if (topping == "Chicken") {
            System.out.println("Adding Chicken Topping to your pizzzaa  ");
            this.pizzaCost = this.pizzaCost + toppingChickenCost;
        } else if (topping == "Paneer") {
            System.out.println("Adding Paneer Topping to your pizzaa");
            this.pizzaCost = this.pizzaCost + toppingPaneerCost;
        } else if (topping == "Pepperoni") {
            System.out.println("Adding the Pepperoni Toppoing to your pizzaaa");
            this.pizzaCost = this.pizzaCost + toppingPepperoniCost;
        } else if (topping == "Pineapple") {
            System.out.println("Adding Pineapple Topping to your pizza");
            this.pizzaCost = this.pizzaCost + toppingPineappleCost;
        }
    }

    public void chooseSideOrder(String sideOrder) {
        if (sideOrder == "Coke") {
            System.out.println("Added Coke to your order ");
            this.sideOrderCost = this.sideOrderCost + sidesCokeCost;
        } else if (sideOrder == "Fries") {
            System.out.println("Added Fries to your order ");
            this.sideOrderCost = this.sideOrderCost + sidesFriesCost;
        } else if (sideOrder == "Wedges") {
            System.out.println("Added Wedges to your order");
            this.sideOrderCost = this.sideOrderCost + sidesWedgesCost;
        } else if (sideOrder == "Nachos") {
            System.out.println("Added Nachos to your order");
            this.sideOrderCost = this.sideOrderCost + sideNachosCost;
        }
    }

    public void getTotalAmount() {
        System.out.println("Calculating your Total amount");
        this.totalCost = this.totalCost + this.pizzaCost + this.sideOrderCost;
        System.out.println("Your total is Rs " + this.totalCost);
        System.out.println("Greeting Enjoy your Pizzaa Cheer !!!");
    }

    public void applyDiscount200FF() {
        System.out.println("Calculating your discount");
        int discountedCost = 20;
        System.out.println("Hah hah You got a discount of Rs " + discountedCost);
        this.totalCost = this.totalCost - discountedCost;
        // System.out.println("Your total cost is " + this.totalCost);
    }

    public void applyDiscount500FF() {
        System.out.println(" Caculating your discount ");
        int discountedCost = 50;
        System.out.println("Hah Hah You got a discount of Rs " + discountedCost);
        this.totalCost = this.totalCost - discountedCost;
        // System.out.println("Your total cost is " + this.totalCost);
    }

}