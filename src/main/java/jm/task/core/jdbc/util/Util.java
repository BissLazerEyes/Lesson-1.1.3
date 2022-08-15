package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static String HOSTNAME = "localhost";
    static String DBNAME = "users";
    static String USERNAME = "root";
    static String PASSWORD = "Lkj098hgf765";

    public static Connection getConnection() throws SQLException {
        String connectionURL = "jdbc:mysql://" + HOSTNAME + ":3306/" + DBNAME;
        Connection conn = DriverManager.getConnection(connectionURL, USERNAME, PASSWORD);
        return conn;
    }
}
