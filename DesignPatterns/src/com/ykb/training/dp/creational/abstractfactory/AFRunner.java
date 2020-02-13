package com.ykb.training.dp.creational.abstractfactory;

import java.util.Scanner;

public class AFRunner {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        IComponents components = AbstractComponentFactory.createComponents(index);
        components.createButton()
                  .buttonColor();
        components.createInput()
                  .inputColor();
        components.createText()
                  .TextColor();
    }
}
