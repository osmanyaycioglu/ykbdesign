package com.ykb.training.dp.behavioral.command;

import java.util.List;
import java.util.Scanner;

public class CommandRunnerMain {
    public static void main(final String[] args) {
        Customer customer = new Customer();
        customer.setBalance(1000);

        List<ICommand> commands = CommandsFactory.createCommandList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Şu an : " + customer.getBalance());
            int index = 1;
            for (ICommand iCommand : commands) {
                System.out.println(index + "-" + iCommand.getDesc());
            }
            int nextInt = scanner.nextInt();
            ICommand iCommand = commands.get(nextInt);
            iCommand.execute(scanner,
                             customer);
        }

    }
}
