public class Vehicle{
    /***
     * Vehivle class base class
     */
    private int registractionNumber;
    private String make;
    private String model;
    private int modelNumber;
    private String color;
    

    /**
     * 
     * @param registractionNumber
     * @param make
     * @param model
     * @param modelNumber
     * @param color
     */
    public Vehicle(int registractionNumber, String make, String model, int modelNumber, String color){
        this.registractionNumber = registractionNumber;
        this.make                = make;
        this.model               = model;
        this.modelNumber         = modelNumber;
        this.color               = color;
    }

    public void checkStatus(){
        System.out.println("The Vechile registraction Number is  "+ this.registractionNumber);
        System.out.println("The Vechile maker is "+ this.make);
        System.out.println("The Vechile model is "+ this.model);
        System.out.println("The Vechile model number is "+ this.modelNumber);
        System.out.println("The Vechile color is "+ this.color);
    }


}


class GoodsVehicle extends Vehicle{
    private int maxNumGoods=100;
    private int numGoods;
    private int maxLoad = 100000;
    private int loads;

    /**
     * 
     * @param registractionNumber
     * @param make
     * @param model
     * @param modelNumber
     * @param color
     * @param numGoods
     * @param loads
     */
    public GoodsVehicle(int registractionNumber, String make, String model, int modelNumber, String color){
        super(registractionNumber, make, model, modelNumber, color);
    }

    public void addGoods(int numGoods, int loads){
        this.numGoods = numGoods;
        this.loads    = loads;
    }
    /**
     * 
     * @return
     */
    public boolean canCarry(){
        if(this.loads < maxLoad){
            System.out.println("The Vechile can a carrys the loads");
            return true;
        }
        else if(this.loads > maxLoad){
            System.out.print("Sorry the Vechile is overloaded");
            return false;
        }
        return true;
    }
    /**
     * 
     * @return
     */
    public boolean isOverLoaded(){
        if(this.loads > maxLoad){
            System.out.print("The Vehicle is overloaded"+ this.loads 
            +"Max Load of the Vehicle"+ this.maxLoad);
            return true;
        }
        return false;
    }
    /**
     * @ checkStatus function checks the Status of the Current Vehcile
     */
    public void checkStatus(){
        super.checkStatus();
        System.out.println("The Max Load that the Vechile can carry is "+ this.maxLoad);
        System.out.println("The Max Number of people that is can carry is "+ this.maxNumGoods);
        System.out.println("Currently the vechile is loaded with "+ this.loads);
        System.out.println("The Number of Goods that is carrried the Vechile is "+ this.numGoods);
    }
    /**
     * 
     */
    public void transport(){
            if(this.canCarry()){
                System.out.println("transporting  people :-)");
                
            }
        }
}

class PassengerVehicle extends Vehicle{
    private int maxNumPeople=50;
    private int numPeople;

  
     /**
      * 
      * @param registractionNumber
      * @param make
      * @param model
      * @param modelNumber
      * @param color
      * @param numPeople
      */
    public PassengerVehicle(int registractionNumber, String make, String model, int modelNumber, String color){
        super(registractionNumber, make, model, modelNumber, color);
    }

    /**
     * 
     * @param people
     */

    public void addPeople(int people){
        if( people > this.maxNumPeople){
            System.out.println("Can not add "+ people + " to the Vechile");
        }
        else if(people <= this.maxNumPeople){
            this.numPeople = people;
        }
    }
    /**
     * 
     * @return
     */
    public boolean canCarry(){
        if(this.numPeople < this.maxNumPeople){
            System.out.println("The Vechile can a carry the people");
            return true;
        }
        else if(this.numPeople > this.maxNumPeople){
            System.out.println("Sorry the Vechile is overloaded");
            return false;
        }
        return true;
    }
    /**
     * 
     * @return
     */
    public boolean isOverLoaded(){
        if(this.numPeople > this.maxNumPeople){
            System.out.print("The Vehicle is overloaded with "+ this.numPeople 
            +"Max Load of the Vehicle"+ this.maxNumPeople);
            return true;
        }
        return false;
    }
    /**
     * @ checkStatus
     */
    public void checkStatus(){
        super.checkStatus();
        System.out.println("The Max Load that the Vechile can carry is "+ this.maxNumPeople);
        System.out.println("Currently the vechile is loaded the "+ this.numPeople + "Peoples");
    }
    /**
     * tranporting function
     */
    public void transport(){
        if(this.canCarry()){
            System.out.println("transporting  people");
        }
    }


}

class LuxuryVehicle extends Vehicle{
    private int maxNumPeople=2;
    private int numPeople;

  
     /**
      * 
      * @param registractionNumber
      * @param make
      * @param model
      * @param modelNumber
      * @param color
      * @param numPeople
      */
    public LuxuryVehicle(int registractionNumber, String make, String model, int modelNumber, String color){
        super(registractionNumber, make, model, modelNumber, color);
    }

    /**
     * 
     * @param people
     */

    public void addPeople(int people){
        if( people > this.maxNumPeople){
            System.out.println("Can not add "+ people + " to the Vechile");
            System.out.println("Max number of people that can be accodomate "+ this.maxNumPeople);
        }
        else if(people <= this.maxNumPeople){
            this.numPeople = people;
        }
    }
    /**
     * 
     * @return
     */
    public boolean canCarry(){
        if(this.numPeople < this.maxNumPeople){
            System.out.println("The Vechile can a carry the people");
            return true;
        }
        else if(this.numPeople > this.maxNumPeople){
            System.out.println("Sorry the Vechile is overloaded");
            return false;
        }
        return true;
    }
    /**
     * 
     * @return
     */
    public boolean isOverLoaded(){
        if(this.numPeople > this.maxNumPeople){
            System.out.print("The Vehicle is overloaded with "+ this.numPeople 
            +"Max Load of the Vehicle"+ this.maxNumPeople);
            return true;
        }
        return false;
    }
    /**
     * @ checkStatus
     */
    public void checkStatus(){
        super.checkStatus();
        System.out.println("The Max Load that the Vechile can carry is "+ this.maxNumPeople);
        System.out.println("Currently the vechile is loaded the "+ this.numPeople + "Peoples");
        }
    
    public void transport(){
        if(this.canCarry()){
            System.out.println("transport people");
        }
    }
}

class RacingVehicle extends Vehicle{
    private int maxNumPeople=1;
    private int numPeople;

  
     /**
      * 
      * @param registractionNumber
      * @param make
      * @param model
      * @param modelNumber
      * @param color
      */
    public RacingVehicle(int registractionNumber, String make, String model, int modelNumber, String color){
        super(registractionNumber, make, model, modelNumber, color);
    }

    /**
     * 
     * @param people
     */

    public void addPeople(int people){
        if( people > this.maxNumPeople){
            System.out.println("Can not add "+ people + " to the Vechile");
            System.out.println("Max number of people that can be accodomate "+ this.maxNumPeople);
        }
        else if(people <= this.maxNumPeople){
            this.numPeople = people;
        }
    }
    /**
     * 
     * @return
     */
    public boolean canCarry(){
        if(this.numPeople < this.maxNumPeople){
            System.out.println("The Vechile can a carry the people");
            return true;
        }
        else if(this.numPeople > this.maxNumPeople){
            System.out.println("Sorry the Vechile is overloaded");
            return false;
        }
        return true;
    }
    /**
     * 
     * @return
     */
    public boolean isOverLoaded(){
        if(this.numPeople > this.maxNumPeople){
            System.out.print("The Vehicle is overloaded with "+ this.numPeople 
            +"Max Load of the Vehicle"+ this.maxNumPeople);
            return true;
        }
        return false;
    }
    /**
     * @ checkStatus
     */
    public void checkStatus(){
        super.checkStatus();
        System.out.println("The Max Load that the Vechile can carry is "+ this.maxNumPeople);
        System.out.println("Currently the vechile is loaded the "+ this.numPeople + "Peoples");
        }
    
    public void transport(){
        if(this.canCarry()){
            System.out.println("transporting  people");
        }
    }

}