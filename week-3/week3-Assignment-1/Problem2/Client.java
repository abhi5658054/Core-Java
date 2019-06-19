public class Client{

    public static void main(String args[]){
        Address address1 = new Address(007, "Allahabad", "UP", 5600012);
        SavingAccount acc1 = new SavingAccount("Abhishek", 12345, "23-26-2018", "Mathkere", address1, 30000);
        acc1.withDraw(2000);
        acc1.checkDetails();

        Address address2 = new Address(13, "Lajpat Nagar", "New Delhi", 111111);
        CurrentAccount acc2 = new CurrentAccount("Sita", 12345, "23-23-15", "Yeswantpura", address2);
        acc2.withDraw(100);
        acc2.checkDetails();
    }
}