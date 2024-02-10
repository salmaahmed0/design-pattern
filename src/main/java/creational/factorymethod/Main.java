package creational.factorymethod;

import creational.factorymethod.bank.Bank;
import creational.factorymethod.factory.BankFactory;
import creational.factorymethod.factory.BankFactoryImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cardNum, bankCode;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your card number: ");
        cardNum = in.next();
        bankCode = cardNum.substring(0,6);

        BankFactory bankFactory = new BankFactoryImpl();
        Bank bank = bankFactory.getBank(bankCode);

        System.out.println(bank.withdraw());
    }
}
