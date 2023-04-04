package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/one?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "Yjbelpespplm1");

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
