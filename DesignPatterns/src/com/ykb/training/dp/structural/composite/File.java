package com.ykb.training.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class File {
    private List<File> files;
    private String name;

    public File(final String name) {
        super();
        this.name = name;
    }

    public void addFile(final File nFile) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(nFile);
    }

    @Override
    public String toString() {
        return this.name + " <" + this.files + ">";
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
