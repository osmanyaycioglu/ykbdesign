package com.ykb.training.dp.creational.objectpooling;

public class PoolConRun {
    public static void main(final String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection = connectionPool.getConnection();
        connection.use();
        connection.close();

        Connection connection2 = new Connection();
        connection2.use();
        connection2.close();
    }
}
