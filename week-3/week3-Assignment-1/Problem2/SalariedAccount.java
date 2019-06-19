public class SalariedAccount extends SavingAccount{
    private int balance=0;
    public SalariedAccount(String name, int number, String date, String branchName, Address address, int balance){
        super(name, number, date, branchName, address, balance);
    }

    public void withDraw(int amount){
        if(amount > 25000){
            System.out.print("Invalid");
        }
        else if(amount < 25000 && amount >0){
            this.balance = this.balance - amount;
            
        }
    }

    public void checkDetails(){
        super.checkDetails();
    }

}