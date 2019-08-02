public class CurrentAccount extends BankAccount{
    private int balance=25000;
    public CurrentAccount(String name, int number, String date, String branchName, Address address){
        super(name, number, date, branchName, address);
    }

    public void withDraw(int amount){
          if(amount >0){
            this.balance = this.balance - amount;
        }
        System.out.println(this.balance);
    }

    public void checkDetails(){
        super.checkDetails();
    }
}