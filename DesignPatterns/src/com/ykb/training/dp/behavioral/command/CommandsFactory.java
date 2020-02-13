package com.ykb.training.dp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandsFactory {
    public static List<ICommand> createCommandList() {
        List<ICommand> commands = new ArrayList<>();
        commands.add(new ParaCekKomutu());
        commands.add(new ParaYatirKomutu());
        return commands;
    }
}
