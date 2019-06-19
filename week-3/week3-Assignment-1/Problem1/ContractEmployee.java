public class ContractEmployee extends Employees{
    private int payPerHour = 100;
    private int contractDuratonDays = 60;

    public  ContractEmployee(String name, int id , int age) {
        super(name, id ,age);
    }
    public void applyLeave(int numDays){
            this.contractDuratonDays += numDays;
            System.out.println(" Your constracts days left are "+this.contractDuratonDays);
    }


    public void display(){
        super.display();
        System.out.println(" Contractor Name is "+ this.payPerHour +" contractDurationDays "+this.contractDuratonDays);

    }
}
