package creational.factorymethod.factory;

import creational.factorymethod.bank.Bank;
import creational.factorymethod.bank.BankA;
import creational.factorymethod.bank.BankB;

public class BankFactoryImpl implements BankFactory{
    @Override
    public Bank getBank(String bankCode) {
        if(bankCode.equals("111111")){
            return new BankA();
        }
        else if(bankCode.equals("000000")){
            return new BankB();
        }
        return null;
    }
}
