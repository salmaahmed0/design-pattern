package creational.factorymethod.factory;

import creational.factorymethod.bank.Bank;

public interface BankFactory {
    Bank getBank(String bankCode);
}
