package creational.factorymethod.bank;

public class BankA implements Bank{
    @Override
    public String withdraw() {
        return "Your request is handling by Bank A";
    }
}
