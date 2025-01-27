package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnectionFactory implements ConnectionFactory{

    @Override
    public Connection createConncetion() throws SQLException {
     try{
         String url="jdbc:postgresql://localhost:9909/mydb";
         String userName="root";
         String password="root";
         return DriverManager.getConnection(url,userName,password);

     }catch (Exception e){
         throw new SQLException("Exception while creating postgresql connection",e);
     }
    }
}
