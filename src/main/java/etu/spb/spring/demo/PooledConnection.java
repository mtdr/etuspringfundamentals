package etu.spb.spring.demo;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;
import lombok.experimental.FieldDefaults;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
public final class PooledConnection implements Connection {

    @Delegate(excludes = Closeable.class)
    Connection connection;

    @Override
    public void close() throws SQLException {
//        jhdkjhdsf
    }
}
