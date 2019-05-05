import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionUser {
    private static final String URL = "jdbc:mysql://localhost:3306/users?useSSL=false&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "admin";
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public ConnectionUser() {

        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("Hi");

        } catch (Exception E) {
            System.out.println("He");
        }

    }
}