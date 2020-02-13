package com.ykb.training.dp.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyObject {
    private List<String> strings = new ArrayList<>();

    public void clear() {
        // Check
        this.strings.clear();
    }

    public static class MyIterator implements Iterator<String> {
        private MyObject myObject;
        private int index;

        public MyIterator(final MyObject myObject) {
            this.myObject = myObject;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.myObject.getStrings()
                                             .size();
        }

        @Override
        public String next() {
            return this.myObject.getStrings()
                                .get(this.index++);
        }
    }

    public Iterator<String> getIterator() {
        return new MyIterator(this);
    }

    public List<String> getStrings() {
        return new ArrayList<>(this.strings);
    }

    public void setStrings(final List<String> strings) {
        this.strings = strings;
    }

}
