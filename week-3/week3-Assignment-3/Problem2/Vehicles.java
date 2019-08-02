public class Vehicles {
    private int id;
    private String name;

    public Vehicles(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Vechile ID is " + this.id);
        System.out.println("Vechile name is " + this.name);
    }
}

class MileageVehicle extends Vehicles {

    int cost = 500;

    public MileageVehicle(int id, String name) {
        super(id, name);
    }
}

class LuxuryVehicle extends Vehicles {
    int cost = 10000;

    public LuxuryVehicle(int id, String name) {
        super(id, name);
    }
}

interface Drive {
    public abstract void drive();
}

abstract class DriveGateway {
    // Gate for the user to drive
    private int money;
    private String from;
    private String to;
    private int type; // 0 for

    DriveGateway(String from, String to, int type) {
        this.from = from;
        this.to = to;
        this.type = type;
        if (this.type == 0) {
            this.money = 100;
        } else if (this.type == 1) {
            this.money = 1000;
        }
    }

    abstract void travelCost();

    public int getCost() {
        return this.money;

    }

}

class Travel extends DriveGateway implements Drive {

    private String from;
    private String to;

    Travel(String from, String to, int type) {
        super(from, to, type);
        this.from = from;
        this.to = to;
    }

    public void drive() {
        System.out.println("Travelling from " + this.from + " to " + this.to);
    }

    public void travelCost() {
        int money = super.getCost();
        System.out.println("Cost of travelling is " + money);
    }
}
