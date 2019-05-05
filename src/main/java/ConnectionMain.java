
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionMain {
    private static final String URL = "jdbc:mysql://localhost:3306/users?useSSL=false&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD); Statement statement = connection.createStatement()) {
            statement.addBatch("insert into animal(animal_name, animal_besc) value ('batch1','desc')");
            statement.addBatch("insert into animal(animal_name, animal_besc) value ('batch2','desc')");
            statement.addBatch("insert into animal(animal_name, animal_besc) value ('batch4','desc')");
            statement.executeBatch();
            statement.clearBatch();
            if (!connection.isClosed()) {
                System.out.println("Зєднання встановлено");
            }
            connection.close();
        } catch (Exception E) {
            System.out.println("Зєднання не встановлено");
        }
    }
}
