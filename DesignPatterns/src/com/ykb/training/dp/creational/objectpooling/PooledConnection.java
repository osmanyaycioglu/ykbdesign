package com.ykb.training.dp.creational.objectpooling;

public class PooledConnection extends Connection {
    private Connection connection;
    private ConnectionPool connectionPool;

    public PooledConnection(final Connection connection, final ConnectionPool connectionPool) {
        this.connection = connection;
        // TODO Auto-generated constructor stub
        this.connectionPool = connectionPool;
    }

    @Override
    public void close() {
        this.connectionPool.closeConnection(this);
    }

    @Override
    public void use() {
        this.connection.use();
    }
}
