package bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

/**
 * Created by vserdiuk on 2/4/17.
 */
public class Util {

    private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USERNAME="KAIZERA";
    private static final String DB_PASSWORD="";
    private  static final String DB_DRIVER="oracle.jdbc.driver.OracleDriver";




    public Connection getConnection(){


        Connection connection=null;

        try{

            Class.forName(DB_DRIVER);
            Locale.setDefault(Locale.ENGLISH);
            connection= DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            System.out.println("Connection ok");
        }
        catch (ClassNotFoundException |SQLException e){e.printStackTrace();
            System.out.println("Connection error");}

        return connection;
    }
}
