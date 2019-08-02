/**
 * 
 */
public class Client {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 
         */
        GoodsVehicle goodsVehicle = new GoodsVehicle(001, "TATA", "ACE", 001, "Black");
        goodsVehicle.checkStatus();
        goodsVehicle.addGoods(100, 10);
        goodsVehicle.checkStatus();
        System.out.println("Is the Vehicle overloaded " + goodsVehicle.isOverLoaded());
        System.out.println(goodsVehicle.canCarry());
        goodsVehicle.transport();

        /**
         * 
         */
        LuxuryVehicle luxuryVehicle = new LuxuryVehicle(001, "BMW", "RANGEOVER", 001, "Black");
        luxuryVehicle.checkStatus();
        luxuryVehicle.addPeople(1);
        luxuryVehicle.checkStatus();
        System.out.println("Is the Vehicle overloaded " + luxuryVehicle.isOverLoaded());
        System.out.println(luxuryVehicle.canCarry());
        luxuryVehicle.transport();

        /**
         * 
         */
        PassengerVehicle passengerVehicle = new PassengerVehicle(001, "AUDI", "X-Men", 007, "Black");
        passengerVehicle.checkStatus();
        passengerVehicle.addPeople(1);
        passengerVehicle.checkStatus();
        System.out.println("Is the Vehicle overloaded " + passengerVehicle.isOverLoaded());
        System.out.println(passengerVehicle.canCarry());
        passengerVehicle.transport();

        /**
         * Racing Vehicle
         */
        RacingVehicle racingVehicle = new RacingVehicle(001, "BUGATI", "Veron", 007, "RED");
        racingVehicle.checkStatus();
        racingVehicle.addPeople(1);
        racingVehicle.checkStatus();
        System.out.println("Is the Vehicle overloaded " + racingVehicle.isOverLoaded());
        System.out.println(racingVehicle.canCarry());
        racingVehicle.transport();

    }
}