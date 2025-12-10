package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

    private Connection connection;

    public DatabaseConnect() {
        try {
            String url = "jdbc:postgresql://localhost:5432/Defence%20Organization";
            String user = "postgres";
            String password = "0000";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to database ✅");
        } catch (SQLException e) {
            System.out.println("Error connecting to database X, check status");
            e.printStackTrace();
            connection = null;
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

