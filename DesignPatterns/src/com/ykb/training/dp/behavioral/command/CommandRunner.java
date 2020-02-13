package com.ykb.training.dp.behavioral.command;

import java.util.Scanner;

public class CommandRunner {
    public static void main(final String[] args) {
        Customer customer = new Customer();
        customer.setBalance(1000);
        while (true) {
            System.out.println("Şu an : " + customer.getBalance());
            System.out.println("1-Para çek");
            System.out.println("2-Para yatır");
            Scanner scanner = new Scanner(System.in);
            int nextInt = scanner.nextInt();
            if (nextInt == 1) {
                System.out.println("Çekeceğiniz miktar");
                int miktar = scanner.nextInt();
                customer.setBalance(customer.getBalance() - miktar);

            } else if (nextInt == 2) {
                System.out.println("Yatıracağınız miktar");
                int miktar = scanner.nextInt();
                customer.setBalance(customer.getBalance() + miktar);
            } else {
                break;
            }
        }

    }
}
