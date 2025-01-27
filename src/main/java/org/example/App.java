package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class App
{
    public static void main( String[] args ) throws SQLException {
        Connection connection=null;
        try {
           String dataBaseName="MySQL";
        ConnectionFactory factory = ConnectionFactoryProducer.getFactory(dataBaseName);
            connection=factory.createConncetion();
        if (connection != null) {
            System.out.println("Connection established: " + connection);
        } else {
            System.out.println("Failed to establish connection");
        }

    }catch (SQLException e){
        e.printStackTrace();
    }finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection closed successfully.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
    }
    }
}
