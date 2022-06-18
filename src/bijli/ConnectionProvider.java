package bijli;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getConnection()
    {
        try{
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/bijli","yash","qazwsx1234");
        return con;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
        }
    }