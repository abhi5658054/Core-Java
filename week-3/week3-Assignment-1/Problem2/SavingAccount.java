public class SavingAccount extends BankAccount{

    private int balance =10000;
    public SavingAccount(String name, int number, String date, String branchName, Address address, int balance){
        super(name, number, date, branchName, address);
        this.balance = balance;
    }

    public void withDraw(int amount){
        if(amount > 25000){
            System.out.print("Invalid");
        }
        else if(amount < 25000 && amount >0){
            this.balance = this.balance - amount;
            System.out.println(this.balance);
            
        }
    }

    public void checkDetails(){
        super.checkDetails();
    }

}