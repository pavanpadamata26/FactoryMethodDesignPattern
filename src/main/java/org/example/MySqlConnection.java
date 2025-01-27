package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection implements ConnectionFactory{
    @Override
    public Connection createConncetion() throws SQLException {
        try{
            String url="jdbc:mysql://localhost:9909/mydb";
            String userName="root";
            String password="root";
            return DriverManager.getConnection(url,userName,password);

        }catch (SQLException e){
           throw new SQLException("Exception while creating MySql Conncetion",e);
        }

    }
}
