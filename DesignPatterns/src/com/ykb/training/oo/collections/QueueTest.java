package com.ykb.training.oo.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueTest {
    public static void main(final String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1000);
        String poll = queue.poll(); // Null
        try {
            String take = queue.take();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
