import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDriver {
    private static String USERNAME ="u0309_user";
    private static String PASSWORD ="system000";
    private static String URL ="jdbc:mysql://spl58.hosting.reg.ru:3306/u0309472_iba?autoReconnect=true&useSSL=false";


 //   public static void main(String[] args){
        Connection connection;
        Driver driver;
        {
            try {
                driver = new FabricMySQLDriver();
                DriverManager.registerDriver(driver);
                connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
                if(!connection.isClosed()){
                    System.out.println("Соединение с БД Установлено");
                }
                connection.close();
                if(connection.isClosed()){
                    System.out.println("Соединение с БД Закрыто");
                }
            } catch (SQLException e) {
                System.err.println("Не удалось загрузить класс драйвера");
            }
    }
}
//}