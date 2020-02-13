package com.ykb.training.dp.behavioral.command;

import java.util.Scanner;

public interface ICommand {
    void execute(Scanner sc, Customer c);

    String getDesc();

}
