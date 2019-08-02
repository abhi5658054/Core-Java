public class Client{
    public static void main(String agrs[]){

        RegularEmployee emp1 = new RegularEmployee("ram", 007, 25);
        emp1.display();
        emp1.applyLeave(10);

        ContractEmployee emp2 = new ContractEmployee("Sita", 007, 25);
        emp2.display();
        emp2.applyLeave(20);


    }
}