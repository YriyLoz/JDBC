import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        ConnectionUser connectionUser = new ConnectionUser();
        String query = "select * from users";
        try {
            Statement statement = connectionUser.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                final int anInt = resultSet.getInt(1);
                System.out.println(anInt);
                User user= new User();
                user.setId(resultSet.getInt(1));
                user.setLogin(resultSet.getString(2));
                user.setPass(resultSet.getString(3));
                System.out.println(user);
            }
        } catch (SQLException E) {
            E.printStackTrace();

        }
    }
}
