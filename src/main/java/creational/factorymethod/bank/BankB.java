package creational.factorymethod.bank;

public class BankB implements Bank{
    @Override
    public String withdraw() {
        return "Your request is handling by Bank B";
    }
}
