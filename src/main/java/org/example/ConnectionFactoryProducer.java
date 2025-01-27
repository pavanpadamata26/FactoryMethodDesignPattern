package org.example;

public class ConnectionFactoryProducer {
    public static ConnectionFactory getFactory(String dataBaseName){
        switch (dataBaseName){
            case "MySQL":
                return new MySqlConnection();
            case "Oracle":
                return new OracleConncetionFactory();
            case "PostgreSQL":
                return new PostgreSQLConnectionFactory();
            default:
                throw new IllegalArgumentException("UnSupported DataBase Type " + dataBaseName);
        }
    }
}
