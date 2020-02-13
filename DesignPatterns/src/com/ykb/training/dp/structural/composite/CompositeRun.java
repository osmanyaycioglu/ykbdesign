package com.ykb.training.dp.structural.composite;

public class CompositeRun {
    public static void main(final String[] args) {
        File f1 = new File("1Level");
        File f2a = new File("2Level_a");
        File f2b = new File("2Level_b");
        f1.addFile(f2a);
        f1.addFile(f2b);
        File f3a = new File("3Level_a_a");
        File f3b = new File("3Level_a_b");
        File f3c = new File("3Level_a_c");
        f2a.addFile(f3a);
        f2a.addFile(f3b);
        f2a.addFile(f3c);
        System.out.println(f1);
    }
}
