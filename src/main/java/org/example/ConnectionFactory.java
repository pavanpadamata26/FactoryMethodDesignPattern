package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionFactory {
    Connection createConncetion() throws SQLException;
}
