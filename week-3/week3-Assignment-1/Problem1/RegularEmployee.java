public class RegularEmployee extends Employees{
    private int vacationDays = 20;
    private int fixedSalary  = 500000;
    private int bonus        = 5000;

    public RegularEmployee(String name,int id, int age){
        super(name, id, age);
    }

    public void applyLeave(int numDays){
        if( numDays > vacationDays){
            System.out.println(" Not possible you do not have vacationsDays left ");
        }
        else {
            this.vacationDays -= numDays;
            System.out.println(" Your Vactions days left are "+this.vacationDays);
        }
    }

    public void display(){
        super.display();
        System.out.println(" Regular Employee has a "+ this.fixedSalary +" and has bonus of "+this.bonus);
        
    }


}