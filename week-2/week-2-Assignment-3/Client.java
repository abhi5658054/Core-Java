public class Client{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Abhishek", 25, 50000, "Sita", 0000000);
        account1.checkBalance();
        account1.depositViaATM(50000);
        account1.depositViaChallan(50000);
        account1.updateNominee("Ram");
        
    }
}