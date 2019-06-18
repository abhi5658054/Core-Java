public class BankAccount{
    private String customerName;
    private int age;
    private int balance;
    private String nomineeName;
    private int panNumber;

    public BankAccount(String customerName,int age, int balance, String nomineeName, int panNumber){
        this.customerName = customerName;
        this.age = age;
        this.balance = balance;
        this.nomineeName = nomineeName;
        this.panNumber = panNumber;
    }

    public void withDrawViaSlip(int amount ){
        if( amount < this.balance){
            System.out.println("Transaction done via slip and Remaining balance is" + (this.balance - amount));
        }
        else if( amount > balance){
            System.out.println("Not enoungh balance is your account");
        }
    }

    public void withDrawViaATM(int amount){
        if( amount < this.balance){
            System.out.println("Transaction done via ATM and Remaining balance is" + (this.balance - amount));
        }
        else if( amount > balance){
            System.out.println("Not enoungh balance is your account ");
        }
    }

    public void depositViaChallan(int amount){
        System.out.println("Deposited "+ amount + "Via Challan");
        this.balance =  this.balance + amount;
        System.out.println("Updated Balance ="+ this.balance);
    }

    public void  depositViaATM(int amount){
        System.out.println("Deposited "+ amount + "Via ATM");
        this.balance = this.balance + amount;
        System.out.println("Update Balnce "+ this.balance);
        
    }

    public void checkBalance(){
        System.out.println("Hi "+this.customerName + " your balance is "+ this.balance);
    }

    public void updateNominee(String name){
        this.nomineeName = name;
        System.out.println("Your nominee is "+ this.nomineeName);
    }




}