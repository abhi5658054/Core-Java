public class Address{
    private int flatNumber;
    private String city;
    private String state;
    private int pinCode; 

    public Address(int flatNumber, String city, String state, int pinCode){
        this.flatNumber = flatNumber;
        this.city       = city;
        this.state      = state;
        this.pinCode    = pinCode;
    }
}