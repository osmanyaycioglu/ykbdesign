package com.ykb.training.dp.creational.objectpooling;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
    private BlockingQueue<Connection> connectionQueue = new ArrayBlockingQueue<>(100);

    public ConnectionPool() {
        for (int i = 0; i < 10; i++) {
            this.connectionQueue.add(new PooledConnection(new Connection(), this));
        }
    }

    public Connection getConnection() {
        try {
            Connection take = this.connectionQueue.take();
            return take;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(final PooledConnection pc) {
        System.out.println("returning to queue");
        this.connectionQueue.add(pc);
    }
}
