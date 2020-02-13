package com.ykb.training.dp.behavioral.command;

import java.util.Scanner;

public class ParaCekKomutu implements ICommand {

    @Override
    public void execute(final Scanner scanner, final Customer customer) {
        System.out.println("Çekeceğiniz miktar");
        int miktar = scanner.nextInt();
        customer.setBalance(customer.getBalance() - miktar);

    }

    @Override
    public String getDesc() {
        return "Para Çekme";
    }

}
