public class BankAccount{
    private String accountHolderName;
    private int accountNumber;
    private String accountCreationDate;
    private String accountBranch;
    private Address address;
   // private int balance;
    private String nominee[] = new String[2];
    private int numNomniee;

    public BankAccount(String name, int number, String date, String branchName, Address address){
        this.accountHolderName   = name;
        this.accountNumber       = number;
        this.accountBranch       = branchName;
        this.accountCreationDate = date;
        this.address             = address;
       // this.balance             = balance;
    }

    public void upDateNominee(String nomineeName){
        this.nominee[numNomniee] = numNomniee;
        numNomniee++;
        System.out.println("Your Nominee got updated"+ nomineeName);
    }

    public void checkDetails(){
        System.out.println("Account HolderName is " + this.accountHolderName);
        System.out.println("Account Number is "+ this.accountNumber);
        System.out.println("Account Creation date is"+ this.accountCreationDate);
        System.out.println("Account BranchName is "+ this.accountBranch);
        System.out.println("Account address  is"+ this.address);
    }

}

